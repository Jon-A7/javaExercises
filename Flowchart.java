package com.companyname.jonathan;

public class Flowchart {

	public static void main(String[] args) {
		
		flowChart(2,40,false);
		flowChart2(3000);
	}

	public static void flowChart(int num1, int num2, boolean numberVal) {
		if(numberVal==false) {
			System.out.println(num1*num2);
		}else {
			System.out.println(num1+num2);
		}
		
	}
	public static void flowChart2(int A) {
		
	}
}


//Take int A = x. If A > 2000, boolean valid = True, print A.
// If A > 6000 Print C