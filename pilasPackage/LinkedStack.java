package pilasPackage;

/**
 * Implementacion dinamica del TAD Pila 
 * @param <T> Tipo de los elementos de la pila
 */

public class LinkedStack<T> implements Stack<T> {
	private Nodo<T> nodoCima;
	private int contadorElementos;
	
	/** Constructor que inicializa una pila dinamica vacia */
	public LinkedStack() {
		nodoCima = null;
		contadorElementos = 0;
	}
 
	@Override
	public void push(T elemento) {
		Nodo<T> nuevoNodo = new Nodo<T>(elemento, nodoCima);
		nodoCima = nuevoNodo;
		contadorElementos++;
	}
 
	@Override
	public T pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("La pila esta vacia (Pop)");
		}
		T elementoQuitado = nodoCima.getElemento();
		nodoCima = nodoCima.getSiguiente();
		contadorElementos--;
		return elementoQuitado;
	}
 
	@Override
	public T top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("La pila esta vacia (Top)");
		}
		return nodoCima.getElemento();
	}
 
	@Override
	public boolean isEmpty() {
		return nodoCima == null;
	}
 
	@Override
	public int size() {
		return contadorElementos;
	}
 
	@Override
	public String toString() {
        String resultado = "[";
        Nodo<T> actual = nodoCima;
        while (actual != null) {
            resultado += actual.getElemento();
            if (actual.getSiguiente() != null) {
                resultado += ", ";
            }
            actual = actual.getSiguiente();
        }
        resultado += "]";
        return resultado;
    }

}
