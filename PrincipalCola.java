package pila_cola_E;

public class PrincipalCola {

	public static void main(String[] args) {
		
		Cola<String> cola1 = new Cola<>();
		
//		Añadimos cuatro elementos:
		cola1.encolar("primero");
		cola1.encolar("segundo");
		cola1.encolar("tercero");
		cola1.encolar("cuarto");
		
		System.out.println(cola1.toString()); // Imprimimos la cola.
		
		
//		Buscamos el valor de la posición 2:
		System.out.println("La posición 2 contiene el valor: " + cola1.busqueda(2));
		
		System.out.println(); // Añadimos espacio
		
//		Eliminamos el elemento del inicio:
		System.out.println("Valor extraído: " + cola1.desencolar());
		
		System.out.println(); // Añadimos espacio
		
//		Mostramos cuál es el inicio y fin de la cola:
		System.out.println("Inicio: " + cola1.inicioCola() + "\nFin: " + cola1.finCola());
		
		System.out.println(); // Añadimos espacio.
		
//		Borramos la cola e intentamos mostrar el inicio para mostrarnos null:
		cola1.desencolar();
		cola1.desencolar();
		cola1.desencolar();
		System.out.println("Fin: " + cola1.inicioCola());
	}

}

