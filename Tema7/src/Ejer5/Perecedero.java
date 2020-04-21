package Ejer5;
/*

Sergi Pastor Llopis

*/
public class Perecedero extends Producto{
	int diasACaducar;
	
	public Perecedero() { 
	}
	
	public Perecedero(String nombre, double precio, int dias) {
		super(nombre, precio);
		diasACaducar = dias;
	}
	
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	
@Override public double calcular(int cantidad) {
		  double total = super.calcular(cantidad);
		  switch (diasACaducar) {
		  	case 1:
		  		total = total/4;
		  		break;
		  	case 2:
		  		total = total/3;
		  		break;
		  	case 3:
		  		total = total/2;
		  		break;
		  	default:
		  		break;
		  }
		  return total;
	}
}