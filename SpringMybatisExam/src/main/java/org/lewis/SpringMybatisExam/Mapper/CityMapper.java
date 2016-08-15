package org.lewis.SpringMybatisExam.Mapper;

import java.util.List;

import org.lewis.SpringMybatisExam.Entity.City;


public interface CityMapper {
	void save(City city);
	void update(City city);
	void delete(int id);
	City  findById(int id);
	List<City> findAll();
}
