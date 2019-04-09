package guia01.ejercicio01;

public abstract class ListaNumeros {

	/**
	 * Almacena la lista de numeros que representa la clase
	 * Ejemplo
	 * [3,1,4,0]
	 */
 	private int[] lista;
	
 	
 	
	public int[] getLista() {
		return lista;
	}



	public void setLista(int[] lista) {
		this.lista = lista;
	}



	public abstract long faltante();
	
	/** imprime la lista de numeros
	 * 
	 */
	public void imprimir() {
		System.out.println("Datos del arreglo");
		for(int i=0;i<this.lista.length;i++) {
			System.out.println(i+":"+this.lista[i]);
		}
	}
}
