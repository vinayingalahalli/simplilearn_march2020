package eg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {

	public static void main(String[] args) {
		
		Connection connection=null;
		try {
			//Step1
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loaded");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String username="simplilearn";
			String password="simplilearn";
			//Step2
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful");
			//Step3
			Statement statement=connection.createStatement();
			String sql="select id,name,dob,age,contact from player order by age desc";
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed");
			//Step5
			while(resultSet.next()) {
				System.out.print("Id = "+resultSet.getInt("id"));
				System.out.print(" Name = "+resultSet.getString("name"));
				System.out.print(" Age = "+resultSet.getInt("age"));
				System.out.print(" Dob = "+resultSet.getDate("dob"));
				System.out.println(" Contact = "+resultSet.getLong("contact"));
			}
			System.out.println("Records Proccessed");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
