package org.lewis.SpringMybatisExam.Entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Country {
    private Short countryId;

    private String country;

    private Date lastUpdate;
    
    public Country() {
		
	}
    
    public Country(Short countryId,String country,Date lastUpdate){
    	this.countryId=countryId;
    	this.country=country;
    	this.lastUpdate=lastUpdate;
    			
    }

    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}