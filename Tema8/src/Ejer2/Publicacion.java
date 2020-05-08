package Ejer2;
/*

Sergi Pastor Llopis

*/
public abstract class Publicacion implements Interfaz{
	
		int codigo, ano;
		boolean prestado = false;
	
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		
		
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		
		
		public boolean isPrestado() {
			return prestado;
		}
		public void setPrestado(boolean prestado) {
			this.prestado = prestado;
		}
		
		
		
		public void prestar() {
			prestado = true;
		}
		
		public void devolver() {
			prestado = false;
		}
		
		public boolean prestado() {
			return prestado;
		}
		
		
		@Override public String toString() {
			String todo = "Codigo: "+codigo+"\nAño de publicacion: "+ano+"\nPrestado? "+prestado;
			return todo;
		}
}
