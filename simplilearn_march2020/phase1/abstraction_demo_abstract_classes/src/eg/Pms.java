package eg;

public abstract class Pms {

	public abstract void createProduct();
	public abstract void updateProduct();
	public abstract void removeProduct();
	public abstract void searchProduct(String name);
	public void test() {
		System.out.println("hi");
	}
}
