package org.lewis.SpringMybatisExam.Mapper;

import java.util.List;

import org.lewis.SpringMybatisExam.Entity.Country;

public interface CountryMapper {
	void save(Country country);
	void update(Country country);
	void delete(Integer id);
	Country  findById(Integer id);
	List<Country> findAll();
}
