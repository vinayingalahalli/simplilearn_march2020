package eg2;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		PlayerDAO dao=new PlayerDAO();
		Player player=new Player("Mahesh", 29, new Date(), 101, 7891230898L);
		try {
			player=dao.createPlayer(player);
			if(player.getId()!=0) {
				System.out.println("Player created with below details");
				System.out.println(player);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
