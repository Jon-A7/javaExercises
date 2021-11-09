package com.companyname.jonathan;

public class Person {
	private String name;
	private int age;
	private double height;
	private int shoeSize;
	private String jobTitle;
	
	public Person(String name, int age, double height, int shoeSize, String jobTitle) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
	}
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		
	}
	
	public void bonjour() {
		System.out.println("Hello my name is " + name +" I am " + age +" years old.");
	}
	
	public void iAm() {
		System.out.println("I am about " + height +" feet tall with a shoe size of " + shoeSize +", my job title is " +
	jobTitle+".");
	}


	public static void main(String[] args) {
		

	}

}
