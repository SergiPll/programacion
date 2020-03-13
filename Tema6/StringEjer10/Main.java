package StringEjer10;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		
		// En un lugar de la mancha de cuyo nombre no quiero acordarme
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String linea = sc.nextLine().toLowerCase();
		
		System.out.print("Introduzca el caracter del que desea contar cuantas veces aparece: ");
		
		char ch1 = sc.next().charAt(0);
	
		char[] array1 = linea.toCharArray();
		
		int a = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == ch1) {
				a++;
			}
		}
		
		
		System.out.println("El caracter '"+ ch1 + "' aparece " + a + " veces en la frase introducida");
		sc.close();
	}
}