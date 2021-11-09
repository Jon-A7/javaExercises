package com.companyname.jonathan;

public class StringExc {
	public static void main(String[] args) {
		String firstStr = "TODAY IT IS SUNNY";
		String secondStr = "YESTERDAY IT WAS RAINING";
		
		System.out.println(firstStr.toLowerCase() +", "+ secondStr.toLowerCase()+".");
		
		String subToday = firstStr.substring(0,11);
		String subRain = secondStr.substring(16,24);
		System.out.println(subToday + subRain);
		
	}

}
