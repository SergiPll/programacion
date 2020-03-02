package Ejer2;
/*

Sergi Pastor Llopis

*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		System.out.println("Introduzca el maximo");
		max = sc.nextInt();
		
		System.out.println("");
		
		float suma = 0, cont = 0;
		float[] temp = new float[max];

		System.out.println("Introduzca " + max + " numeros enteros");
		
		for (int i = 0; i < max; i++) {
			System.out.print("Alumno " + i + " -- ");
			temp[i] = sc.nextInt();
			
			suma = suma + temp[i];
			cont++;
			}
		suma = suma/cont;
		
		System.out.println("");
		
		System.out.println("Media: " + suma);
		
		for (int i = 0; i < max; i++) {
			if (temp[i] > suma) {
				System.out.println("Alumno " + i + " supera la media");
			}
		}
		sc.close();
	}
}