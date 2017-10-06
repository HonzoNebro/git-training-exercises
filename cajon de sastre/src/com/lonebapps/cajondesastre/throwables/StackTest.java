package com.lonebapps.cajondesastre.throwables;

public class StackTest {
	
	public void m1(){
		System.out.println("m1 antes de invocar a m2");
		m2();
		System.out.println("m1 después de invocar a m2");
	}
	public void m2(){
		System.out.println("m2 antes de invocar a m3");
		m3();
		System.out.println("m2 después de invocar a m3");
	}
	public void m3(){
		System.out.println("m3");
		int a = 1/0;
	}

	public StackTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new StackTest().m1();
		

	}

}
