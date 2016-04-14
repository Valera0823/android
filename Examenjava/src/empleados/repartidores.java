package empleados;

public class repartidores extends empleado {
	
	private String trasporte;
	private String Matricula;
	
	public repartidores(String _n,String _a ,int _ed , String _t , int _s , String _tras ,String _ma){
		super(_n,_a,_ed,_t,_s);
		this.trasporte = _tras;
		this.Matricula = _ma;
	}
	public String getTrasporte() {
		return trasporte;
	}
	public void setTrasporte(String trasporte) {
		this.trasporte = trasporte;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public void Repartir()
	{
		System.out.println("Repartir paquetes");
	}
	public void RecojerPaquete()
	{
		System.out.println("Recojer Paquete");
	}

}
