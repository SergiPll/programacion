package Ejer6;
/*

Sergi Pastor Llopis

*/
public class Empleado {
	
	protected String nombre;
	protected int edad;
	protected double salario;
	protected final double PLUS = 500;
	
	
	public Empleado() {
	}
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getPLUS() {
		return PLUS;
	}
	
	
	public String toString() {
		String todo;
		todo = "Nombre: "+nombre+"\nEdad: "+edad+"\nSalario: "+ salario;
		return todo;
	}
	
	public void plus() {
		salario = salario + PLUS;
	}
}