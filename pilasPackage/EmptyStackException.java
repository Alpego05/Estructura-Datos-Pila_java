package pilasPackage;

/**
 * Excepcion lanzada cuando se intenta realizar una operacion en una pila vacia
 */

public class EmptyStackException extends RuntimeException{
	/**
     * Creamos el constructor de la excepcion
     * @param mensaje explicativo del error
     */
	
	public EmptyStackException (String mensaje) {
		super(mensaje);

	}
}
