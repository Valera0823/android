package com.Valera0823.onlineshop;

public abstract class electronic extends products{

	private String Manofactura;
	
	public electronic(double _pr,String _mn) {
		super(_pr);
		this.Manofactura = _mn;
	
	}

	public String getManofactura() {
		return Manofactura;
	}

	public void setManofactura(String manofactura) {
		Manofactura = manofactura;
	}

	
	
}
