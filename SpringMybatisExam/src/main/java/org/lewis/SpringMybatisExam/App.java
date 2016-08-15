package org.lewis.SpringMybatisExam;


import java.util.Date;
import java.util.Scanner;


import org.lewis.SpringMybatisExam.Entity.Country;
import org.lewis.SpringMybatisExam.Entity.Customer;
import org.lewis.SpringMybatisExam.Mapper.CountryMapper;
import org.lewis.SpringMybatisExam.Service.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 

{ 
	
	
    public static void main( String[] args )
    {
    	 Scanner scanner= new Scanner(System.in);
         System.out.print("请输入 FirstName(first_name):");
         String firstName=scanner.next();
         System.out.print("请输入 LastName(last_name):");
         String lastName=scanner.next();
         System.out.print("请输入 Email(email)::");
         String email=scanner.next();
         System.out.print("请输入  Address ID:");
         Short addressId= scanner.nextShort();
         
         
         Byte shortId=1;
         
         Customer customer= new Customer();
         Date date=new Date();
         customer.setAddressId(addressId);
         customer.setFirstName(firstName);
         customer.setLastName(lastName);
         customer.setEmail(email);
         customer.setStoreId(shortId);
         customer.setCreateDate(date);
         
         CustomerServiceImp csi=new CustomerServiceImp();
         
         int insert= csi.insert(customer);
         System.out.println(insert);
    }
}
