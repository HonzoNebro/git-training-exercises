package com.lonebapps.cajondesastre.FlowControl;

public class Main {

	public static void main(String[] args) {
		int a = 3;
		for (; a < 5; System.out.println("hola")) {
			//continue outer;
			System.out.println(a++);
		}
		
		System.out.println(a);

	}

}
