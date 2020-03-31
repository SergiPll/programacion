package Ejer3;
/*

Sergi Pastor Llopis

*/
public class Oficial extends Operario {
	public Oficial() {
	}
	public Oficial(String nombre) {
		this.setNombre(nombre);
	}
	
	
	public String toString() {
		String todo=this.nombre+" es un objeto de la clase Empleado > Operario > Oficial";
		return todo;
	}
}