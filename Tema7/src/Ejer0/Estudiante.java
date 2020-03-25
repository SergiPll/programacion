package Ejer0;
/*

Sergi Pastor Llopis

*/
public class Estudiante extends Persona {
		
	private int numeroExpediente;
	private String curso;
	private double[] notas = new double[7];
	
	public Estudiante(String nombre, String Curso, int numeroExpediente) {
		this.nombre = nombre;
		this.curso = Curso;
		this.numeroExpediente = numeroExpediente;
	}
	
	public int getnumeroExpediente() {
		return numeroExpediente;
	}
	
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double getNotaMedia() {
		double media = 0;
		for (int cont = 0; cont < notas.length; cont++) {
			media = media + notas[cont];
		}
		
		media = media/7;
		return media;
	}
		
}