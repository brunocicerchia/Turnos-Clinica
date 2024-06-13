import api.PilaTDA;

public class PilaTF implements PilaTDA {

	Object[] arr; // Aquí se guardan los elementos de la pila. El tope al final
	int cant;     // Cantidad de elementos en la pila

	@Override
	public void InicializarPila() {
		arr = new Object[20]; // Cambiamos a Object para soportar cualquier tipo de datos
		cant = 0;
	}

	@Override
	public void Apilar(Object x) { // Cambiamos int a Object
		System.out.println("N");
		arr[cant] = x;
		cant++;
	}

	@Override
	public void Desapilar() {
		if (cant > 0) {
			cant--;
		} else {
			// Opcional: manejar caso de pila vacía
			throw new IllegalStateException("La pila está vacía");
		}
	}

	@Override
	public Object Tope() { // Cambiamos int a Object
		if (cant > 0) {
			return arr[cant - 1];
		} else {
			// Opcional: manejar caso de pila vacía
			throw new IllegalStateException("La pila está vacía");
		}
	}

	@Override
	public boolean PilaVacia() {
		return (cant == 0);
	}
}
