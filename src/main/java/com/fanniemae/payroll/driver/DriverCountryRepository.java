package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.CountryRepository;

public class DriverCountryRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountryRepository dao = new CountryRepository();
		dao.findAll().forEach(System.out::println);

	}

}
