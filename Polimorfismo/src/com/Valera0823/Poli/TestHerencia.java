package com.Valera0823.Poli;
import java.util.Calendar;

public class TestHerencia {

	public static void main(String[] args) {
		
		Profesor prof = new Profesor("Juan","Carlos",23);
		prof.Setid(" EAR1");
		
		Calendar f1 = Calendar.getInstance();
		f1.set(2016, 8, 1);
		
		ProfesorInterino Int1 = new ProfesorInterino("Alain","Barragan",60,f1);
		
		ListaProfesores Lista1 = new ListaProfesores();
		Lista1.AddProfesor(prof);
		Lista1.AddProfesor(Int1);
		Lista1.Listar();
	}

}
