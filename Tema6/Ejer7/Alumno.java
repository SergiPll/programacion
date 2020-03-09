package Ejer7;
/*

Sergi Pastor Llopis

*/
public class Alumno {

	private Notas notasAlumnos = new Notas();
	private String nombre;
	private int numExpediente;
	
	public Alumno() {
	}
	
	public Alumno(Notas notasAlumnos, String nombre, int numExpediente) {
		this.notasAlumnos = notasAlumnos;
		this.nombre = nombre;
		this.numExpediente = numExpediente;
	}
	
	
	public Notas getNotasAlumnos() {
		return notasAlumnos;
	}

	public void setNotasAlumnos(Notas notasAlumnos) {
		this.notasAlumnos = notasAlumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	
	public String toString() {
		String todo = null;
		float media = 0;
		
		media = notasAlumnos.media();
		
		todo = "\nAlumno: " + nombre + " " + numExpediente + "\n";
		todo = todo + "------ Notas ------";
		System.out.println(todo);
		notasAlumnos.Mostrar();
		System.out.println("\nNota media: " + media);
		
		
		return todo;
	}
}