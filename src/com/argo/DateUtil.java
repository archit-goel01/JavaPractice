package com.argo;

import java.util.Date;

public class DateUtil {

	public static void main(String[] args) {
	Date date = new Date();
	
	long ds = 648000000;
	Date date1 = new Date(date.getTime()+ds);
	Date date2 = new Date(648000000);
	Date date3 = null;
	System.out.println(date1);
	System.out.println(date2.getTime());
	System.out.println(date3);
	System.out.println(new Date());
	}

}
