package com.cts.voila;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char status;
		int option, correct1 = 1, correct2 = 2, correct3=2, count=0;

		System.out.println("Are you ready for a quiz? Y/N");
		status = s.nextLine().charAt(0);

		if (status == 'y' || status == 'Y') {
			System.out.println("Okay, Here it comes!");
			System.out.println("Q1) What is the capital of India? \n 1) Delhi\n 2)Mumbai\n 3)Chennai");
			option = s.nextInt();

			if (option == correct1) {
				System.out.println("That's Right!");
				count++;
			}
			else
			{
				System.out.println("Sorry!, Capital of India is : Delhi");
			}

			System.out.println("Q2) Can you store the value dog in a variable of type int? \n 1) yes\n 2)no");
			option = s.nextInt();

			if (option == correct2) {
				System.out.println("That's Right!");
				count++;
			} 
			else
			{
				System.out.println("Sorry!, dog is a string, ints can only store numbers");
			}
			System.out.println("Q3) What is the result of 9+9/3? \n 1) 5\n 2)12\n 3)15/3");
			option = s.nextInt();

			if (option == correct3) {
				System.out.println("That's Right!");
				count++;
			} 
			else
			{
				System.out.println("Sorry!, the result is 12.");
			}
			System.out.println("Congratulations!!Your score is "+count+ " out of 3.\n Thanks for playing.");
		}
		else {
			System.out.println("Hoping for next time");
		}
	}

}
