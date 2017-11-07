package in.vamsoft.spencer;

public class RetailStore extends Customer {

	String storeName;
	public static int custId=1;
	public static int pId=1;
	public RetailStore(String name) {
		super();
	}
	public void addCustomer(String name,int contact) {
		Customer c =new Customer(custId,name,contact);
		custId++;
	}
	public void addProduct(String pName,String status,double price,long quantity) {
		Product p = new Product(pId,pName,status,quantity);
	}
	public int checkProductAvailability(String productName) {
		return 1;
		
	}
	public int bookProduct(int customerID,String productName,int qtyOfProduct) {
		return 1;
		
	}
	public double calculateNetAmount(int customerID,double discount) {
		return discount;
		
	}
	
	
		
}
