package Ejer0;
/*

Sergi Pastor Llopis

*/
public class Coche {
	
	private String marca, modelo, color;
	
	public Coche() {
	}
	
	public Coche(String marca) {
		this.marca = marca;
	}
	
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Coche(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}