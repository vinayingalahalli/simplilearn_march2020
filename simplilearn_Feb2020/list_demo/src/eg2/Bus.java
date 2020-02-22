package eg2;

public class Bus implements Comparable<Bus> {

	private int id;
	private String name;
	private double fare;
	private float rating;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Bus(int id, String name, double fare, float rating) {
		super();
		this.id = id;
		this.name = name;
		this.fare = fare;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", fare=" + fare + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Bus b1) {
		Integer i0=this.id;
		Integer i1=b1.id;
		
		return i0.compareTo(i1);
	}
}
