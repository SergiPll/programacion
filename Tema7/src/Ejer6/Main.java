package Ejer6;
/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Manel", 18, 2);
		Repartidor e2 = new Repartidor("Juanan", 18, 3, "Zona 3");
		Comercial e3 = new Comercial("Lauren", 30, 50, 200);
		
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		
		e1.plus();
		e2.plus();
		e3.plus();
		
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}

}