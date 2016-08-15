package org.lewis.SpringMybatisExam.Service;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lewis.SpringMybatisExam.Entity.Customer;



public class CustomerServiceImp implements CustomerService {

	public int insert(Customer customer) {
		InputStream is=CustomerServiceImp.class.getClassLoader().getResourceAsStream("MybatisConf.xml");
    	SqlSessionFactory factory=  new SqlSessionFactoryBuilder().build(is);
    	
    	SqlSession session = factory.openSession();
    	
    	String statementInsertOne="org.lewis.SpringMybatisExam.Mapper.customer"+".insertCustomer";
    	int insert=session.insert(statementInsertOne, customer);
    	session.commit();
        System.out.println(insert);
		return insert;
	}

}
