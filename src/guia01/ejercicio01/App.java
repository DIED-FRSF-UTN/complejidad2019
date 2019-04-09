package guia01.ejercicio01;

public class App {

	static int[] a;
	static int[] b = new int[3];
	static int[] c = {3,4,0,2};

	public static void main(String[] args) {
		ListaNumeros l1 = new ListaNumerosOptima();
		l1.setLista(generar(250000000));
		//l1.imprimir();
		System.out.println("el que falta es: "+l1.faltante());
		
	}

	public static int[] generar(int tamanio) {
		int[] resultado = new int[tamanio];
		for(int i=0;i<tamanio;i++) {
			resultado[i]=i;
		}
		return resultado;
	}
}
