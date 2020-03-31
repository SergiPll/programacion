package Ejer1;
/*

Sergi Pastor Llopis

*/
public class Empleado {
	
	protected String nombre, dni;
	protected int edad;
	protected boolean casado;
	protected double salario;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public String clasificacion() {
		String clas = "";
		if (edad <= 18) {
			clas = "Novato";
		}else if (edad >= 19 && edad <= 25) {
			clas = "Junior";
		}else if (edad > 25) {
			clas = "Senior";
		}
		return clas;
	}
	
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad 
				+ "\nCasado: " + casado + "\nSalario: " + salario + " €");
	}
	
	
	public void aumentarSueldo(double percent) {
		percent = 1+(percent/100);
		salario = salario*percent;
	}
	
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}