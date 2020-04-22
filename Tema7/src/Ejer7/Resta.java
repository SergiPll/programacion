package Ejer7;
/*

Sergi Pastor Llopis

*/
public class Resta extends Operacion{
	
	double resta = num1 - num2;
	
	public Resta(double num1, double num2) {
		
		super(num1, num2);
		operacion = '-';
		res = resta;
	}
	
}