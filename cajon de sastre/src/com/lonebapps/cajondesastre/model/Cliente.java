package com.lonebapps.cajondesastre.model;

public class Cliente extends Persona{
	
	private boolean tarjetaGold;

	@Override
	public String toString() {
		return "Cliente [tarjetaGold=" + tarjetaGold + ", toString()=" + super.toString() + "]";
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public boolean isTarjetaGold() {
		return tarjetaGold;
	}

	public void setTarjetaGold(boolean tarjetaGold) {
		this.tarjetaGold = tarjetaGold;
	}

}
