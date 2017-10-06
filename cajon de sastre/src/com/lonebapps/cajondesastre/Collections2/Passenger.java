package com.lonebapps.cajondesastre.Collections2;

import java.io.Serializable;
import java.util.Date;

public class Passenger implements Serializable, Comparable<Passenger> {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name, surname, sex;
	private Date birthDate;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(int id, String name, String surname, String sex, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", name=" + name + ", surname=" + surname + ", sex=" + sex + ", birthDate="
				+ birthDate + "]";
	}

	@Override
	public int compareTo(Passenger other) {

		// ESTE METODO ESTABLECERÁ EL ORDEN NATURAL DE TreeSet
		// orden descendente
		// return this.id - other.id;

		// orden ascendente
		// return otro.id - this.id;

		// La clase String implementa el método compareTo, así que podemos
		// usarlo sin más
		// return this.name.compareTo(other.name);
		// return other.name.compareTo(this.name);

		// La clase Date implementa el método compareTo, así que podemos usarlo
		// sin más
		// return this.birthDate.compareTo(other.birthDate);
		// return other.birthDate.compareTo(this.birthDate);

		// Comparar como criterio el sexo y en caso de igualdad, el segundo
		// criterio será la edad...
		// Si el sexo es distinto, devuelve el primero en orden alfabético
		if (this.sex.compareTo(other.sex) != 0) {
			return this.sex.compareTo(other.sex);
			// si el sexo es igual, devuelve el que nació antes
		} else if (this.birthDate.compareTo(other.birthDate) != 0) {
			return this.birthDate.compareTo(other.birthDate);
			// si las fechas de nacimiento son las mismas, devuelve el que tenga
			// un id menor. Sirve para desempatar la comparación ya que el sexo
			// y la fecha de nacimiento podrían coincidir
		} else {
			return this.id - other.id;
		}
	}

}
