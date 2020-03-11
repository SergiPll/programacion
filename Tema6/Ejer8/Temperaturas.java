package Ejer8;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Temperaturas {
	private float[] temp = new float[31];
	private RegistroMes mes = new RegistroMes();
	private Scanner sc = new Scanner(System.in);
	private int dia = 31;
	
	public Temperaturas() {
		
	}
	
	public void leer() {
		switch (mes.getMes()) {
		case "Enero":
			dia = 31;
			break;
		case "Febrero":
			if(mes.getAnyo() % 4 == 0) {
				dia = 29;
			} else { dia = 28; }
			break;
		case "Marzo":
			dia = 31;
			break;
		case "Abril":
			dia = 30;
			break;
		case "Mayo":
			dia = 31;
			break;
		case "Junio":
			dia = 30;
			break;
		case "Julio":
			dia = 31;
			break;
		case "Agosto":
			dia = 31;
			break;
		case "Septiembre":
			dia = 30;
			break;
		case "Octubre":
			dia = 31;
			break;
		case "Noviembre":
			dia = 30;
			break;
		case "Diciembre":
			dia = 31;
			break;
		}
		for (int i = 0; i < dia; i++) {
			System.out.println("Temperatura dia " + (i+1) + " : ");
			// temp[i] = i;
			temp[i] = sc.nextFloat();
		}
	}
	
	public float media() {
		float media = 0;
		for (int i = 0; i < dia; i++) {
			media = media + temp[i];
		}
		media = media / dia;
		return media;
	}
	
	public String Mostrar() {
		String todo = "";
		for (int i = 0; i < dia; i++) {
			todo = todo + ("\nDia " + (i+1) + ": ") + temp[i];
		}
		return todo;
	}
	
	public double maxima() {
		double max = 0;
		
		for (int i = 0; i < dia; i++) {
			if (temp[i] > max) {
				max = temp[i];
			}
		}
		
		return max;
	}
	
	public double minima( ) {
		double min = 9999999;
		
		for (int i = 0; i < dia; i++) {
			if (temp[i] < min) {
				min = temp[i];
			}
		}
		
		return min;
	}


}