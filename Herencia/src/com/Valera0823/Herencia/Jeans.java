package com.Valera0823.Herencia;


public class Jeans extends Ropa
{
	private String corte;
	private char genero;
	public Jeans(int id,double precio, String Talla,String Color,String corte,char genero){
		this.corte=corte;
		this.genero=genero;
	}
	public static void main(String[] args) {
		
	}
	public void mostrarDatos(String _Nc)
	{
		System.out.println("id:"+id);
		System.out.println("Talla:"+Talla);
		System.out.println("$:"+Precio);
		System.out.println("Color:"+Color);
	}
}

