package pilasPackage;

/**
 * Implementacion estatica del TAD pila 
 * @param <T> Tipo de los elementos de la pila
 */

public class StaticStack <T> implements Stack<T> {
	public static final int capacidadPorDefecto = 10;

	private T[] arrayElementos;
	private int indiceCima;

	/** Constructor que inicializa la pila con la capacidad */
	public StaticStack() {
		this(capacidadPorDefecto);
	}
	
	/**
     * Constructor que inicializa la pila con una capacidad
     * @param capacidadInicial Capacidad inicial para el array de elementos
     */

	public StaticStack(int capacidadInicial) {
		if (capacidadInicial <= 0) {
			capacidadInicial = capacidadPorDefecto;
		}
		arrayElementos = (T[]) new Object[capacidadInicial];
		indiceCima = -1;
	}
	
	/** Duplica el tamaño del array de forma automatica cuando se llena. */

	private void duplicarCapacidad() {
		T[] arrayGrande = (T[]) new Object[arrayElementos.length * 2];
		for (int i = 0; i <= indiceCima ; i++) {
			arrayGrande[i] = arrayElementos[i];
		}
		arrayElementos = arrayGrande;
	}
	
	@Override
	public void push(T element) {
		if (indiceCima == arrayElementos.length - 1) {
			duplicarCapacidad();
		}
		indiceCima++;
		arrayElementos[indiceCima] = element;
	}
	
	@Override
	public T pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("La pila esta vacia (Pop)");
		}
		T elementoQuitado = arrayElementos[indiceCima];
		arrayElementos[indiceCima] = null;
		indiceCima--;
		return elementoQuitado;
	}
	
	
	@Override
	public T top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("La pila esta vacia (Top)");
		}
		return arrayElementos[indiceCima];
	}
	
	
	@Override
	public boolean isEmpty() {
		return indiceCima < 0;
	}
	
	
	@Override
	public int size() {
		return indiceCima + 1;
	}
	
	
	@Override
	public String toString() {
        String resultado = "[";
        for (int i = indiceCima; i >= 0; i--) {
            resultado += arrayElementos[i];
            if (i > 0) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }

}
