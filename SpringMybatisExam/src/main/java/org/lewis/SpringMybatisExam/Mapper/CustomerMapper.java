package org.lewis.SpringMybatisExam.Mapper;

import java.util.List;

import org.lewis.SpringMybatisExam.Entity.Customer;

public interface CustomerMapper {
	void save(Customer customer);
	void update(Customer customer);
	void delete(int id);
	Customer  findById(int id);
	List<Customer> findAll();
}
