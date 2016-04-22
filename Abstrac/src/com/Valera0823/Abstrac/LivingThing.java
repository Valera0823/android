package com.Valera0823.Abstrac;

public abstract class LivingThing {
		
	private String name;
	
	public LivingThing(String _name)
	{
		this.name = _name;
	}
	
	public void breath()
	{
		System.out.println("Living thing esting");
	}
	
	//Metodo abstracto Walk 
	//Este metodo va a aser implementado para la sub-clase Living
	
	public abstract void walk();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
