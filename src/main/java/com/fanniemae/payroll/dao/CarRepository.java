package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

 public class CarRepository implements IQuery<String> {

	public CarRepository() {
		// TODO Auto-generated constructor stub
		
		System.out.println("I am a live");
	}

	@Override
	public ArrayList<String> findAll() {

		return null;
	}

	@Override
	public Map<String, Double> findMaps() {
		Map<String, Double> carMap = new HashMap<>();

		carMap.put("Lexus", 50_000d);
		carMap.put("RangeRover", 100_000d);
		carMap.put("BMW", 90_000d);
		carMap.put("Porsche", 80_000d);
		carMap.put("LandRover", 100_000d);
		carMap.put("Benz", 120_000d);
		carMap.put("Jaguar", 90_000d);
		carMap.put("Honda", 30_000d);
		carMap.put("Ferrari", 150_000d);
		carMap.put("Lamborghini", 200_000d);
		return carMap;
	}

}
