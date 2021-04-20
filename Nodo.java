package pila_cola_E;

public class Nodo<E> { // Vamos a hacer uso de generics para determinar luego al instanciar
						   // qué tipo de datos usaremos.
	private E dato; // Atributo que almacena el valor del nodo
	private Nodo<E> siguiente; // Atributo que señala al siguiente nodo (clase auto-referencida)
	
	public Nodo() { // Declaramos constructor para crear la lista vacía:
		
		dato = null; // Inicializamos el valor que contendrán los nodos.
		siguiente = null; // Y el puntero como nulo al no apuntar a nada.
	}

	public E getDato() {
		return dato;
	}

	public void setDato(E dato) {
		this.dato = dato;
	}

	public Nodo<E> getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo<E> siguiente) {
		this.siguiente = siguiente;
	}
	
	@Override
	public String toString() {
		return dato + "\n";
	}
}
