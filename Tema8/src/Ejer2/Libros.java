package Ejer2;
/*

Sergi Pastor Llopis

*/
public class Libros extends Publicacion{
	String autor;

	public Libros() {
	}

	public Libros(int codigo, int ano, String autor, boolean prestado) {
		this.codigo = codigo;
		this.ano = ano;
		this.autor = autor;
		this.prestado = prestado;
	}
	
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
	@Override public String toString() {
		String todo = super.toString();
		todo = todo + "\nAutor: "+autor;
		return todo;
	}
}
