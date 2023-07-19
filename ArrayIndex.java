package com.onesoft.exception;

public class ArrayIndex {
	public static void main(String[] args) {
		String a[] = { "siva", "deepan", "nandy", "sushmitha", "sakthi" };
		System.out.println("welcome");
		try {
			String n = a[6].toUpperCase();
			System.out.println("x");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("xx");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("xxx");
		} // catch (IndexOutOfBoundsException e) {
			// System.out.println("xxxx");
			// }
		finally {
			System.out.println("xxxxxxxxxx");
		}
		System.out.println("Thank you");
	}
}
