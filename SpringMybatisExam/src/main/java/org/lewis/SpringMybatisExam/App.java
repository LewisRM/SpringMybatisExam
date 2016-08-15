package org.lewis.SpringMybatisExam;


import org.lewis.SpringMybatisExam.Entity.Country;
import org.lewis.SpringMybatisExam.Mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 

{ 
	
	
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Country c=(Country) ctx.getBean("country");
    	
    	CountryMapper countryMapper=(CountryMapper) ctx.getBean("countryMapper");
    	
    	Country user = countryMapper.findById(1);
    	System.out.println(user);
    }
}
