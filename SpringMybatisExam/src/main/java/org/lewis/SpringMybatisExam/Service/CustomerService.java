package org.lewis.SpringMybatisExam.Service;

import java.util.List;

import org.lewis.SpringMybatisExam.Entity.Customer;
import org.lewis.SpringMybatisExam.Mapper.CustomerMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository 
public class CustomerService implements CustomerMapper {

	
	 @Autowired  
	    private SqlSessionTemplate sqlSessionTemplate;  
	 
	public void save(Customer customer) {
		 sqlSessionTemplate.insert("insert-user", customer);  

	}

	public void update(Customer customer) {
		 sqlSessionTemplate.update("update-user", customer);  

	}

	public void delete(int id) {
		 sqlSessionTemplate.delete("delete-user",id);  

	}

	public Customer findById(int id) {
		 return (Customer) sqlSessionTemplate.selectOne("queryById", 3);  
	}

	public List<Customer> findAll() {
		 List<Customer> customers = sqlSessionTemplate.selectList("queryAll");  
	        return customers;  
	}

}
