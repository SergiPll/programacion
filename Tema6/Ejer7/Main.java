package Ejer7;

import java.util.Scanner;
/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		
		Notas notas1 = new Notas();
		Notas notas2 = new Notas();
		notas1.leer();
		
		Alumno alumno1 = new Alumno(notas1, "Pepe", 34512);
		Alumno alumno2 = new Alumno();
		
		System.out.println("");
		
		notas2.leer();
		alumno2.setNotasAlumnos(notas2);
		alumno2.setNombre("Salva");
		alumno2.setNumExpediente(651772);
		
		
		alumno1.toString();
		alumno2.toString();
	}
}