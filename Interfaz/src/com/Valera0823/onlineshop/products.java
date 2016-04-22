package com.Valera0823.onlineshop;

public abstract class products {

	private double PrecioRegular;
	
	public products(double _pr)
	{
		this.PrecioRegular = _pr;
	}

	public double getPrecioRegular() {
		return PrecioRegular;
	}

	public void setPrecioRegular(double precioRegular) {
		PrecioRegular = precioRegular;
	}
	
	public abstract double PrecioVenta();
}
