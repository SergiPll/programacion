package Ejer8;
/*

Sergi Pastor Llopis

*/
public class Ppal {

	public static void main(String[] args) {
		RegistroMes e1=new RegistroMes();
		e1.setMes("Enero");
		e1.setAnyo(2018);
		Temperaturas t1=new Temperaturas();
		t1.leer();
		e1.setTemp(t1);
		

		System.out.println(e1.toString());
		
	}
}