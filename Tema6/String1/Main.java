package String1;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str[] = new String[12];

		for (int i = 0; i < str.length; i++) {
			System.out.print("Nueva cadena: ");
			if (str[0] == null) {
				str[i] = sc.next();
			} else {
				str[i] = str[i-1] + " " + sc.next();
			}
		}
		System.out.println("El string introducido es: ");
		
		System.out.println(str[11]);
		
		sc.close();
	}
}