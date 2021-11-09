package com.companyname.jonathan;
import java.util.Scanner;
public class CalcClass {

	public static void main(String[] args) {
		calcMethod();
//		System.out.println(multiMethod(20, 10));
//		System.out.println(addMethod(20,10));
//		System.out.println(minusMethod(20, 10));
//		divMethod(12, 10);
		
	}

	public static int multiMethod(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	public static double divMethod(double num1, double num2) {
		double verified= num1/num2;
		if(num1<num2) {
			System.out.println(verified);
		}else {
			System.out.println("Division cannot be performed.");
		}
		return verified;
	}
	
	public static int addMethod(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static int minusMethod(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	/*---------------------------Building a better Calculator---------------------------*/
	public static void calcMethod() {
		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt();

		System.out.print("Enter an operator: ");
		String operator = sc.next();
		

		System.out.print("Enter second number: ");
		int secondNum = sc.nextInt();

		if (operator.equals("+") ) {
			System.out.println("Your answer is: "+(firstNum + secondNum));
		} else if (operator.equals("-") ) {
			System.out.println("Your answer is: "+(firstNum - secondNum));
		} else if (operator.equals("*") ) {
			System.out.println("Your answer is: "+(firstNum * secondNum));
		} else if (operator.equals("/") ) {
			System.out.println("Your answer is: "+(firstNum / secondNum));
		} else {
			System.out.println("Invalid operator, enter a valid operator.");
		}

	}
	
	
}
