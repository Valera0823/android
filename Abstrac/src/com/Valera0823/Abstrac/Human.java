package com.Valera0823.Abstrac;

public class Human extends LivingThing{

	public Human(String _name)
	{
		super(_name);
	}
	
	public void walk(){
		System.out.println("Humano "+this.getName()+" camina");
	}


}
