package Seccion;

public class seleccionfutbol {

	protected int id;
	protected String Nombre;
	protected String Apellidos;
	protected int Edad;
	
	public seleccionfutbol(){
	
	}
	public seleccionfutbol(int _id,String _nombre,String _apellidos , int _edad){
		this.id = _id;
		this.Nombre = _nombre;
		this.Apellidos = _apellidos;
		this.Edad = _edad;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public int GetId()
	{
		return id;
	}
	public void SetId(int _id){
		this.id = _id;
	}
	public String GetNombre()
	{
		return Nombre;
	}
	public void SetNombre(String _Nombre){
		this.Nombre = _Nombre;
	}
	
	public void Concentrarse()
	{
		System.out.println("Concentrarse");
	}
	public void Viajar(){
		System.out.println("viajar");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
