package Ejer4;
/*

Sergi Pastor Llopis

*/
public class Main {

public static void main(String[] args) {
		
		double precioElec = 0, precioLava = 0, precioTele = 0;
		

		Television t1 = new Television();
		Television t2 = new Television(45, 20);
		Television t3 = new Television("gris", 'A', 200, 55, 55, true);
		
		
		
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(500, 50);
		Electrodomestico e3 = new Electrodomestico("negro", 'B', 200, 80);
		Electrodomestico e4 = new Electrodomestico("gris", 'A', 100, 45);
		
		
		
		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora(200, 70);
		Lavadora l3 = new Lavadora("gris", 'A', 100, 45, 20);
		
		
		
		Electrodomestico[] Electrodomesticos = new Electrodomestico[10];
		Electrodomesticos[0] = e1;
		Electrodomesticos[1] = e2;
		Electrodomesticos[2] = e3;
		Electrodomesticos[3] = e4;
		Electrodomesticos[4] = l1;
		Electrodomesticos[5] = l2;
		Electrodomesticos[6] = l3;
		Electrodomesticos[7] = t1;
		Electrodomesticos[8] = t2;
		Electrodomesticos[9] = t3;
		


		for (int i = 0;i < 10;i++) {
			System.out.println("Producto "+ (i+1));
			if (Electrodomesticos[i] instanceof Electrodomestico) {
				precioElec = precioElec + Electrodomesticos[i].precioFinal();
			}
			if (Electrodomesticos[i] instanceof Lavadora) {
				precioLava = precioLava + Electrodomesticos[i].precioFinal();
			}
			if (Electrodomesticos[i] instanceof Television) {
				precioTele = precioTele + Electrodomesticos[i].precioFinal();
			}
			System.out.println(Electrodomesticos[i].precioFinal());
		}
		
		
		System.out.println("El precio total de electrodomesticos es: "+precioElec+"€ (Total)");
		System.out.println("El precio total de lavadoras es: "+precioLava+"€");
		System.out.println("El precio total de televisiones es: "+precioTele+"€");
	}

}