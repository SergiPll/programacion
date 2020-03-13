package StringEjer12;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		
		// En un lugar de la mancha de cuyo nombre no quiero acordarme
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una frase:  ");
		String linea = sc.nextLine().toLowerCase();
		linea = linea.trim();
		
		int i = 0, j = linea.length() -1;
		
		boolean capicua = true;
		
		while (i < j) {
			if (linea.charAt(i) != linea.charAt(j))
				capicua = false;
			
			i++;
			j--;
		}
		
		if (capicua) {
			System.out.println(linea + " SI es capicua");
		} else { System.out.println(linea + " NO es capicua"); }
		
		
		sc.close();
	}
}