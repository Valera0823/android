package com.Valera0823.Poli;

public class Profesor extends Persona {
	
	private String id;
	
	public Profesor()
	{
		super();
		id = "Desconocido";
	}

	public Profesor(String _id , String _nom , String _ape , int _edad)
	{
		super(_nom,_ape,_edad);
		id = _id;
	}
	public Profesor( String _nom , String _ape , int _edad)
	{
		super(_nom,_ape,_edad);
		
	}

	public  String Getid()
	{
		return id;
	}
	public void Setid(String _id)
	{
		this.id = _id;
	}
	
	public void MostrarDatos()
	{
		System.out.println("id :"+id+"Nombre :"+this.getNombre()+" Apellido :"+this.getApellido());
	}



}
