package Ejer3;
/*

Sergi Pastor Llopis

*/
public class Tecnico extends Operario {
	public Tecnico() {
	}
	public Tecnico(String nombre) {
		this.setNombre(nombre);
	}
	
	
	public String toString() {
		String todo=this.nombre+" es un objeto de la clase Empleado > Operario > Tecnico";
		return todo;
	}
}