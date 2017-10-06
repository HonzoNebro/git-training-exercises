package com.lonebapps.cajondesastre.Interfaces;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	private Interface1 interface1 = new Interface1Impl();
	//private Interface1 interface1 = new Bar();

	public static void main(String[] args) {
		//este codigo ya no va a ser editado! se queda como está!
		//este codigo es el representante de las 200 clases que tiene mi aplicacion
		
		Main main = new Main();
		
		main.interface1.dimeAlgo();
		main.interface1.escribeNumero();
		
		

	}

}
