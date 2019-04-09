package guia01.ejercicio01;

public class ListaNumerosTrivial extends ListaNumeros {

	@Override
	public long faltante() {
		long inicio = System.currentTimeMillis();
		
		for(int i=0; i<=getLista().length;i++) {
			boolean encontrado=false;
			for(int j=0;j<getLista().length;j++) {
				if(i==getLista()[j]) {
					encontrado=true;
				}
			}			
			if(!encontrado) {
				long fin = System.currentTimeMillis();
				System.out.println("Duracion: "+(fin-inicio)+" millis");
				return i;
			}
		}
		return -1;
	}

}
