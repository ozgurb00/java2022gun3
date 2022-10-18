package kodlamaioNLayeredApp.dataAccess;

import kodlamaioNLayeredApp.entities.Course;

public class jdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veri tabanına kaydedildi : " + course.getCourseName());
		
	}

}
