package com.argo;

import java.util.Arrays;
import java.util.List;

public class Duplicate {
	public static void main(String args[]) {

		List<String> list1 = Arrays.asList();

		List<String> lst2 = Arrays.asList();
		for (String val : lst2)

			if (!list1.contains(val)) {
				System.out.println(val);
			}

	}
}
