package com.onesoft.exception;

public class Arithmatic {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int a = 10;
		int b=5;
		int c=0;
		System.out.println(a+b+c);
		try {
			System.out.println(a/c);

		} catch (Exception e) {
			System.out.println("dont divide any number by zero");	
			}
		System.out.println(a*b);
		System.out.println("ThankYou");
	}

}
