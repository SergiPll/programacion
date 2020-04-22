package Ejer6;
/*

Sergi Pastor Llopis

*/
public class Comercial extends Empleado{
	
	protected double comision;

	
	
	public Comercial() {
	}
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}
		
	
	
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}

	
	
	public String toString() {
		String todo = super.toString();
		todo = todo + "\nComision: "+ comision;
		return todo;
	}
	
	public void plus() {
		if (edad >= 30 && comision >= 200) {
			salario = salario + PLUS;
		}
	}
}