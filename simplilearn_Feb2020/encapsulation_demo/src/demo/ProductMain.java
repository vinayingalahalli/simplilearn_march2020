package demo;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p1=new Product();
	//	p1.id=9999; //data leakage untrackable
		
		
		Product p2=new Product(199, "dsf", 11);
		p2.printProduct();
		p2.setName("new name");
		p2.printProduct();
		
		System.out.println("Name = "+p2.getName());
	}

}
