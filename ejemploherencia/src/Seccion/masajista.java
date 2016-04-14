package Seccion;

public class masajista extends seleccionfutbol{

	private String titulacion;
	private String AExperiencia;
	public masajista(){
		super();
	}
	
	public masajista(int _id, String _nombre , String _ap ,int _edad, String _tit ,String _AExp){
		super(_id,_nombre,_ap,_edad);
		this.titulacion = _tit;
		this.AExperiencia = _AExp;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getAExperiencia() {
		return AExperiencia;
	}

	public void setAExperiencia(String aExperiencia) {
		AExperiencia = aExperiencia;
	}
	
	public void DarMasje()
	{
		System.out.println(" Masje");
	}

}
