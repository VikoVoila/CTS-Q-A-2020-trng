package com.cts.voila;
//Author - Vivek Kumar
import java.util.Scanner;

public class Graduate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Your Name: ");
		String name = sc.nextLine();
		System.out.println("Input Your Graduation Year:");
		int year=sc.nextInt();
		System.out.println("My name is "+name +" and I'll graduate in "+year);
	}

}
