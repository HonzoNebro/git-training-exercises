package com.lonebapps.cajondesastre.Igualdadidentidad;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(100, "Pepín", "Gálvez", "Ridruejo");
		Cliente cliente2 = new Cliente(100, "Pepín", "Gálvez", "Ridrueja");
		Cliente cliente3 = cliente1;

		//concepto de identidad
		if (cliente1 == cliente2) {
			System.out.println("son el mismo");
		} else {
			System.out.println("no son el mismo");
		}

		if (cliente1 == cliente3) {
			System.out.println("son el mismo");
		} else {
			System.out.println("no son el mismo");
		}
		
		//concepto de igualdad
		if (cliente1.equals(cliente2)) {
			System.out.println("son iguales");
		} else {
			System.out.println("distintos");
		}
		
		System.out.println("Hashcode de cliente 1: " + cliente1.hashCode());
		System.out.println("Hashcode de cliente 2: " + cliente2.hashCode());
		System.out.println("Hashcode de cliente 3: " + cliente3.hashCode());
		System.out.println("Hashcode del string Bartolo: "+ "Bartolo".hashCode());
		System.out.println("Hashcode del string Bartola: "+ "Bartola".hashCode());
		System.out.println("Hashcode del string Bartolo: "+ "Bartolo".hashCode());

	}

}
