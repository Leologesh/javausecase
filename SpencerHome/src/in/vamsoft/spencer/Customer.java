package in.vamsoft.spencer;

public class Customer {
	int custId;
	String name;
	int contactNo;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String name, int contactNo) {
		super();
		this.custId = custId;
		this.name = name;
		this.contactNo = contactNo;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	public void addCustomer() {
		
	}
	public void bookProduct(Product obj) {
		
	}

}
