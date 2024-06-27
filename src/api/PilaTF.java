package api;

public class PilaTF implements PilaTDA {
	private String[] a;
	private int contador;

	// Se inicializa la estructura
	public void inicializarPila() {
		a = new String[100];
		contador = 0;
	}

	public void apilar(String x) {
		a[contador] = x;
		contador++;
	}

	public String tope() {
		return a[contador - 1];
	}

	public void desapilar() {
		contador--;
	}

	public boolean pilaVacia() {
		return (contador == 0);
	}
}
