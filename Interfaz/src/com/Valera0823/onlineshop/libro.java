package com.Valera0823.onlineshop;

public class libro extends products{

	private String publicacion;
	private int YearPublic;
	
	public libro(double _pr, String _p , int _y) {
		super(_pr);
		this.publicacion = _p;
		this.YearPublic = _y;
	}
	
	public double PrecioVenta()
	{
		return super.getPrecioRegular() * 7;
	}

	public String getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(String _publicacion) {
		this.publicacion = _publicacion;
	}

	public int getYearPublic() {
		return YearPublic;
	}

	public void setYearPublic(int _yearPublic) {
		this.YearPublic = _yearPublic;
	}

}
