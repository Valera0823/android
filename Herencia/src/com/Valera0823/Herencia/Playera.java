package com.Valera0823.Herencia;

public class Playera extends Ropa
{
	private String Corte;
	
	public static void main(String[] args) {
		
	}
	private Playera(int _id, double _precio, String _talla, String _Color, String _Corte)
	{
		this.Corte = _Corte;
	}
	public void mostrarDatos(String _Nc)
	{
		System.out.println("id:"+id);
		System.out.println("Talla:"+Talla);
		System.out.println("$:"+Precio);
		System.out.println("Color:"+Color);
	}
	
}

