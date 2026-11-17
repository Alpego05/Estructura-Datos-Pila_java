package pilasPackage;

/**
 * Representa un nodo individual para la implementacion dinamica de la pila
 * @param <T> Tipo de elemento almacenado en el nodo
 */

public class Nodo <T> {
	private T elemento;
	private Nodo<T> siguiente;	
	
	/**
     * Constructor para crear un nuevo nodo
     * @param elem Elemento que contendra el nodo.
     * @param sig Referencia al siguiente nodo de la lista
     */

	public Nodo(T elem, Nodo<T> sig) {
		elemento = elem;
		siguiente = sig;
	}
	
	/** 
     * Devuelve el elemento almacenado en el nodo
     * @return El elemento de tipo T
     */

	public T getElemento() {
		return elemento;
	}
	
	/** 
     * Devuelve la referencia al siguiente nodo
     * @return El siguiente Nodo
     */

	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	
	/** 
     * Modifica el elemento almacenado en el nodo
     * @param ele Nuevo elemento a guardar
     */

	public void setElemento(T ele) {
		elemento = ele;
	}
	
	/** 
     * Modifica la referencia al siguiente nodo
     * @param sig Nuevo nodo siguiente
     */

	public void setSiguiente(Nodo<T> sig) {
		siguiente = sig;
		}

}
