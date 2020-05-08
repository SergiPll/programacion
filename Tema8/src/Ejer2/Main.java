package Ejer2;
/*

Sergi Pastor Llopis

*/
public class Main {

	public static void main(String[] args) {
		
		int prestados = 0;
		
		Libros l1 = new Libros(887948, 1998, "Cervantes", true);
		Revistas r1 = new Revistas(88748, 1988, 87, false);
		
		Libros l2 = new Libros(887948, 1998, "Cervantes", false);
		Revistas r2 = new Revistas(88748, 1988, 87, true);
		
		Libros l3 = new Libros(887948, 1998, "Cervantes", false);
		Revistas r3 = new Revistas(88748, 1988, 87, false);
		
		Libros l4 = new Libros(887948, 1998, "Cervantes", true);
		Revistas r4 = new Revistas(88748, 1988, 87, false);
		
		Publicacion[] p1 = new Publicacion[8];

		
		p1[0]=l1;
		p1[1]=r1;
		p1[2]=l2;
		p1[3]=r2;
		p1[4]=l3;
		p1[5]=r3;
		p1[6]=l4;
		p1[7]=r4;
		
		
		for(int i = 0;i < p1.length;i++) {
			System.out.println(p1[i].toString());
			if (p1[i].prestado() == true) {
				prestados++;
			}
		}
		
		System.out.println("Actualmente hay " + prestados + " libros prestados");

	}

}