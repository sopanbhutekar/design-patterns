package design_patterns.filter;

public class Person {

	private String name;
	private String Gender;
	private String maritalStatus;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", Gender=" + Gender + ", maritalStatus=" + maritalStatus + "]";
	}
	public Person() {
		super();
	}
	public Person(String name, String gender, String maritalStatus) {
		super();
		this.name = name;
		Gender = gender;
		this.maritalStatus = maritalStatus;
	}	
}
