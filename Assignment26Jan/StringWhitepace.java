package com.cts.voila.Ass2;

import java.util.Scanner;

public class StringWhitepace {
	public static void main(String args[]) {
	
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input String: ");
	str=sc.nextLine();
	String[] input = str.split("\\s");
	for(String i:input){  
		System.out.println(i);  
		}  
	}
}
