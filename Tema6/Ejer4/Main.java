package Ejer4;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		System.out.println("Introduzca el maximo");
		max = sc.nextInt();
		
		System.out.println("");
		
		int cont1 = 0, cont2 = 0, cont3 = 0;
		
		System.out.println("Introduzca " + max + " numeros ");
		int[] num = new int[max];
		
		for (int i = 0; i < max; i++) {
			num[i] = sc.nextInt();	
			if (num[i] > 0) {
				cont1++;
			} else if (num[i] < 0) {
				cont2++;
			} else if (num[i] == 0) {
				cont3++;
			}
		}
		System.out.println("Hay " + cont1 + " positivos\n" + "Hay " + cont2 + " negativos\n" + "Hay " + cont3 + " iguales a 0");
		
		sc.close();
	}
}