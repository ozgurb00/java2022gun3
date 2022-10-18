package kodlamaioNLayeredApp.entities;

public class Course {
	private int courseID;
	private String courseName;
	private String description;
	private double price;
	
	public Course() {

	}

	public Course(int courseID, String courseName, String description, double price) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.description = description;
		this.price = price;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
