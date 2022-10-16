package kodlamaIo.dataAccess;

import kodlamaIo.entities.Educator;

public class JdbcEducatorDao implements EducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("JDBC ile veritabanına eklendi.");
		
	}

}
