package Ejer6;
/*

Sergi Pastor Llopis

*/
public class Main {
	
	public static void main(String[] args) {

		
		double[] decimal = new double[10];
		
		for (int i = 0; i < 10; i++) {
			double numeroAleatorio = (double) (Math.random()*1);
			decimal[i] = numeroAleatorio;
			System.out.println("El número aleatorio guardado en la posición v[" + i + "] = " + decimal[i]);
		}
/*
	
	No me ha durat ni 5min jajaja
		
*/		

	}
}