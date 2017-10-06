package com.lonebapps.cajondesastre.ciclovida;

public class Test {

	private int numero = 100;
	public static int numeroStatic = 200;
	public static int numeroStatic2;

	static {
		System.out.println("Static1");
		numeroStatic2 = 500;
	}
	{
		System.out.println("bloque1");
	}

	static {
		System.out.println("Static2");
		numeroStatic2 = 600;
	}
	{
		System.out.println("Bloque2");
	}

	public Test() {
		System.out.println("Test()");
		System.out.println(numero);
	}

}
