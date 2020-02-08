package demo2;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p1=new Product(100,"TV",199.99);
//		p1.id=100;
//		p1.name="TV";
//		p1.price=199.99;
		//Product.discount=9.99f;
		
		System.out.println("Printing product 1");
		p1.printProduct();
		
		Product p2=new Product(101,"Dryer",9.99);
//		p2.id=101;
//		p2.name="Dryer";
		//p2.price=9.99;
		Product.discount=9.99f;
		System.out.println("\nPrinting product 2");
		p2.printProduct();
		
		System.out.println("\nPrinting product 1 AGAIN");
		p1.printProduct();
		Product.discount=19.99f;
		System.out.println("\nPrinting product 2 AGIAN");
		p2.printProduct();
		
		System.out.println("\nPrinting product 1 AGAIN & AGAIN");
		p1.printProduct();

	}

}
