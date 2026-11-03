package pilasPackage;

public class LinkedStack<T> implements Stack<T> {
	 
	private Node<T> topNode;
	private int elementCount;
 
	public LinkedStack() {
		topNode = null;
		elementCount = 0;
	}
 
	@Override
	public void push(T element) {
		Node<T> newNode = new Node<T>(element, topNode);
		topNode = newNode;
		elementCount++;
	}
 
	@Override
	public T pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("pop: la pila está vacía");
		}
		T removedElement = topNode.getElement();
		topNode = topNode.getNext();
		elementCount--;
		return removedElement;
	}
 
	@Override
	public T top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("top: la pila está vacía");
		}
		return topNode.getElement();
	}
 
	@Override
	public boolean isEmpty() {
		return topNode == null;
	}
 
	@Override
	public int size() {
		return elementCount;
	}
 
	@Override
	public String toString() {
		StringBuilder text = new StringBuilder("[");
		for (Node<T> currentNode = topNode; currentNode != null; currentNode = currentNode.getNext()) {
			text.append(currentNode.getElement());
			if (currentNode.getNext() != null) {
				text.append(", ");
			}
		}
		return text.append("]").toString();
	}
}
