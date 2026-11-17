package pilasPackage;
/**
 * Programa principal para probar y verificar el funcionamiento de las pilas
 */

public class Main {
	/**
     * Punto de entrada principal de la aplicacion
     * @param args Argumentos recibidos por linea de comandos
     */
	public static void main(String[] args) {
		probarPila("Pila Estatica", new StaticStack<>(2));
        probarPila("Pila Dinamica", new LinkedStack<>());
		
	}
 
	private static void probarPila(String nombrePila, Stack<Integer> pila) {
		System.out.println("Probando:" + nombrePila);
		
		String estadoVacia = pila.isEmpty() ? "Sí" : "No";
		System.out.println("¿La pila está vacía? " + estadoVacia);
 
		for (int numero = 1; numero <= 5; numero++) {
            pila.push(numero);
        }
		
		
		System.out.println("Tras apilar del 1 al 5: " + pila + " (Tamaño: " + pila.size() + ")");
        System.out.println("Elemento en la cima (top): " + pila.top());
        
        
 
        int primeroEliminado = pila.pop();
        int segundoEliminado = pila.pop();;
        System.out.println("Elementos desapilados: " + primeroEliminado + ", " + segundoEliminado);
        System.out.println("Estado actual de la pila: " + pila + " (Tamaño: " + pila.size() + ")");
 
        while (!pila.isEmpty()) {
            pila.pop();
		}
        String estadoVaciaFinal = pila.isEmpty() ? "Sí" : "No";
        System.out.println("Pila vaciada. ¿Esta vacia? " + estadoVaciaFinal + "\n");
 
		try {
			pila.pop();
        } catch (EmptyStackException excepcion) {
        	System.out.println("Probando excepciones:");
            System.out.println("Excepcion capturada: " + excepcion.getMessage());
        }
        
        try {
            pila.top();
        } catch (EmptyStackException excepcion) {
            System.out.println("Excepcion capturada: " + excepcion.getMessage());
        }
        System.out.println();
    
	}

}
