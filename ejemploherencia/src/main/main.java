package main;

import java.util.ArrayList;

import Seccion.entrenador;
import Seccion.futbolista;
import Seccion.masajista;
import Seccion.seleccionfutbol;

public class main {
	public static ArrayList<seleccionfutbol> integranes = new ArrayList<seleccionfutbol>();
			
	public static void main(String[] args)
	{
		entrenador delbosque = new entrenador(1,"vicente","Del bosque",60,"290213");
		futbolista iniesta = new futbolista(2,"andres","iniesta",29,6,"interior derecho");
		masajista raulMartinez = new masajista(3,"raul","martinez",41,"licenciado en fisioterapia","10");
		
		integranes.add(delbosque);
		integranes.add(iniesta);
		integranes.add(raulMartinez);
		//concentracion
		System.out.println("Comienza Concentracion");
		for(seleccionfutbol integrate : integranes)
		{
			System.out.print(integrate.getNombre()+" "+integrate.getApellidos()+ "->");
			integrate.Concentrarse();
		}
		//viaje
		System.out.println("Comienza viaje");
		for(seleccionfutbol integrate : integranes)
		{
			System.out.print(integrate.getNombre()+" "+integrate.getApellidos()+ "->");
			integrate.Viajar();
		}
		//Entrenamiento
		System.out.println("Comienza Concentracion");
		System.out.print(delbosque.getNombre()+" "+delbosque.getApellidos()+"->");
		delbosque.dirigirEntrenamiento();
		System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+"->");
		iniesta.Entrenar();
		//Entrenamiento
		System.out.println("Comienza El masaje");
		System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+"->");
		raulMartinez.DarMasje();
		
		//Partido
		System.out.println("Comienza el partido");
		System.out.print(delbosque.getNombre()+" "+delbosque.getApellidos()+"->");
		delbosque.dirigirPartido();
		System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+"->");
		iniesta.JugarPartido();
		
		
		
		
		
		
	}
}
