package Ejer1;
/*

Sergi Pastor Llopis

*/
public class Main {
	public static void main(String[] args) {
	
		Programador p = new Programador("Manel", "87654321S", 22, true, 2000, 500, "Java y SQL");
		
		Empleado e = new Empleado("Sergi", "12345678P", 18, false, 1000);
		
		
		
		e.mostrarDatos();
		System.out.println();
		
		p.mostrarDatos();
		System.out.println("LineasCPH: "+p.getlineasCPH()+"\nLenguaje: "+p.getLenguaje());
	}
}