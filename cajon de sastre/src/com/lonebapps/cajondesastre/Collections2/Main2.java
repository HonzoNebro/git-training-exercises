package com.lonebapps.cajondesastre.Collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		String s1 = "Alberto";
		String s2 = "Marta";
		String s3 = "Carlota";
		String s4 = "Bartolo";

		List<String> names = new ArrayList<String>();

		names.add(s1);
		names.add(s2);
		names.add(s3);
		names.add(s4);

		// si imprimimos la lista, esta aparece en "orden de llegada"
		System.out.println("Orden de llegada");
		System.out.println(names);
		System.out.println("**********************************************\n");

		// 1)Me interesa reestructurar la lista, de forma aleatoria!
		// utilizaré la clase de utilidad collections
		Collections.shuffle(names);
		System.out.println("Ordenado aleatoriamente");
		System.out.println(names);
		System.out.println("**********************************************\n");

		// 2) Me interesa reeestructurar la lista según el orden natural de la
		// clase String!
		// utilizaré la clase de utilidad collections
		Collections.sort(names);
		System.out.println("Orden natural de clase String");
		System.out.println(names);
		System.out.println("**********************************************\n");

		// 3) Me interesa reestructurar la lista utilizando un criterio que no
		// sea el orden natural
		// utilizaré la clase de utilidad collections
		// el método sort se encarga de hacer el trabajo (es necesario pasarle
		// un comparator<String>

		// instanciamos el interface Comparator<T>, ALGO QUE NO DEBERÍA SER
		// POSIBLE
		// por tanto, vamos a implementarlo
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String string, String string2) {
				return (string2.compareTo(string)) * -1;
			}
		});
		System.out.println("Criterio sin orden natural, alfabetico descendiente");
		System.out.println(names);
		System.out.println("**********************************************\n");

	}

}
