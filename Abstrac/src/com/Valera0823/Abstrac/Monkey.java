package com.Valera0823.Abstrac;

public class Monkey extends LivingThing{
	
	public Monkey(String _name)
	{
		super(_name);
	}
	
	public void walk(){
		System.out.println("Mono "+this.getName()+" camina");
	}

}
