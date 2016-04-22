package com.Valera0823.onlineshop;

public class tv extends electronic{

	int tam;
	
	public tv(double _pr, String _mn,int _tam) {
		super(_pr, _mn);
		this.tam = _tam;
	}
	
	public double PrecioVenta()
	{
		return super.getPrecioRegular() * 22;
	}

	
}
