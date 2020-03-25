package Ejer0;
/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Juan", "1ºDAM", 12345);
		e1.setEdad(20);
		
		double[] notas = new double[7];
		notas[0] = 7;
		notas[1] = 8.5;
		notas[2] = 4;
		notas[3] = 8;
		notas[4] = 6;
		notas[5] = 7.5;
		notas[6] = 5;
		
		
		e1.setNotas(notas);
		Coche c1 = new Coche();
		c1.setMarca("Renault");
		c1.setModelo("Clio");
		c1.setColor("Rojo");
		
		Profesor p1 = new Profesor("Fernando", "D104");
		p1.setEdad(45);
		p1.setHorarioTutorias("Lunes de 10:00 a 13:00");
		
		Coche c2 = new Coche();
		c2.setMarca("Opel");
		c2.setModelo("Corsa");
		c2.setColor("Blanco");
		
		
		System.out.println(e1.nombre+" tiene un "+ e1.getNotaMedia()+ " de media");
		p1.getConsultas();
		
		
	}
	
}