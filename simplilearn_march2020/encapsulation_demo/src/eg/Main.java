package eg;

public class Main {

	public static void main(String[] args) {
		Player p=new Player(111, "Sachin");
		p.printPlayer();
		
		Player p1=new Player(109,"Deepak");
//		p1.id=199;
//		p1.name="kjczkjc";
		p1.printPlayer();
				
		p1.setName("Deepak Kumarrr");
		p1.printPlayer();
		System.out.println(p1.getName());
	}

}
