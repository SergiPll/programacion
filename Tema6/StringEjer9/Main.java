package StringEjer9;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		
		// En un lugar de la mancha de cuyo nombre no quiero acordarme
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String linea = sc.nextLine();
		linea = linea.trim();
		String[] array1 = linea.split(" ");
		
		System.out.println("Eliminar ultima palabra: ");
		
		for (int i = 0; i < array1.length-1; i++) {
			System.out.print(array1[i] + " ");
		}
		
		sc.close();
	}
}