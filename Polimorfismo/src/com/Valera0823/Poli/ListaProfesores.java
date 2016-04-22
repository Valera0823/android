package com.Valera0823.Poli;
import java.util.ArrayList;

public class ListaProfesores {

	private ArrayList<Profesor> listaProfesores;
	
	public ListaProfesores()
	{
		listaProfesores = new ArrayList<Profesor>();
	}
	
	public void AddProfesor(Profesor _Profesor)
	{
		listaProfesores.add(_Profesor);
	}
	
	public void Listar()
	{
		System.out.println("Se mostrar los datos");
		for(Profesor tmp : listaProfesores)
		{
			tmp.MostrarDatos();
		}
	}
}
