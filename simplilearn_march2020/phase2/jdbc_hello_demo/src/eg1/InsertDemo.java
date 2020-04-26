package eg1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.dbutil.OracleConnection;

public class InsertDemo {

	public static void main(String[] args) {
		Connection connection=null;
		try {
		connection=OracleConnection.getConnection();
			connection.setAutoCommit(false);
			
			String sql2="insert into player(id,name,age,dob,contact,tid) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql2);
			preparedStatement.setInt(1, 20005);
			preparedStatement.setString(2, "Sourav");
			preparedStatement.setInt(3, 22);
			preparedStatement.setDate(4, new java.sql.Date(new Date().getTime()));
			preparedStatement.setLong(5, 1234567895);
			preparedStatement.setInt(6, 103);
			preparedStatement.addBatch();
			preparedStatement.setInt(1, 20006);
			preparedStatement.setString(2, "Sachin");
			preparedStatement.setInt(3, 22);
			preparedStatement.setDate(4, new java.sql.Date(new Date().getTime()));
			preparedStatement.setLong(5, 1234567894);
			preparedStatement.setInt(6, 101);
			preparedStatement.addBatch();
			int x[]=preparedStatement.executeBatch();
			System.out.println(x.length+" players created");
			//int x=preparedStatement.executeUpdate();
			//System.out.println(x+" player created");
			createTeam(connection, 104, "team4");
			connection.commit();
		//	connection.sets
		} catch (ClassNotFoundException | SQLException e) {
			if(e instanceof SQLException) {
				try {
					connection.rollback();
				//	connection.roll
					System.out.println("Query got rollback "+connection);
				} catch (SQLException e1) {
					System.out.println(e1);
				}
			}
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
		}

	}
	public static int createTeam(Connection connection, int tid, String teamname ) throws SQLException {
		String sql1="insert into team(tid,teamname) values(?,?)";
	
		int x=0;
			PreparedStatement preparedStatement=connection.prepareStatement(sql1);
			preparedStatement.setInt(1, tid);
			preparedStatement.setString(2, teamname);
			x=preparedStatement.executeUpdate();
			System.out.println(x+" team created");
		
		
		
		return x;
	}

}
