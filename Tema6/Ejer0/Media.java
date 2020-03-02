package Ejer0;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		System.out.println("Introduzca el maximo");
		max = sc.nextInt();
		
		System.out.println("");
		
		int suma = 0, suma2 = 0, positivo = 0, negativo = 0;
		int[] temp = new int[max];

		System.out.println("Introduzca " + max + " numeros enteros");
		
		for (int i = 0; i < max; i++) {
			temp[i] = sc.nextInt();
			
			if (temp[i] < 0) {
				negativo++;
				suma = suma + temp[i];
				System.out.println("Valor " + temp[i] + " anyadido a la suma");
				
			} else if (temp[i] > 0) {
				positivo++;
				suma2 = suma2 + temp[i];
				System.out.println("Valor " + temp[i] + " anyadido a la suma");
			}
		}
		
		suma = suma/negativo;
		suma2 = suma2/positivo;
		
		System.out.println("");
		
		System.out.println("Media de las temperaturas negativas: " + suma);
		System.out.println("Media de las temperaturas positivas: " + suma2);
		
		sc.close();
	}
}