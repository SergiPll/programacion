package Ejer7;
/*

Sergi Pastor Llopis

*/
public class Main {
	
	public static void main(String[] args) {
		
		Suma o1 = new Suma(2, 8);
		Resta o2 = new Resta(5, 3);
		Multiplicacion o3 = new Multiplicacion(8, 7);
		Division o4 = new Division(100, 50);
		
		o1.mostrarResultado();
		o2.mostrarResultado();
		o3.mostrarResultado();
		o4.mostrarResultado();
		
	}
	
}