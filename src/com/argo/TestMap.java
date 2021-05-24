package com.argo;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map<String, Integer> validValueMap = new HashMap<String, Integer>();
		 validValueMap.put("Category",1);
		 validValueMap.put("Type",0);
		 validValueMap.put("Element",1);
		 validValueMap.put("Check",0);
		 Map<String, Object> validValueMap1 = new HashMap<String, Object>();
		 validValueMap1.put("check", "");
		 String val = (String)validValueMap1.get("check");
		 if(val!=null) {
			 System.out.println("Null values are not present.");
		 }
		 else {
			 System.out.println("Null values are  present.");
		 }
		 if(validValueMap.get("Type") == 0) {
			 System.out.println("Inside");
			 
		 }

	}

}
