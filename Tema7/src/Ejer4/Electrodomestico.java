package Ejer4;
/*

Sergi Pastor Llopis

*/
public class Electrodomestico {

	protected String color;
	protected char consumoEnergetico;
	protected float precioBase, peso;
	
	
	public Electrodomestico() {
		color = "blanco";
		consumoEnergetico = 'F';
		precioBase = 100;
		peso = 5;
	}
	public Electrodomestico(float precioBase, float peso) {
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.precioBase = precioBase;
		this.peso = peso;
	}
	public Electrodomestico(String color, char consumoEnergetico, float precioBase, float peso) {
		comprobarColor(color);
		comprobarConsumo(consumoEnergetico);
		this.precioBase = precioBase;
		this.peso = peso;
	}
	

	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	
	
	public float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	

	
	private void comprobarConsumo(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			consumoEnergetico = letra;
		}else consumoEnergetico = 'F';
	}

	
	
	private void comprobarColor(String color) {
		if (color == "gris" || color == "azul" || color == "rojo" || color == "negro" || color == "blanco") {
			this.color = color;
		}else this.color = "blanco";
	}
	

	
	public double precioFinal() {
		double precio = 0;
		switch (consumoEnergetico) {
			case 'A':
				precio = precio + 100;
				break;
			case 'B':
				precio = precio + 80;
				break;
			case 'C':
				precio = precio + 60;
				break;
			case 'D':
				precio = precio + 50;
				break;
			case 'E':
				precio = precio + 30;
				break;
			case 'F':
				precio = precio + 10;
				break;
		}
		
		
		if (peso <= 19) {
			precio = precio + 10;
		}else if (peso >= 20 && peso <= 49) {
			precio = precio + 50;
		}else if (peso >= 50 && peso <= 79) {
			precio = precio + 80;
		}else if (peso >= 80) {
			precio = precio + 100;
		}
		return precio;
	}
	
	
}