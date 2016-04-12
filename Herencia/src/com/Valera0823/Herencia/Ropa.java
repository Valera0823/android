package com.Valera0823.Herencia;

public class Ropa {
	
private int id;
private String Talla;
private double Precio;
private String Color;

	private Ropa(int _id,String _talla , double _precio, String _Color)
	{
		this.id = _id;
		this.Talla = _talla;
		this.Precio = _precio;
		this.Color = _Color;
		//super();
	}
	
	public void mostrarDatos(String _Nc)
	{
		System.out.println("id:"+id);
		System.out.println("Talla:"+Talla);
		System.out.println("$:"+Precio);
		System.out.println("Color:"+Color);
	}
}
