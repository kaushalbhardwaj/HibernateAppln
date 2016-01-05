import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity //(name="Table name")
//@Table(name="Table name") same as entity name but with minor difference
public class UserDetails {
	@Id
	//@EmbeddedId    if the Id itself is embedded from some other class
	//@GeneratedValue(strategy=GenerationType.AUTO)   auto generated 
	//@Column(name="colname") it is used above the field
	//@Transient  to not save any field in table written above the field
	private int userId;
	//@Temporal(TemporalType.DATE)   to save only date 
	//@Lob to represent large object
	//private Date date;
	/*@Embedded
	 * @AttributeOverrides({
	 * @AttributeOverride(name="streetno",column=@Column(name="colname"),
	 * @AttributeOverride(name="city",column=@Column(name="colname2"),
	 * })
	private Address addr;
	*/
	/* @ElementCollection		//to make separate table for collection
	 * @JoinTable(name="nameOfNewTable",joinColumns=@JoinColumn(name="Idname"))
	 *      //to give colname and tablename to new table
	 * @ElementCollection(fetch="Eager")	//for eager fetch opposite of default
	 * 			//lazy fetch
	 * private List <Address> addr;
	 * 
	 */
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
