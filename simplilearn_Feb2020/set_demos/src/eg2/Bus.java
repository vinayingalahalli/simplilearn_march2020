package eg2;

public class Bus  {

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
