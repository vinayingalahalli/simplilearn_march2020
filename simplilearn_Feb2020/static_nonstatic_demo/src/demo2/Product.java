package demo2;

public class Product {

	int id;
	String name;
	double price;// instance level
	static float discount; //class level
	public Product(int id1,String name1,double price1) {
		id=id1;
		name=name1;
		price=price1;
	}
	
	public void printProduct() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Price = "+price);
		System.out.println("Discount = "+discount);
	}
}
