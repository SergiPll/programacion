package Ejer2;
/*

Sergi Pastor Llopis

*/
public class Main {
	
	public static void main(String[] args) {
		
		Profesor p = new Profesor("Alberto", "D104");
		
		p.setEdad(45);
		p.setHorarioTutorias("Martes de 13:00 a 17:00");
		
		
		ProfesorEnfermo pe = new ProfesorEnfermo();
		p.getConsultas();
		pe.getConsultas();
	}
}