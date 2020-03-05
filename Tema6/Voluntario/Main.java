package Voluntario;

import java.util.Scanner;

/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre, sexo;
		int edad;
		double peso, altura, valor;
		boolean mayor = false;
		
		System.out.print("Introduce un Nombre: ");
		nombre = sc.next();
		System.out.print("Introduce un Sexo: ");
		sexo = sc.next();
		System.out.print("Introduce una Edad: ");
		edad = sc.nextInt();
		System.out.print("Introduce un Peso: ");
		peso = sc.nextDouble();
		System.out.print("Introduce una Altura: ");
		altura = sc.nextDouble();
		
		
		
		
		ClasePersona p1 = new ClasePersona(nombre, sexo, edad, peso, altura);
		ClasePersona p2 = new ClasePersona(nombre, edad, sexo);
		ClasePersona p3 = new ClasePersona();
		
		
		
		System.out.println("---Persona1 DNI---");
		p1.setDni();
		System.out.println("---Persona2 DNI---");
		p2.setDni();
		System.out.println("---Persona3 DNI---");
		p3.setDni();
		
		
		
		
		System.out.print("Introduce un Nombre: ");
		p3.setNombre(sc.next());
		System.out.print("Introduce un Sexo: ");
		p3.setSexo(sc.next());
		System.out.print("Introduce una Edad: ");
		p3.setEdad(sc.nextInt());
		System.out.print("Introduce un Peso: ");
		p3.setPeso(sc.nextDouble());
		System.out.print("Introduce una Altura: ");
		p3.setAltura(sc.nextDouble());
		
		
		System.out.println("");
		
		
		System.out.println("---Persona1 Peso---");
		valor = p1.calcularIMC();
		if (valor == -1) {
			System.out.println("Poco peso");
		} else if (valor == 0) {
			System.out.println("Peso ideal");
		} else if (valor == 1) {
			System.out.println("Sobrepeso");
		}
		
		System.out.println("---Persona2 Peso---");
		valor = p2.calcularIMC();
		if (valor == -1) {
			System.out.println("Poco peso");
		} else if (valor == 0) {
			System.out.println("Peso ideal");
		} else if (valor == 1) {
			System.out.println("Sobrepeso");
		}
		
		System.out.println("---Persona3 Peso---");
		valor = p3.calcularIMC();
		if (valor == -1) {
			System.out.println("Poco peso");
		} else if (valor == 0) {
			System.out.println("Peso ideal");
		} else if (valor == 1) {
			System.out.println("Sobrepeso");
		}
		
		
		System.out.println("");
		
		
		System.out.println("---Persona1 Edad---");
		mayor = p1.esMayorDeEdad();
		if (mayor == true) {
			System.out.println("Mayor de edad");
		} else if (mayor == false) {
			System.out.println("Menor de edad");
		}
		
		System.out.println("---Persona2 Edad---");
		mayor = p2.esMayorDeEdad();
		if (mayor == true) {
			System.out.println("Mayor de edad");
		} else if (mayor == false) {
			System.out.println("Menor de edad");
		}
		
		System.out.println("---Persona3 Edad---");
		mayor = p1.esMayorDeEdad();
		if (mayor == true) {
			System.out.println("Mayor de edad");
		} else if (mayor == false) {
			System.out.println("Menor de edad");
		}
		
		
		System.out.println("");
		
		
		System.out.println("---Persona1---");
		System.out.println(p1.toString());
		System.out.println("---Persona2---");
		System.out.println(p2.toString());
		System.out.println("---Persona3---");
		System.out.println(p3.toString());
		
		
		sc.close();
	}
}