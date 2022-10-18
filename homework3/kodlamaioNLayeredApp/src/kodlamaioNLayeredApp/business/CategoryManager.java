package kodlamaioNLayeredApp.business;

import kodlamaioNLayeredApp.dataAccess.CategoryDao;
import kodlamaioNLayeredApp.entities.Category;
import kodlamaioNLayeredApp.loggers.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) {
		categoryDao.add(category);
		for(Logger logger:loggers){
            logger.log(category.getCategoryName());
        }
	}
	
}
