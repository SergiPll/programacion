package Ejer4;
/*

Sergi Pastor Llopis

*/
public class Lavadora extends Electrodomestico {

	float carga;
	

	public Lavadora() {
		super();
		carga = 5;
	}
	public Lavadora(float precioBase, float peso) {
		super(precioBase, peso);
		this.carga = 5;
	}
	public Lavadora(String color, char consumoEnergetico, float precioBase, float peso, float carga) {
		super(color, consumoEnergetico, precioBase, peso);
		this.carga = carga;
	}
	

	
	public float getCarga() {
		return carga;
	}
	public void setCarga(float carga) {
		this.carga = carga;
	}
	
	
	
	@Override public double precioFinal() {
		double precio = super.precioFinal();
		if (carga >= 30) {
			precio = precio + 50;
		}
		return precio;
	}
}