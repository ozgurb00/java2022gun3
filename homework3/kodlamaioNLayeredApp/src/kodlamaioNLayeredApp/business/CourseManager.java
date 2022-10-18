package kodlamaioNLayeredApp.business;

import kodlamaioNLayeredApp.dataAccess.CourseDao;
import kodlamaioNLayeredApp.entities.Course;
import kodlamaioNLayeredApp.loggers.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers; 

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) {
		courseDao.add(course);
		for(Logger logger:loggers){
            logger.log(course.getCourseName());
        }
	}
}
