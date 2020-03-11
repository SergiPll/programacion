package Ejer8;
/*

Sergi Pastor Llopis

*/
public class RegistroMes {
	
	private String nombreMes;
	private int anyo;
	Temperaturas temp = new Temperaturas();
	
	public RegistroMes() {
	}
	
	public RegistroMes(String nombreMes, int anyo, Temperaturas temp) {
		this.nombreMes = nombreMes;
		this.anyo = anyo;
		this.temp = temp;
	}
	
	
	public String getMes() {
		return nombreMes;
	}

	public void setMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public Temperaturas gettemp() {
		return temp;
	}

	public void setTemp(Temperaturas temp) {
		this.temp = temp;
	}

	
	public String toString() {
		String todo = "----- Temperaturas -----\n";
		double max = temp.maxima(), min = temp.minima();
		double media = temp.media();
		
		todo = todo + temp.Mostrar();
		
		todo = todo + "\nTemperatura media: " + temp.media();
		todo = todo + "\nTemperatura maxima: " + max;
		todo = todo + "\nTemperatura minima: " + min;
		
		return todo;
	}
	
	
	
	
	
}