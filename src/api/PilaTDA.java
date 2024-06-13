package api;

public interface PilaTDA {
	void InicializarPila();		// Sin precondiciones
	void Apilar(Object x);			// Pila inicializada
	void Desapilar();			// Pila inicializada y no vacía
	Object Tope();					// Pila inicializada y no vacía
	boolean PilaVacia();		// Pila inicializada
}