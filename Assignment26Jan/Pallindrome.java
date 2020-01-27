package com.cts.voila.Ass2;

import java.util.Scanner;

public class Pallindrome {
	
	public static void main(String args[]){
		String string,reverse="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		string=scan.next();
		int length=string.length();
		for(int i=length-1;i>=0;i--){
			reverse=reverse+string.charAt(i);
		}
		if(string.equals(reverse))
		{
			System.out.println(string+" is a pallindrome. ");
		}
		else{
			System.out.println(string+ " not a pallindrome");
		}
	}

}
