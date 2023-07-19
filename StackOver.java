package com.onesoft.exception;

public class StackOver {
	public void test1() {
		test2();
	}public void test2() {
		test1();
	}
	public static void main(String[] args) {
		StackOver s= new StackOver();
		s.test1();
	}

}
