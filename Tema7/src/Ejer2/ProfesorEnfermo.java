package Ejer2;
/*

Sergi Pastor Llopis

*/
public class ProfesorEnfermo extends Profesor {
	
	public ProfesorEnfermo() {	
	}
	
	
	public @Override void getConsultas() {
		System.out.println("El profesor está enfermo. Se suspenden las consultas hasta que se recupere. Disculpe las molestias.");
	}
}