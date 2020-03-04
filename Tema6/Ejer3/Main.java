package Ejer3;

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
		
		System.out.println("Introduzca " + max + " numeros ");
		int[] pares = new int[max];
/*
		for (int i = 0; i < max; i++) {
			temp[i] = sc.nextInt();
			while (temp[i] % 2 != 0) {
				temp[i] = sc.nextInt();
				}
		}
		
		for (int i = 0; i < max; i++) {
			System.out.print(temp[i] + " ");
		}
*/
		
		for (int i = 0; i < max; i++) {
			pares[i] = sc.nextInt();
		}
		
		for (int i = 0; i < max; i++) {
			if (pares[i] % 2 == 0) {
				System.out.print(pares[i] + " ");
			}
		}
		
		
		sc.close();
	}
}