package org.lewis.SpringMybatisExam.Mapper;

import java.util.List;

import org.lewis.SpringMybatisExam.Entity.Address;



public interface AddressMapper {
	void save(Address address);
	void update(Address address);
	void delete(int id);
	Address findById(int id);
	List<Address> findAll();
}
