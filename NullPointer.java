package com.onesoft.exception;

public class NullPointer {
	public static void main(String[] args) {
		System.out.println("welcome");
		String name = null;
		try {
			System.out.println(name.toUpperCase());

		} catch (ArithmeticException e) {
			System.out.println("need number values");
		} catch (NumberFormatException e) {
			System.out.println("need number format values");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("try another exception");
		} catch (NullPointerException e) {
			// System.out.println(e);
			// System.out.println("dont give null ");
			e.printStackTrace();
		}

		System.out.println("ThankYou");
	}

}
