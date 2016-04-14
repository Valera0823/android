package Seccion;

public class entrenador extends seleccionfutbol{

	private String idFederacion;
	
	public entrenador(){
		super();
	}
	public entrenador(int _id, String _nombre , String _ap ,int _edad, String _idF){
		super(_id,_nombre,_ap,_edad);
		this.idFederacion = _idF;
	}
	public String getIdFederacion() {
		return idFederacion;
	}
	public void setIdFederacion(String _idFederacion) {
		this.idFederacion = _idFederacion;
	}
	
	public void dirigirPartido()
	{
		System.out.println("Dirigir partido");
	}

	
	public void dirigirEntrenamiento()
	{
		System.out.println("Dirigir Entrenamiento");
	}

	
}
