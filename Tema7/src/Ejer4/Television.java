package Ejer4;
/*

Sergi Pastor Llopis

*/
public class Television extends Electrodomestico{

	float resolucion;
	boolean smartTV;
	

	public Television() {
		super();
		resolucion = 20;
		smartTV = false;
	}
	public Television(float precioBase, float peso) {
		super(precioBase, peso);
		resolucion = 20;
		smartTV = false;
	}
	public Television(String color, char consumoEnergetico, float precioBase, float peso, float resolucion, boolean smartTV) {
		super(color, consumoEnergetico, precioBase, peso);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}
	

	
	public float getResolucion() {
		return resolucion;
	}
	public void setResolucion(float resolucion) {
		this.resolucion = resolucion;
	}

	
	public boolean isSmartTV() {
		return smartTV;
	}
	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}



	@Override public double precioFinal() {
		double precio = super.precioFinal();
		if (resolucion >= 40) {
			precio = precio*1.30;
		}
		if (smartTV == true) {
			precio = precio + 50;
		}
		return precio;
	}
	
}