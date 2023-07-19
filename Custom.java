package com.onesoft.exception;

public class Custom {
	public static void main(String[] args) throws AgeException {
		String name = "Siva";
		System.out.println(name);
		int age = 17;
		if (age >= 18) {
			System.out.println("eligible");
		} else {
			throw new AgeException("Invalid Age");
		}
		String gender = "Male";
		System.out.println(gender);

	}
}
