package com.JavaApp;

import java.util.Date;
import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		
		//Sum
		num1=num1+num2;
		
		System.out.println("Sum is :"+ num1);
		
		//Date
		System.out.println("Jenkins Test Started:" + new Date());

	}

}
