package com.onesoft.exception;

public class CustomLog {
	public static void main(String[] args) throws LogInException{
		String a ="Siva@210399";
		String pass ="12345";
		System.out.println(a);
		if(a.contains("@")&&pass.length()>=6) {
			System.out.println("loged in successfully");
		}else {
			throw new LogInException("Invalid date");
		}
	}

}
