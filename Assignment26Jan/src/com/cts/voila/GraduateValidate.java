package com.cts.voila;
//Author - Vivek Kumar
//Reff. - https://stackoverflow.com/questions/36519518/java-scanner-hasnext-string-regex-validation

import java.util.Scanner;

public class GraduateValidate {
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		String name;
		int year;
		System.out.println("Input Your Name: ");
		while (!sc.hasNext("[a-zA-Z!@#$&()\\\\-` ]+")) {
	        System.out.println("Enter Valid Name");
	        sc.next(); // this is important!
	    }
		    name = sc.next();
		    System.out.println("Input Your Graduation Year: ");
		    while (!sc.hasNextInt()) {
		        System.out.println("Enter Valid Year!");
		        sc.next(); 
		    }
		    year = sc.nextInt();
		    System.out.println("My name is "+name +" and I'll graduate in "+year);
		
	}
}

