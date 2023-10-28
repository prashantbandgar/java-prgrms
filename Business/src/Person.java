
public class Person {
	private String name;
	private String emailid;
	public Person() {
		
	}
	public Person(String name, String emailid) {
		super();
		this.name = name;
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", emailid=" + emailid + "]";
	}
	
	
	

}
