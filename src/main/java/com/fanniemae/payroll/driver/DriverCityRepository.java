package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CityRepository;

public class DriverCityRepository {

	public static void main(String[] args) {
		
		CityRepository dao = new CityRepository();
		dao.findAll().forEach(System.out::println);
		

	}

}
