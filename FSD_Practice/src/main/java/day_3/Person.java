package day_3;

public class Person {
	private String first_name;
	private String last_name;
	private int age;
	private GenderEnum_8 gender;
	private double weight;
	private long phoneNumber;
	
	
	public Person(String first_name, String last_name, int age, GenderEnum_8 gender, double weight,long phoneNumber) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.gender=gender;
		this.weight = weight;
		this.phoneNumber=phoneNumber;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public GenderEnum_8 getGender() {
		return gender;
	}
	public void setGender(GenderEnum_8 gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Person Details\n"
				+ "--------------------------\n"
				+ "First Name : " + first_name + "\n"
				+ "Last Name : " + last_name + "\n"
				+ "Gender : " + gender + "\n"
				+ "PhoneNumber :"+phoneNumber+"\n"
				+ "Age : " + age+"\n"
				+ "Weight :" + weight;
	}
	

}
