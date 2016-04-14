package Seccion;

public class futbolista extends seleccionfutbol{

	
	private int dorsal;
	private String demarcacion;
	public futbolista()
	{
		super();
	}
	
	public futbolista(int _id, String _nombre , String _ap ,int _edad,int _dor, String _demar){
		super(_id,_nombre,_ap,_edad);
		this.dorsal = _dor;
		this.demarcacion = _demar;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int _dorsal) {
		this.dorsal = _dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String _demarcacion) {
		this.demarcacion = _demarcacion;
	}

	public void JugarPartido()
	{
		System.out.println("Jugar partido");
	}
	public void Entrenar()
	{
		System.out.println("Entrenar");
	}
}
