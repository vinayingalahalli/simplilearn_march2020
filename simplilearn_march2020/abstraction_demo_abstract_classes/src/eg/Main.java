package eg;

public class Main {

	public static void main(String[] args) {
		MedicalProducts p=new MedicalProducts();
		p.createProduct();
		p.updateProduct();
		p.searchProduct("Cough");
		p.removeProduct();
		

	}

}
