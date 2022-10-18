package kodlamaioNLayeredApp.entities;

public class Instructor {
	private int instructorID;
	private String firstName;
	private String lastName;
	
	public Instructor() {

	}

	public Instructor(int instructorID, String firstName, String lastName) {
		this.instructorID = instructorID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
