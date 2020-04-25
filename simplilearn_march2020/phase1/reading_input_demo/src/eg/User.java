package eg;

public class User {

	private String name;
	private int age;
	private char gender;
	private float rating;
	private String email;
	private long contact;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public User(String name, int age, char gender, float rating, String email, long contact) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.rating = rating;
		this.email = email;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + ", rating=" + rating + ", email=" + email
				+ ", contact=" + contact + "]";
	}
	
	
}
