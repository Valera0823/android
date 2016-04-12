package com.Valera0823.FuncionFecha;

public class fecha {

	public class FECHA
	{
		private int Dia;
		private int Mes;
		private int A�o;
		
		
		public FECHA(int _dia , int _mes , int _a�o){
			this.Dia = _dia;
			this.Mes = _mes;
			this.A�o = _a�o;
		}
		
		public FECHA()
		{
			this.Dia = 0;
			this.Mes = 0;
			this.A�o = 0;
		}
		
		
		
		public void SetFecha(int _dia , int _mes , int _a�o){
			this.Dia = _dia;
			this.Mes = _mes;
			this.A�o = _a�o;
		}
		public String GetFecha(){
			
			return Dia+"/"+Mes+"/"+A�o;
		}
		
		public  Boolean CharcarFecha(FECHA _fecha){
			Boolean _d=false,_m=false , _a=false;
			if(_fecha.Dia > 0 && _fecha.Dia <31)
			{
				_d = true;
			}
			if(_fecha.Mes > 0 && _fecha.Mes <12)
			{
				_m = true;
			}
			if(_fecha.A�o > 0 )
			{
				_a = true;
			}
			if(_d && _m && _a)
			{
				return true;
			}else{
				return false;
			}
		}
		
		public Boolean CompararFecha(FECHA _fecha1 , FECHA _fecha2)
		{
			
			if(_fecha1.Dia == _fecha2.Dia)
			{
				if(_fecha1.Mes == _fecha2.Mes){
					
					if(_fecha1.A�o == _fecha2.A�o){
						return true;
					}else
						return false;

				}else
					return false;
	
			}else
				return false;
		}
	}

}
