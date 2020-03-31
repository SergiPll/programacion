package Ejer3;
/*

Sergi Pastor Llopis

*/
public class Main {
	
	public static void main(String[] args) {
		Empleado E1 = new Empleado("Manel"); 
		Directivo D1 = new Directivo("Sergi"); 
		Operario OP1 = new Operario("Jose María"); 
		Oficial OF1 = new Oficial("Paco"); 
		Tecnico T1 = new Tecnico ("Alberto");
		
		
		System.out.println(E1); 
		System.out.println(D1); 
		System.out.println(OP1); 
		System.out.println(OF1); 
		System.out.println(T1); 
	}
}