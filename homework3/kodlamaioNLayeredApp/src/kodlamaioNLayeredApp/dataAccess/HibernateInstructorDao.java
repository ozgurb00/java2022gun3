package kodlamaioNLayeredApp.dataAccess;

import kodlamaioNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veri tabanına kaydedildi : " + instructor.getFirstName());
		
	}

}
