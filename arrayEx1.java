package com.companyname.jonathan;

import java.util.Scanner;

import java.util.Scanner;

public class arrayEx1 {

	public static void main(String[] args) {
		int[] excArray1 = {5, 9, 12, 51, 21, 42, 17, 81, 73, 36};
		int[] excArray2 = new int[10];
		int[] excArray3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		String[] someNames = {"Jim", "Pam", "Michael", "Stanley", "Erin"};
		for(int arrayExc : excArray1) {
			System.out.println(arrayExc);
		}
			
		for(int i =0; i<excArray2.length; i++) {
			excArray2[i] = i*10;
			System.out.println(excArray2[i]);
		}
		System.out.println("Just some names from the office:");
		for(String names : someNames) {
			System.out.println(names);
		}
		
		for(int number: excArray3) {
			number= number*number;
			System.out.println(number);
		}
		Scanner numero = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int numberValue = numero.nextInt();
		
		trueEven(numberValue);
		
		
	}
	
	public static boolean trueEven(int number) {
		boolean itsEven = false;
		if(number %2 == 0) {
			itsEven = true;
			System.out.println(itsEven);
		}
		else {
			System.out.println(itsEven);
		}
		
		return itsEven;
		
	}

}
