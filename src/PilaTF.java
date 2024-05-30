public class PilaTF {
	private int []a;
	private int contador;
	//Se inicializa la estructura
	public void inicializarPila() {
		a = new int[100];
		contador = 0;
	}
	
	public void apilar(int x) {
		a[contador] = x;
		contador ++;
	}
	
	public int tope() {
		return a[contador -1];
	}
	
	public void desapilar() {
		contador --;
	}
	
	public boolean pilaVacia() {
		return (contador == 0);
	}
}
