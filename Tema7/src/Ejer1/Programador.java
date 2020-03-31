package Ejer1;
/*

Sergi Pastor Llopis

*/
public class Programador extends Empleado {
	
	int lineasCPH;
	String lenguaje;
	
	public Programador() {
	}
	public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasCPH, String lenguaje) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
		this.lineasCPH = lineasCPH;
		this.lenguaje = lenguaje;
	}
	
	
	public String nivelProgramacion() {
		String nivel = "";
		if (lineasCPH < 200) {
			nivel = "Level 1";
		}else if (lineasCPH >= 200 && lineasCPH <= 500) {
			nivel = "Level 2";
		}else if (lineasCPH > 500) {
			nivel = "Level 3";
		}
		return nivel;
	}

	
	public int getlineasCPH() {
		return lineasCPH;
	}
	public void setlineasCPH(int lineasCPH) {
		this.lineasCPH = lineasCPH;
	}

	
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
}