package override_eg_object;

public class PlayerMain {

	public static void main(String[] args) {
		Player p1=new Player(102, "Sachin");
		System.out.println(p1);
	//	System.out.println(p1.toString());
		Player p2=new Player(102, "Sachin");
		System.out.println(p2);
		
		
		if(p1.equals(p2)) {
			System.out.println("Players are same");
		}else {
			System.out.println("Players are different");
		}
	}

}
