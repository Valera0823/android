package com.Valera0823.P1;

public class pez extends animal {
	
	private String TipoAgua;
	private String Tipo;
	
	public pez(int _patas, String _ali,String _tp,String _t)
	{
		super (_patas,_ali);
		this.TipoAgua = _tp;	
		this.Tipo = _t;
	}
	
	public String getTipoAgua() {
		return TipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		TipoAgua = tipoAgua;
	}
	
	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public void MostrarDatos()
	{
		System.out.println("Pez ->"+this.getTipo() +" Tipo agua:"+this.getTipoAgua()+" alimentacion:"+this.getAlimentacion()+" Numero Patas:"+this.getPatas());
	}

}
