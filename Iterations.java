package com.companyname.jonathan;

public class Iterations {

	public static void main(String[] args) {
//		System.out.println(add10To99(46));
//		flowChart1(100);
//		flowChart2(100);
//		flowChart3(1,10);
		changeCalculator(20, 7.23);
	}
	
	public static int add10To99(int num1) {
		if(num1< 10 || num1 > 99) {
			return 0;
		}
		int sum =0;
		
		while(num1 >= 10) {
			num1-= 10; /*num1 = num1-10, this formula repeats as long as num1 is bigger or equal to 10*/
			sum++; /*Increment sum every iteration*/ 
		}
		
		while(num1 >= 1) {
			num1-= 1; /*num1 = num1 - 1*/
			sum++;
		}
		return sum;
	}
	
	public static int flowChart1(int A){
		for(int i=A; i<=200; i++) {
			System.out.println(A); 
			A++;
		}
		if(A >200) {
				System.out.println("END"); 
			}	
		return A;
	}
	
	public static int flowChart2(int A){
		for(int i =A; i<=200;i++) {
			if(A% 2==0) {
				 System.out.println("-"); 
				A++;
			} 
			else if(A% 2!=0) {
				System.out.println("*");
				A++;
			}
		 }
		if(A > 200) {
			 System.out.println("END");
		}	 
		
		return A;
	}
//	Create a method to print the numbers 1 to 10 as many times as the value of that number.
//	For example; you will print 1 once, and 10 ten times
	public static int flowChart3(int num1, int num2){
		int origin = num1;
		for(int i =num1; i<=num2;i++) {
				for(int j=origin; j<=i;j++) {
					System.out.print(i);
				}
			}
		return num1;
	}
	
	public static double changeCalculator(double paid, double cost) {
		int tennerCount = 0;
		int fiverCount = 0;
		int twentyPenceCount = 0;
		double tenPence = 0.10;
		int onePenceCount = 0;
		double originalCost = paid;
		while (cost < paid /* && cost % originalCost == 0 */) {
			cost += 10;
			tennerCount++;
			if(cost > originalCost) {
				tennerCount--;
			}
		}
		while (cost < paid/* && cost < originalCost */) {
			cost += 5;
			fiverCount++;
			if(cost > originalCost) {
				fiverCount--;
			}
		}
		while (cost < paid /* && cost < originalCost */) {
			cost += 0.20;
			twentyPenceCount++;
			if(cost > originalCost) {
				twentyPenceCount--;
			}
		}
		while (cost < paid /* && cost < originalCost */) {
			cost += 0.01;
			onePenceCount++;
			if(cost > originalCost) {
				onePenceCount--;
			}
		}
		double change = (tennerCount*10) + (fiverCount*5) + (twentyPenceCount*0.20) + (onePenceCount * 0.01);
		System.out.println(change);
		return change;
		
	}
}
