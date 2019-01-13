package com.learn.java1;

public class PassByReferenceValue {
	
	static void m1(int val) {
		System.out.println(val);
		val = 100;
	}
	
	static class INT {
		int val;
	}
	
	static void m2(INT in) {
		System.out.println(in.val);
		in.val = 100;
	}
	
	public static void main(String[] args) {
		int a = 10;
		m1(a);
		System.out.println(a);
		INT b = new INT();
		b.val = 10;
		m2(b);
		System.out.println(b.val);
	}
}
