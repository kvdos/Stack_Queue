package pila_cola_E;

public class PrincipalPila {

	public static void main(String[] args) {
		
		Pila<Integer> pila1 = new Pila<>();
		
//		Apilamos cuatro elementos:
		pila1.push(10);
		pila1.push(0);
		pila1.push(20);
		pila1.push(30);
			
			System.out.println(pila1); // Imprimo la pila
		
//			Buscamos conocer la posición que contiene el valor de 0:
			System.out.println("La posición 3 contiene el valor: " + pila1.search(3));
			
			System.out.println(); // Añado espacio
			
//			Extraigo eliminando la cima de la pila:
			System.out.println("El valor estraido es: " + pila1.pop());
			
			System.out.println(); // Añado espacio
			
//			Muestro el que es ahora la cima de la pila:
			System.out.println("La cima de la pila es: " + pila1.peek());
			
			System.out.println(); // Añado espacio
			
//			Elimino todos los elementos para ver el mensaje de vacía:
			pila1.pop();
			pila1.pop();
			pila1.pop();
			
			// Intento mostrar el elemento de la cima
			System.out.println("La cima de la pila es: " + pila1.peek());
			
		
	}

}
