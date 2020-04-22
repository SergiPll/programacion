package Ejer7;
/*

Sergi Pastor Llopis

*/
public class Multiplicacion extends Operacion{
	
	double mult = num1 * num2;
	
	public Multiplicacion(double num1, double num2) {
		
		super(num1, num2);
		operacion = '*';
		res = mult;
	}
	
}