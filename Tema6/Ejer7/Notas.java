package Ejer7;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Notas {
	
	private float[] notas = new float[10];
	float media = 0;
	Scanner sc = new Scanner(System.in);
	
	
	public Notas() {
	}
	
	public void leer() {
		media = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce la nota numero " + (i+1) + ": ");
			notas[i] = sc.nextFloat();
			media = media + notas[i];
		}
	}
	
	public float media() {
		return media/5;
	}
	
	public void Mostrar() {
		for (int i = 0; i < 5; i++) {
			System.out.print("\nNota asignatura " + (i+1) + ": " + notas[i]);
		}
		System.out.println("");
	}

	
}