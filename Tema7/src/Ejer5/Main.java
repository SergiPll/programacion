package Ejer5;
/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		
		Producto p1 = new Producto("Gafas", 20);
		Producto p2 = new Producto("Boligrafo", 1);
		
		
		Perecedero p3 = new Perecedero("Ensalada", 5, 3);
		Perecedero p4 = new Perecedero("Sandwich", 2, 1);
		
		
		NoPerecedero p5 = new NoPerecedero("Kilo de tomillo", 150, 5);
		
		
		Producto[] Productos = new Producto[5];
		Productos[0] = p1;
		Productos[1] = p2;
		Productos[2] = p3;
		Productos[3] = p4;
		Productos[4] = p5;
		
		
		for (int i = 0;i < 5;i++) {
			System.out.println("Producto "+ (i+1));
			System.out.println(Productos[i].calcular(5));
		}

		
	}
}