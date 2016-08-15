package org.lewis.SpringMybatisExam.Service;

import java.util.List;

import org.lewis.SpringMybatisExam.Entity.Country;
import org.lewis.SpringMybatisExam.Mapper.CountryMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




	@Repository  
	public class CountryService implements CountryMapper {  
	  
	    @Autowired  
	    private SqlSessionTemplate sqlSessionTemplate;  
	      
	    
		public void save(Country country) {
			sqlSessionTemplate.insert("save", country);  
			
		}

		public void update(Country country) {
			 sqlSessionTemplate.update("update", country);  
			
		}

		public void delete(Integer id) {
			sqlSessionTemplate.delete("delete",id); 
			
		}

		public Country findById(Integer id) {
			return (Country) sqlSessionTemplate.selectOne("findById", 3);  
		}

		public List<Country> findAll() {
			List<Country> countrys = sqlSessionTemplate.selectList("findAll");  
	        return countrys;  
		}

	  
	}  

