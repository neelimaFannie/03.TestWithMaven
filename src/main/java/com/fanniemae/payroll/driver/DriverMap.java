package com.fanniemae.payroll.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DriverMap {

	/* the objective of this topic
	 * is to discuss the relationship
	 * between the Map interface and HashMap
	 * implementation
	 * my name is Neelima Juvvadi
	 * Git - TestTrying to commit in 
	 * Git - Practice commands
	 */
	public static void main(String[] args) {
		
		Map<String, Double> map = new HashMap<>();

		map.put("david",1_000_000d);
		map.put("lucy",2_000_000d);
		map.put("peter",3_000_000d);
		
		System.out.println(map.get("david"));
		System.out.println(map.size());
		
		Set<String> keys = map.keySet();
		for (String string : keys){
			System.out.println(string.toUpperCase());
		}
	}

}
