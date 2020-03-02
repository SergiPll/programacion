package Ejer1;
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
		
		int suma = 0, suma2 = 0, impar = 0, par = 0;
		int[] temp = new int[max];

		System.out.println("Introduzca " + max + " numeros enteros");
		
		for (int i = 0; i < max; i++) {
			temp[i] = sc.nextInt();
			
			if (temp[i] % 2 == 0) {
				par++;
				suma = suma + temp[i];
				
			} else if (temp[i] % 2 != 0) {
				impar++;
				suma2 = suma2 + temp[i];
			}
		}
		
		if (suma <= 0) {
			suma = 0;
		} else { suma = suma/par; }
		if (suma2 <= 0) {
			suma2 = 0;
		} else { suma2 = suma2/impar; }
		
		System.out.println("");
		
		System.out.println("Media par: " + suma);
		System.out.println("Media impar: " + suma2);
		
		sc.close();
	}
}