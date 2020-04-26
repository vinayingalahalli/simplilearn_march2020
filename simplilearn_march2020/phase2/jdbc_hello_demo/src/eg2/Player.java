package eg2;

import java.util.Date;

public class Player {

	private int id;
	private String name;
	private int age;
	private Date dob;
	private int tid;
	private long contact;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String name, int age, Date dob, int tid, long contact) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.tid = tid;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", tid=" + tid + ", contact="
				+ contact + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
}
