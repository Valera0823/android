package com.Valera0823.onlineshop;

public class ipod extends electronic{
	
	

	private String color;
	
	public ipod(double _pr, String _mn,String _color) {
		super(_pr, _mn);
		this.color = _color;
	}
	
	public double PrecioVenta()
	{
		return super.getPrecioRegular() * 10;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String _color) {
		this.color = _color;
	}
	
}
