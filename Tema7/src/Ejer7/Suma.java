package Ejer7;
/*

Sergi Pastor Llopis

*/
public class Suma extends Operacion {
	
	double suma = num1 + num2;
	
	public Suma(double num1, double num2) {
		
		super(num1, num2);
		operacion = '+';
		res = suma;
	}
	
}