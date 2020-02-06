package Voila.HibernateStart;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.voila.hibernate.start.model.Employee;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// First way to create table from pojo class called by persistence class
		/*
		 * System.out.println( "Hello Voila!" ); Configuration configuration=new
		 * Configuration().configure(); StandardServiceRegistryBuilder builder = new
		 * StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
		 * ; SessionFactory factory =
		 * configuration.buildSessionFactory(builder.build()); Session session =
		 * factory.openSession();
		 */
    	
		/*----------------------------------------------------------------------------------*/
    	
    	// Second way to create table from pojo class called by persistence class
    	
    	Configuration configuration=new Configuration().configure();
    	SessionFactory sf=configuration.buildSessionFactory();
    	Session session=sf.openSession();
       	session.beginTransaction();
     /*---------------------------------------------------------------------------------------*/
       	// Fetching data from Employee class with id 123
    		
     	Employee e=(Employee)session.get(Employee.class,123);
		System.out.println(e);//state- managed
		
	/*----------------------------------------------------------------------------------*/	
		// Other Operation performed
		
		//session.evict(e);
    	//e.setDesig("updated123");
    	//session.save(e); // constraint violation in PK
    	//session.update(e);
    	//session.flush();
   // 	session.flush();
       	//session.getTransaction().commit();
        
    	session.delete(e);
    	session.flush();
    	session.getTransaction().commit();
        //session.close();
    }
}
