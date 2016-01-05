import javax.persistence.Embeddable;

@Embeddable
public class Address {
	//@Column(name="colname")  to set column name of the embeddable object
	private int streetno;
	private String city;
	public int getStreetno() {
		return streetno;
	}
	public void setStreetno(int streetno) {
		this.streetno = streetno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
