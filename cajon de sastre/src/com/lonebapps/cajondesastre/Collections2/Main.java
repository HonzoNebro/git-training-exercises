package com.lonebapps.cajondesastre.Collections2;

import java.text.SimpleDateFormat;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	
	private static Passenger p1 = new Passenger(10,"Pepín","Gálvez","m",null);
	private static Passenger p2 = new Passenger(11,"Marta","López","f",null);
	private static Passenger p3 = new Passenger(12,"Lidia","Muñoz","f",null);
	private static Passenger p4 = new Passenger(13,"Carles","Zunzunegi","m",null);
	private static Passenger p5 = new Passenger(14,"Bertín","Rojo","m",null);
	
	static {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try{
			p1.setBirthDate(sdf.parse("26/07/1989"));
			p2.setBirthDate(sdf.parse("19/06/1996"));
			p3.setBirthDate(sdf.parse("9/11/2001"));
			p4.setBirthDate(sdf.parse("1/03/1984"));
			p5.setBirthDate(sdf.parse("23/06/1956"));
		}catch (Exception e){
			
		}
	}
	
	public static void testLinkedHashSet(){//sin indice, se establece un orden de llegada, los elementos estan enlazados para mantener el orden
		
		Set<Passenger> passengers = new LinkedHashSet<Passenger>();
		passengers.add(p3);
		passengers.add(p2);
		passengers.add(p1);
		passengers.add(p5);
		passengers.add(p4);
		
		System.out.println("LinkedHashSet:");
		//SE MOSTRARAN POR CONSOLA EN EL ORDEN EN QUE FUERON INTRODUCIDOS, A DIFERENCIA DEL SET
		for (Passenger passenger : passengers) {
			System.out.println(passenger);
		}
		System.out.println("****************************************************************************************************\n");
		
		//passengers.get(2); No existe
		
		
	}
	
	public static void testTreeSet(){//orden natural (SORTED), los objetos han de implementar <<comparable <T>>>
		Set<Passenger> passengers = new TreeSet<Passenger>();
		passengers.add(p3);
		passengers.add(p2);
		passengers.add(p1);
		passengers.add(p5);
		passengers.add(p4);
		
		System.out.println("TreeSet:");
		//EL ORDEN NATURAL SERÁ EL ESTABLECIDO EN EL METODO compareTo, QUE HA DE SER IMPLEMENTADO AL USAR LA INTERFAZ COMPARABLE
		for (Passenger passenger : passengers) {
			System.out.println(passenger);
		}
		System.out.println("****************************************************************************************************\n");
		
	}
	
	
	//HashMap las claves se devuelven de forma aleatoria
	
	//las claves están ordenadas por orden de llegada
	public static void testLinkedHashMap(){}
	
	
	//las claves están constituidas en forma de arbol, usando el orden natural, requiere comparable 
	public static void testTreeMap(){}

	public static void main(String[] args) {
		
		testLinkedHashSet();
		testTreeSet();
		testLinkedHashMap();
		testTreeMap();
	}

}
