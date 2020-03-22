package eg;

public class MedicalProducts extends Pms{

	@Override
	public void createProduct() {
		// TODO Auto-generated method stub
		System.out.println("Product created in MYSQL DB");
	}

	@Override
	public void updateProduct() {
		// TODO Auto-generated method stub
		System.out.println("Product updated in MYSQL DB");
	}

	@Override
	public void removeProduct() {
		// TODO Auto-generated method stub
		System.out.println("Product removed ffrom MYSQL DB");
	}

	@Override
	public void searchProduct(String name) {
		// TODO Auto-generated method stub
		System.out.println("Product with name "+name+" was searched in MYSQL DB");
	}

}
