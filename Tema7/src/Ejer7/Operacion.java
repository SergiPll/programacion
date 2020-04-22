package Ejer7;
/*

Sergi Pastor Llopis

*/
public class Operacion {
	
	
	protected double num1, num2, res;
	protected char operacion = ' ';
	
	
	public Operacion(double num1, double num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public void mostrarResultado() {
		System.out.println(num1 + " " + operacion + " " + num2 + " = " + res);
	}
	
}