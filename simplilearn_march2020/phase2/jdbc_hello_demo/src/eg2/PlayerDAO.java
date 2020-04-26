package eg2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import com.dbutil.OracleConnection;

public class PlayerDAO {

	
	public Player createPlayer(Player player) throws Exception {
		
		try(Connection connection=OracleConnection.getConnection()){
			CallableStatement callableStatement=connection.prepareCall("{call CREATEPLAYER(?,?,?,?,?,?)}");
			callableStatement.setString(2, player.getName());
			callableStatement.setLong(3, player.getContact());
			callableStatement.setInt(4, player.getAge());
			callableStatement.setInt(5, player.getTid());
			callableStatement.setDate(6, new java.sql.Date(player.getDob().getTime()));
			callableStatement.registerOutParameter(1, java.sql.Types.NUMERIC);
			
			callableStatement.execute();
			player.setId(callableStatement.getInt(1));
			
		}catch(SQLIntegrityConstraintViolationException e) {
			throw new Exception("Player Contact "+player.getContact()+" exists in the database.");
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new Exception("Internal error occured contact SYSADMIN");
		}
		return player;
	}
}/*
for PLSQL function call do this
{?=call CREATEPLAYER(?,?,?,?,?)}
rest will be the same as you did for procedure
*/
