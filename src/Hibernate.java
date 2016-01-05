import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {

	public static void main(String z[])
	{
		UserDetails user=new UserDetails();
		user.setUserId(1);
		user.setUserName("kaushal");
		
		SessionFactory fac=new Configuration().configure().buildSessionFactory();
		Session ses=fac.openSession();
		ses.beginTransaction();
		ses.save(user);
		ses.getTransaction().commit();
		ses.close();
		/*UserDetails u=(UserDetails)ses.get(UserDetails.class, 1);
			//to retrieve data from database
		*/
		
		
	}
}
