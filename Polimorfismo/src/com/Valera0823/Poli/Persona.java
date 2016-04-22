package com.Valera0823.Poli;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona()
	{
		nombre = "";
		apellido = "";
		edad = 0;
	}
	public Persona(String _nom ,String _ape , int _edad)
	{
		this.nombre = _nom;
		this.apellido = _ape;
		this.edad = _edad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}

}
