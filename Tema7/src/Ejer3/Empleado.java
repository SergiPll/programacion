package Ejer3;
/*

Sergi Pastor Llopis

*/
public class Empleado {
	
	protected String nombre;
	
	public Empleado() {
	}
	public Empleado(String nombre) {
		this.setNombre(nombre);
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String toString() {
		String todo=this.nombre+" es un objeto de la clase Empleado";
		return todo;
	}
}