package Ejer3;
/*

Sergi Pastor Llopis

*/
public class Operario extends Empleado {
	public Operario() {
	}
	public Operario(String nombre) {
		this.setNombre(nombre);
	}
	
	
	public String toString() {
		String todo=this.nombre+" es un objeto de la clase Empleado > Operario";
		return todo;
	}
}