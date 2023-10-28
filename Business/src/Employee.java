
public class Employee extends Person{
    private int id;
    private String designation;
    
	
	public Employee() {
		super();
		
	}
	
	public Employee(String name,String emailid,int id, String designation) {
		super(name,emailid);
		this.id = id;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String toString() {
		return super.toString()+"Employee [id=" + id + ", designation=" + designation + "]";
	}
	
    
    
}
