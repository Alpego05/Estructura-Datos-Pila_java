package pilasPackage;

/**
 * Interfaz que define las operaciones principales 
 * @param <T> Tipo de los elementos que contendra la pila
 */

public interface Stack <T> {
	
	/** 
     * Añade un nuevo elemento en la cima de la pila
     * @param element Elemento a apilar
     */
	void push(T element);
	
	/** 
     * Extrae y devuelve el elemento situado en la cima de la pila
     * @return El elemento desapilado
     * @throws EmptyStackException Si la pila esta vacia
     */
	T pop() throws EmptyStackException;
	
	/** 
     * Consulta el elemento de la cima sin eliminarlo de la pila
     * @return El elemento en la cima
     * @throws EmptyStackException Si la pila esta vacia
     */
	T top() throws EmptyStackException;
	
	/** 
     * Comprueba si la pila no contiene ningun elemento
     * @return true si esta vacoa, false en caso contrario
     */
	boolean isEmpty();
	
	/** 
     * Devuelve el numero total de elementos almacenados en la pila
     * @return Tamaño de la pila
     */
	int size();
	
	/** 
     * Devuelve una cadena con todos los elementos de la pila
     * @return Representacion en texto de la pila
     */
	String toString();

}
