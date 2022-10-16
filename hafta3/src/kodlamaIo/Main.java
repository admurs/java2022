package kodlamaIo;

import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.EducatorManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.core.logging.MailLogger;
import kodlamaIo.core.logging.SMSLogger;
import kodlamaIo.dataAccess.HibernateCategoryDao;
import kodlamaIo.dataAccess.HibernateEducatorDao;
import kodlamaIo.dataAccess.JdbcCategoryDao;
import kodlamaIo.dataAccess.JdbcCourseDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(), new MailLogger(),new SMSLogger() };
		
		Educator educator1=new Educator(1, "Adem", "Uras", "Öğretmen", "Vesikalık Resim");	
		EducatorManager educatorManager=new  EducatorManager(new HibernateEducatorDao(), loggers);
		educatorManager.add(educator1);
		
		System.out.println("---------------------------------------"); 
		
		Category category1=new Category(1,"Programlama Kategorisi");
		CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);
		
		System.out.println("---------------------------------------"); 
		
		Course course1=new Course(1, "2022 Yazılım Geliştirici Yetiştirme Kapı JAVA",79,educator1, 79, 10);
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
	}

}
