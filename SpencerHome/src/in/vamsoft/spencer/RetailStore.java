package in.vamsoft.spencer;

import java.sql.Connection;
import java.util.List;

import in.vamsoft.dao.CustomerDAOImpl;
import in.vamsoft.dao.ProductDAO;

public class RetailStore{

	String storeName;
	public static int custId=0;
	public static int pId=0;
	Connection connection=null;
	CustomerDAOImpl impl=new CustomerDAOImpl();
	ProductDAO productDAO = new ProductDAO();
	public RetailStore(String name) {
		this.storeName=name;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void addCustomer(String name,int contact) {
		System.out.println(impl.getLastCustomerId());
		custId=impl.getLastCustomerId()+1;
		Customer c=new Customer(custId,name,contact);
		impl.addCustomer(c);
		System.out.println("customer added");
		
	}
	public void addProduct(String pName,double price,int quantity) {
		pId=productDAO.getLastProductId()+1;
		Product p = new Product(pId,pName,quantity,price);
		productDAO.addProduct(p);
		System.out.println("product added");
		
		
	}
	public int checkProductAvailability(String productName) {
		System.out.println(productDAO.checkProductAvailability(productName));
		return productDAO.checkProductAvailability(productName);
		
	}
	public List<Product> getAllProducts(){
		System.out.println(productDAO.getAllProducts());
		  return productDAO.getAllProducts();
	}
	
	public double calculateNetAmount(int customerID,double discount) {
		return discount;
		
	}
	public boolean bookProduct(String pname, int quantity, int customerid) {
		System.out.println("RetailStore.bookproduct()");
		
		//System.out.println(productDAO.bookproduct(pname, quantity, customerid));
		return (productDAO.bookproduct(pname, quantity, customerid));
	}
	
	public void getAllBookedProducts(int custId){
		System.out.println((impl.getAllBookedProducts(custId)));
	}
	
		
}
