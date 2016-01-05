import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {

	public static void main(String z[])
	{
		Vehicle vehcl=new Vehicle();
		vehcl.setvId(1);
		vehcl.setvName("car");
		UserDetails user=new UserDetails();
		user.setUserId(1);
		user.setUserName("kaushal");
		user.setVeh(vehcl);
		
	
		
		SessionFactory fac=new Configuration().configure().buildSessionFactory();
		Session ses=fac.openSession();
		ses.beginTransaction();
		ses.save(user);
		ses.save(vehcl);
		ses.getTransaction().commit();
		ses.close();
		
		//ses.persist(user);
		//ses.delete(user);   to delete data in database
		//ses.update(user);   to change data in the object
		
	}
}
