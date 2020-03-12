package StringEjer8_1;

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
		String[] array1 = linea.split(" ");
		
		System.out.println("Este string tiene " + array1.length + " palabras");
		sc.close();
	}
}