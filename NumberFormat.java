package com.onesoft.exception;

public class NumberFormat {
	public static void main(String[] args) {
	String numberPlate ="TN14Z9141";
		try {
			int a=Integer.parseInt(numberPlate);
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("xx");
		}catch (NullPointerException e) {
			System.out.println("xxx");
		}catch (NumberFormatException e) {
			System.out.println("xxxx");
		}
	}

}
