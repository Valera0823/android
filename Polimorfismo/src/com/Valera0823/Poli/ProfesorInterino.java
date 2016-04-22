package com.Valera0823.Poli;
import java.util.Calendar;
public class ProfesorInterino extends Profesor{

		private Calendar fci ;
		
		public ProfesorInterino(Calendar _fci)
		{
			super();
			this.fci = _fci;
		}
		
		public ProfesorInterino(String _nombre,String _ape , int _edad,Calendar _fci)
		{
			super(_nombre, _ape , _edad);
			this.fci = _fci;
		}

		public Calendar getFci() {
			return fci;
		}
		public void MostrarDatos(){
			System.out.println("Fecha de comienzo Interinidad_:"+fci.getTime().toString()+" Nombre:"+this.getNombre()+" Apellido:"+this.getApellido());
		}
}
