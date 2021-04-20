package pila_cola_E;

public class Pila<E> {
	
	private Nodo<E> cima; // Declaramos atributo de tipo Nodo como genérico
	private int size;
	
	public Pila() {
		cima = null; // Inicializamos apuntando a null al estar vacía
		size = 0;
	}
	
	public boolean empty(){ // Consulta si la pila esta vacia.
		// true si el primer nodo (cima), no apunta a otro nodo.
		return cima == null;
	}

	public void push(E dato) { // Recibe el valor que tendrá el nuevo nodo
	
		Nodo<E> nuevo = new Nodo(); // Definimos el nuevo nodo
		nuevo.setDato(dato); // Y le asignamos el valor
		// Y pasamos a enlazar el nuevo nodo al principio o cima de la pila:
		if (empty()) { // Si está vacía,
			nuevo.setSiguiente(null); // Indicamos que no hay otro nodo después
			cima = nuevo; // Por lo que cima apuntará al nuevo nodo creado.
		} else { // De no estar vacía:
			nuevo.setSiguiente(cima); // El puntero siguiente del nuevo nodo apuntará al
			cima = nuevo; // al que era el nodo de encima, apuntando cima al nuevo nodo.
		}
		size++;
	}
	
	public E pop() {
	
		if(empty()) { // Si es nula la cima, significa que la pila está vacía.
			return null; // Devolvemos null
		} else { // De no ser nula la cima:
			E resultado = cima.getDato();
			 // Imprimimos el contenido del primer nodo
			cima = cima.getSiguiente(); // Y apuntamos al siguiente nodo como cima.
			size--;
			return resultado;
		}
	}
	
	public E peek() {
		if (empty()) {
			return null;
		} else {
			return cima.getDato();
		}
	}
	
	public E search(int posicion) { // El método recibe el valor que buscamos.
		if (empty()) { // Comprobamos si la pila está vacía.
			return null;
			} else { //En caso de no estar vacía:
				if (posicion < 1 || posicion > size) {
					return null;
				} else {
					E resultado = null; // Variable local para almacenar valor de nodos.
					int position = 0;
					Nodo<E> aux = cima; // Hacemos 'copia' de la pila.
					// Mientras no sea el mismo valor ni hayamos recorrido toda la pila:
					while (position != posicion) {
						// Damos el valor del nodo a resultado para seguir comparando:
						resultado = aux.getDato();
						aux = aux.getSiguiente(); // Apuntamos al siguiente nodo como cima.
						position++; // Sumamos una posición.
					}
					return resultado;
				}
			}
	}
	
	public String toString() {
		if(empty()) {
			return "La pila está vacía.";
		} else {
			String resultado="";
			Nodo<E> aux = cima;
			while(aux!=null) {
				resultado += aux.toString();
				aux = aux.getSiguiente();
			}
			return resultado;
		}
	}
	
		
	
}
