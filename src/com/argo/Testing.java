package com.argo;

import com.argo.Test;

import java.util.HashMap;
import java.util.Map;

public class Testing {
Test test = null;
	private  void settingResult() {
		/*
		 * map.put("D", "D"); map.put("A", "Dee"); return map;
		 */
		test = new Test();
		substract();
		
	}
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		System.out.println("Before"+map);
		Testing test = new Testing();
		test.settingResult();
		test.mult();
		System.out.println("After"+map);
	}
	private void substract(){
		int d= test.add();
		System.out.println(d);
	}
	public void mult() {
		System.out.println(test.add());
	}
	}

