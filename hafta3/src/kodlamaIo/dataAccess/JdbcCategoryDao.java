package kodlamaIo.dataAccess;

import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi.");
		
	}

}
