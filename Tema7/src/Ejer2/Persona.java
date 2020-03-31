package Ejer2;
/*

Sergi Pastor Llopis

*/
public class Persona {
	
	protected int edad;
	protected String nombre;
	protected Coche coche;
	
	public Persona() {
		this.edad=0;
	}
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
		
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
		
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
		
	
	public void setCoche(Coche c) {
		this.coche = c;
	}	
	public Coche getCoche() {
		return coche;
	}
}