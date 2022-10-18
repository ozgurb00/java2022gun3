package kodlamaioNLayeredApp.dataAccess;

import kodlamaioNLayeredApp.entities.Instructor;

public class jdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veri tabanına kaydedildi : " + instructor.getFirstName());
		
	}

}
