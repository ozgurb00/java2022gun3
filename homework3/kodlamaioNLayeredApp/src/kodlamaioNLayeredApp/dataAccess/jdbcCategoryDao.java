package kodlamaioNLayeredApp.dataAccess;

import kodlamaioNLayeredApp.entities.Category;

public class jdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veri tabanına kaydedildi : " + category.getCategoryName());
		
	}

}
