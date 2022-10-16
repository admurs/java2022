package kodlamaIo.dataAccess;

import kodlamaIo.entities.Educator;

public class HibernateEducatorDao implements EducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("Hibernate ile veritabanına eklendi.");
		
	}

}
