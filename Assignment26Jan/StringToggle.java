package com.cts.voila.Ass2;

import java.util.Scanner;

public class StringToggle {
	public static void main(String args[]) {
		String str=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		str=sc.next();
		String words[]=str.split("\\s");  
	    String toggle=" ";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }
	}

}
