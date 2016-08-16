package service;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Entity.Address;
import Entity.Customer;
import mapper.AddressMapper;
import mapper.CustomerMapper;
import serviceInterface.AllAction;

public class AllActionImp implements AllAction {
	
	BeanFactory fa=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Customer customer=null;
	int i=0;
	String address=null;
	
	String firstName=null;
	String lastName=null;
	String email=null;
	Short addressId=0;
	Date date=null;
	
	
	public Customer inputAndCheck() {
			
    	
			Scanner scanner= new Scanner(System.in);
			
			System.out.println("请输入 FirstName(first_name):");			
			firstName=scanner.next();
			
			System.out.println("请输入 LastName(last_name):");			
			lastName=scanner.next();
			
			System.out.println("请输入 Email(email):");
			email=scanner.next();
        
        
			System.out.print("请输入  Address ID:");
			addressId= scanner.nextShort();
        
			AddressMapper mapper=(AddressMapper) fa.getBean("AddressMapper");
			List<Address> list= mapper.findAllAddress();
			
			while(true){
				for(i=0;i<list.size();i++){
					if(list.get(i).getAddressId() == addressId)
           		 break;
					}
					if(i==list.size()){
						System.out.println("你输入的 Address ID 不存在,请重新输入:");
						addressId= scanner.nextShort();
					}else{
						scanner.close();
						break;
					}
       	 
				}
        
			
        	 	Byte shortId=1;
        	 	date=new Date();
        	 	customer=new Customer();
        	 	customer.setAddressId(addressId);
        	 	customer.setFirstName(firstName);
        	 	customer.setLastName(lastName);
        	 	customer.setEmail(email);
        	 	customer.setStoreId(shortId);
        	 	customer.setCreateDate(date);
        	 	
        	 	address=list.get(i).getAddress();
        	 	return customer;
	}

	public int insertCustomer(Customer customer) {
		CustomerMapper mapper=(CustomerMapper) fa.getBean("CustomerMapper");
		int insert = mapper.insert(customer);
		return insert;
	}

	public void showMessage() {
		System.out.println("Before Insert Customer Data");
        System.out.println("已经保存的数据如下:");
        System.out.println("AddressID:"+addressId);
        System.out.println("Address:"+address);
        System.out.println("first_name:"+firstName);
        System.out.println("last_name:"+lastName);
        System.out.println("email:"+email);
        System.out.println("Create_time:"+date);
	}

	public int deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
