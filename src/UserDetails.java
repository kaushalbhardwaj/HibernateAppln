import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
//@Inheritence(Strategy=Inheritance.Single_Type)
//@DiscriminatorColumn(name="diffcolname",discriminatorType=Discriminator.String)
public class UserDetails {
	@Id
	private int userId;
	/*@OneToOne				//two tables will be created
	@JoinColumn(name="joincolname")*/
	/*
	 @OneToMany //if collection of vehicle is used and new table for collection
	 			//is created
	 @JoinTable(joinColumns=@JoinColumn(name="Id"),inverseJoinColumns=@JoinColumn(name="othercolname"))
	 @ManyToOne
	  
	 */
	/*@OneToMany(mappedBy="user")	//to make only one table
	 	
	 */
	/*@OneToMany(cascade=cascadeType.PERSIST)  //if we do this we not have to 
	 * 			//save object of many type using ses.save()
	 */
	
	private Vehicle veh;
	
	public Vehicle getVeh() {
		return veh;
	}
	public void setVeh(Vehicle veh) {
		this.veh = veh;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private String userName;
	

}
