package guia01.ejercicio01;

public class ListaNumerosOptima extends ListaNumeros {

	@Override
	public long faltante() {
		long inicio = System.currentTimeMillis();
		long n = getLista().length;
		long total = (n * (n+1))/2;
		long suma = 0;
		for(int i=0; i<getLista().length;i++) {
			suma += getLista()[i];
		}
		long fin= System.currentTimeMillis();
		System.out.println("Duracion: "+(fin-inicio)+" millis");
		return total-suma;
	}

}
