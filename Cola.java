package pila_cola_E;

public class Cola<E> {
	
	private Nodo<E> inicio; // Inicio de la cola
	private Nodo<E> fin; // Final de la cola
	private int size;
	
	public Cola() {
		
		inicio = null;
		fin = null;
		size = 0;
	}
	
	public boolean vacia() {
		return inicio == null;
	}
	
	public void encolar(E dato) {
		// Creamos puntero (nuevo) y nodo que recibe valor del nodo y apunta a null:
		Nodo<E> nuevo = new Nodo();
		nuevo.setDato(dato); // Recibe el valor el nuevo nodo
		nuevo.setSiguiente(null); // Apunta a null siguiente al ser el fin de cola
		
		// Dos casos, que la cola esté vacía o no:
		if(vacia()) { // Si la cola está vacía, inicio y fin apuntarán al nuevo nodo:
			inicio = nuevo;
		} else { // Si no, el puntero siguiente del que era el último nodo apuntará
			fin.setSiguiente(nuevo); // al que es ahora el nuevo y último nodo.
		}
		fin = nuevo; // En ambos casos, puntero fin apunta al nuevo nodo.
		size++;
	}
	
	public E desencolar() {
		
		if (vacia()) {
			return null;
		} else { // Si no está vacía, guardamos en una variable local el valor
			E dato = inicio.getDato(); // del nodo del inicio para retornarlo.
			if (inicio == fin) { // Si solo hay un nodo, borramos las referencias
				inicio = null; // y se elimina.
				fin = null;
			} else { // Si son diferentes, hay 2 o más nodos, avanzamos el puntero
				inicio = inicio.getSiguiente(); // del inicio al siguiente nodo.
			}
			size--;
			return dato; // Retornamos el valor del nodo extraído.
		}
	}
	
	public E inicioCola() {
		
		if (vacia()) {
			return null;
			} else {
				return inicio.getDato();
			}
	}
	
	public E finCola() {
		if (vacia()) {
			return null;
		} else {
			return fin.getDato();
		}
	}
	
	public E busqueda(int posicion) { // El método recibe el valor que buscamos.
		if (vacia()) { // Comprobamos si la pila está vacía.
			return null;
			} else { //En caso de no estar vacía:
				if (posicion < 1 || posicion > size) {
					return null;
				} else {
					E resultado = null; // Variable local para almacenar valor de  nodos.
					int position = 0;
					Nodo<E> aux = inicio; // Hacemos 'copia' de la pila.
					// Mientras no sea el mismo valor ni hayamos recorrido toda la pila:
					while (position != posicion) {
						// Damos el valor del nodo a resultado para seguir comparando:
						resultado = aux.getDato();
						aux = aux.getSiguiente(); // Apuntamos al siguiente nodo como cima.
						position++; // Sumamos una posición.
					}
					return resultado; // Devolvemos el valor correspondiente a la posición.
				}
			}
	}
	
	public String toString() {
		
		if (vacia()) {
			return "La cola está vacía.";
		} else {
			String resultado = "";
			Nodo<E> aux = inicio;
			while (aux != null) {
				resultado += aux.toString();
				aux = aux.getSiguiente();
			}
			return resultado;
		}
	}
	
	
	
	
	

}
