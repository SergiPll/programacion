package Voluntario;
/*

Sergi Pastor Llopis

*/
import java.util.Scanner;

public class ClasePersona {
	Scanner sc = new Scanner(System.in);
	
	private String nombre, DNI, sexo;
	private int edad;
	private double peso, altura;
	
	public ClasePersona () {
	}
	public ClasePersona (String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	public ClasePersona (String nombre, String sexo, int edad, double peso, double altura) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {

		this.nombre = nombre;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getDni() {
		return DNI;
	}
	public void setDni() {
		this.DNI = generaDNI();
	}
	
	
	public double calcularIMC() {
		double valor = 0;
		valor = peso / (altura*altura);
		
		if (valor < 20) {
			valor = -1;
		} else if (valor >= 20 || valor <= 25) {
			valor = 0;
		} else if (valor > 25) {
			valor = 1;
		}
		
		return valor;
	}
	
				
	public boolean esMayorDeEdad() {
		boolean mayor = false;
		
		if (edad >= 18) {
			mayor = true;
		} else {
			mayor = false;
		}
		
		return mayor;
	}

	
	public String toString () {
		String todo = null;
		
		todo = "Nombre: " + nombre + "\n";
		todo = todo + "DNI: " + DNI + "\n";
		todo = todo + "Sexo: " + sexo + "\n";
		todo = todo + "Edad: " + edad + "\n";
		todo = todo + "Peso: " + peso + "\n";
		todo = todo + "Altura: " + altura;
		
		return todo;
	}
	
	
	private String generaDNI() {
		System.out.println("Introduce un numero de 8 cifras");
		int num = sc.nextInt();
		char letra = 'A';
		
		int res = num % 23;
		switch (res) {
		case 0:
			letra = 'T';
			break;
		case 1:
			letra = 'R';
			break;
		case 2:
			letra = 'W';
			break;
		case 3:
			letra = 'A';
			break;
		case 4:
			letra = 'G';
			break;
		case 5:
			letra = 'M';
			break;
		case 6:
			letra = 'Y';
			break;
		case 7:
			letra = 'F';
			break;
		case 8:
			letra = 'P';
			break;
		case 9:
			letra = 'D';
			break;
		case 10:
			letra = 'X';
			break;
		case 11:
			letra = 'B';
			break;
		case 12:
			letra = 'N';
			break;
		case 13:
			letra = 'J';
			break;
		case 14:
			letra = 'Z';
			break;
		case 15:
			letra = 'S';
			break;
		case 16:
			letra = 'Q';
			break;
		case 17:
			letra = 'V';
			break;
		case 18:
			letra = 'H';
			break;
		case 19:
			letra = 'L';
			break;
		case 20:
			letra = 'C';
			break;
		case 21:
			letra = 'K';
			break;
		case 22:
			letra = 'E';
			break;
		}
		
		DNI = num + "-" + letra;
		
		return this.DNI;
	}
	

}