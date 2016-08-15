package org.lewis.SpringMybatisExam.Mapper;

import java.util.List;

import org.lewis.SpringMybatisExam.Entity.Store;

public interface StoreMapper {
	void save(Store store);
	void update(Store store);
	void delete(int id);
	Store  findById(int id);
	List<Store> findAll();
}
