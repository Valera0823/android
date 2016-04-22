package com.Valera0823.onlineshop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		products [] pa = new products[4];
		
		pa[0] = new tv(2300,"LG",23);
		pa[1] = new tv(1500,"Sam",12);
		pa[2] = new ipod(1500,"ipotato","negro");
		pa[3] = new libro(1500,"Juanitos",1998);
		
		double TotalPR = 0;
		double TotalVenta = 0;
		
		for(int i = 0 ; i < pa.length ; i++)
		{
			TotalPR+= pa[i].getPrecioRegular();
			TotalVenta+= pa[i].PrecioVenta();
			System.out.println("Item->"+i+" Tipo"+pa[i].getClass().getName()+" Precio regular :"+pa[i].getPrecioRegular()+ " Precio de venta :" + pa[i].PrecioVenta());
	
		}
		System.out.println("Total Precio Regular ->"+TotalPR);
		System.out.println("Total Precio venta ->"+TotalVenta);
	}
	

}
