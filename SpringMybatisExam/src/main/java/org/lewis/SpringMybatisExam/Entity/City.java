package org.lewis.SpringMybatisExam.Entity;

import java.util.Date;

public class City {
    private Short cityId;

    private String city;

    private Short countryId;

    private Date lastUpdate;
    
    public City() {
		// TODO Auto-generated constructor stub
	}
    
    public City(Short cityId,String city,Short countryId,Date lastUpdate){
    	this.cityId=cityId;
    	this.city=city;
    	this.countryId=countryId;
    	this.lastUpdate=lastUpdate;
    }

    public Short getCityId() {
        return cityId;
    }

    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}