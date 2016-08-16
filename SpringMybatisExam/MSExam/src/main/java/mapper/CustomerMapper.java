package mapper;

import java.util.List;

import Entity.Customer;




public interface CustomerMapper {
	

	public int insert(Customer customer);
	
	public Customer selectCustomer();
	
	public List<Customer> selId(String id);
	
	public Customer del(String id);
}
