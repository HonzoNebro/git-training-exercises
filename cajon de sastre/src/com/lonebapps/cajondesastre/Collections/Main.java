package com.lonebapps.cajondesastre.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//testList();
		//testSet();
		testMap();

	}

	private static void testList() {
		Carta c1 = new Carta(5, Palo.CORAZÓN);
		Carta c2 = new Carta(7, Palo.TREBOL);
		Carta c3 = new Carta(1, Palo.PICA);
		Carta c4 = new Carta(10, Palo.DIAMANTE);
		
		//Vamos a crear la lista...
		
		List<Carta> cartas = new ArrayList<Carta>();
		
		//insertar elementos en la lista
		cartas.add(c1); //devolverá un boolean que no vamos a usar
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		
		//obtener el número de elementos
		System.out.println("Número de elementos: "+cartas.size());
		
		//obtener el elemento i-ésimo...
		System.out.println("La carta 2 --> "+cartas.get(1));
		
		//iterar la lista
		// 1) con el iterator
		Iterator<Carta> iterador = cartas.iterator();
		
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
		
		//2) con el por clásico
		
		printHeader();
		
		for (int i = 0; i < cartas.size(); i++) {
			System.out.println("carta número "+ i + ": "+ cartas.get(i));
		}
		
		//3) con el "for each"
		printHeader();
		for(Carta carta:cartas){
			System.out.println(carta);
		}
		
		// operaciones varias...
		printHeader();
		cartas.remove(1); //quitar la carta de la segunda posicion
		System.out.println("Tamaño de cartas: "+cartas.size());
		System.out.println(cartas);
		cartas.remove(c1); //quitar la carta c1
		System.out.println("Tamaño de cartas: "+cartas.size());
		System.out.println(cartas);
		System.out.println("Limpiar cartas");
		cartas.clear();
		System.out.println("Reintroducir cartas");
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		System.out.println("Contiene la carta c3?"+ cartas.contains(c3));
		
		//copiar listas ATENCIÓN
		
		//List<Carta> cartas2 = cartas; //ojo esto no crea una copia
		
		printHeader();
		List<Carta> cartas2 = new ArrayList<Carta>(); //OJO ESTO ES UN SHALLOW COPY
		for(Carta carta: cartas){ //en esta nueva lista, se apuntan a las cartas ya existentes
			cartas2.add(carta);
		}
		//cartas2.remove(2);  esto elimina de la lista cartas2, la tercera carta, pero la carta sigue existiendo en la lista cartas
		cartas2.get(2).setNumero(666); //esto demuestra que la carta si se ve afectada
		System.out.println(cartas);
		
	}

	private static void testSet() {
		Carta c1 = new Carta(5, Palo.CORAZÓN);
		Carta c2 = new Carta(7, Palo.TREBOL);
		Carta c3 = new Carta(1, Palo.PICA);
		Carta c4 = new Carta(10, Palo.DIAMANTE);
		
		Set<Carta> cartas = new HashSet<Carta>();
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		
		//NO TIENE INDICE, por tanto usamos foreach y es siempre desordenado
		printHeader();
		for (Carta carta : cartas) {
			System.out.println(carta);
		}

	}

	private static void testMap() {
		
		Carta c1 = new Carta(5, Palo.CORAZÓN);
		Carta c2 = new Carta(7, Palo.TREBOL);
		Carta c3 = new Carta(1, Palo.PICA);
		Carta c4 = new Carta(10, Palo.DIAMANTE);
		
		Map<Integer,Carta> map = new HashMap<Integer,Carta>();
		
		map.put(1, c1);
		map.put(2, c2);
		map.put(3, c3);
		map.put(3, c4);
		System.out.println("Tamaño del map: "+map.size());
		
		//obtener un value a partir de la key
		System.out.println("Carta 2: "+map.get(2));
		
		//iterar un map
		//1) obteniendo previamente el conjunto de claves
		printHeader();
		Set<Integer> claves = map.keySet();
		for (Integer clave : claves) {
			System.out.println(map.get(clave));			
		}
		
		//2) obteniendo directamente la colección de values...
		printHeader();
		Collection<Carta> values = map.values();
		System.out.println("Cartas que se obtienen a partir de los values del map");
		for (Carta carta : values) {
			System.out.println(carta);
		}
		
		//que pasa si se vuelve a hacer put con una key ya existente
		printHeader();
		System.out.println("tamaño: "+map.size());
		System.out.println(map);
		System.out.println("Sustituimos la primera key");
		map.put(1, new Carta(11,Palo.CORAZÓN));
		System.out.println("tamaño: "+map.size());
		System.out.println(map);
	}

	private static void printHeader() {
		System.out.println("\n**************************************************\n");
	}

}
