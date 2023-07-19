package com.onesoft.exception;

public class IndexOut {
	public static void main(String[] args) {
		String a = "Siva";
		System.out.println(a.indexOf("o"));
		try {
			System.out.println(a.charAt(6));
		} catch (ArithmeticException e) {
			System.out.println("x");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("xx");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("xxx");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("xxxx");
		}
	}

}