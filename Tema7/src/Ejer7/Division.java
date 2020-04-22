package Ejer7;
/*

Sergi Pastor Llopis

*/
public class Division extends Operacion{
	
	double div = num1 / num2;
	

	public Division(double num1, double num2) {
		
		super(num1, num2);
		operacion = '/';
		res = div;
	}
	
}