package Ejer2;
/*

Sergi Pastor Llopis

*/
public class Revistas extends Publicacion{
	int numero;
	
	public Revistas() {
	}
	
	public Revistas(int codigo, int ano, int numero, boolean prestado) {
		this.codigo = codigo;
		this.ano = ano;
		this.numero = numero;
		this.prestado = prestado;
	}

	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
	@Override public String toString() {
		String todo = super.toString();
		todo = todo + "\nNumero: "+numero;
		return todo;
	}
}
