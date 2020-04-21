package Ejer5;
/*

Sergi Pastor Llopis

*/
public class NoPerecedero extends Producto {
	int tipo;
	
	
	public NoPerecedero() { 
	}
	public NoPerecedero(String nombre, double precio, int tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	@Override public double calcular(int cantidad) {
			  double total = super.calcular(cantidad);
			  return total;
		}
	}