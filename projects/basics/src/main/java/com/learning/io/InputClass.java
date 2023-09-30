package com.learning.io;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare variables and assign values
		int num1;
		float num2;
		char character;
		boolean bool;
		String str;
		double num3;

		// Creating object of Scanner class, to take input

		Scanner sc = new Scanner(System.in);

		System.out.println("enter int value ");
		//take input for num1
		num1 = sc.nextInt();

		System.out.println("enter float value ");
		//take input for num2
		num2 = sc.nextFloat();

		System.out.println("enter string value ");
		//take input for str
		str = sc.next();

		System.out.println("enter double value ");
		//take input for num3
		num3 = sc.nextDouble();

		System.out.println("enter boolean value ");
		//take input for bool
		bool = sc.nextBoolean();

		System.out.println("enter character value ");
		//take input for character
		character = sc.next().charAt(0);

		System.out.println("int -> " + num1);
		System.out.println("float -> " + num2);
		System.out.println("char -> " + character);
		System.out.println("boolean -> " + bool);
		System.out.println("String -> " + str);
		System.out.println("double -> " + num3);
		

	}

}
