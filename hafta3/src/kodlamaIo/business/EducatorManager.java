package kodlamaIo.business;


import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.EducatorDao;
import kodlamaIo.entities.Educator;

public class EducatorManager {

	private EducatorDao educatorDao;
	private Logger[] loggers;
	
	public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
		super();
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}
	
	public void add(Educator educator) {
		System.out.println("Eğitmen eklendi.");
		educatorDao.add(educator);
		for (Logger logger : loggers) {
			logger.log(educator.getName()+educator.getSurname());
		}
	}
	
}
