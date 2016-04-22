package com.Valera0823.Abstrac;

public class Main {

	public static void main(String[] args) {
		
		//Crear el objeto humano e instanciarlo y asignarle el tipo class human 
		
		Human human1 = new Human("Alian");
		human1.walk();
		//Instanciar human1 a livingThing
		LivingThing  liv2 = human1;
		liv2.walk();
		//Crear el objeto mono e instanciarlo a livingThing
		LivingThing liv3 = new Monkey("Jimy");
		liv3.walk();
		
		System.out.println("Human ->"+ human1.getName());
		System.out.println("LivingThing->"+liv2.getName());
		
		boolean b1 = (human1 == liv2);
		System.out.println("Human1 y liv2 apuntan al mismo objeto instanciado->"+b1);
		
		//Esto sirve para definir clases obstractas plz;
	}

}
