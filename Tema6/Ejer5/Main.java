package Ejer5;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0, valor1 = 0, valor2 = 0;
		System.out.println("Introduzca el maximo");
		max = sc.nextInt();
		
		System.out.println("");
		
		
		String[] nombres = new String[max];
		int[] sueldos = new int[max];
	
		
		System.out.println("Introduce 10 nombres\n");
		for(int i = 0; i < max; i++) {
			nombres[i] = sc.next();
		}
		System.out.println("Introduce 10 sueldos\n");
		for(int i = 0; i < max; i++) {
			sueldos[i] = sc.nextInt();
			if (sueldos[i] > valor1) {
				valor1 = sueldos[i];
				valor2 = i;
			}
		}
		
		
		System.out.println("Empleado con sueldo mas alto: " + nombres[valor2] + " " + sueldos[valor2]);
		sc.close();
	}
}