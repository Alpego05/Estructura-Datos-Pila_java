package pilasPackage;

public class Node<T> {
	
private T element;
private Node<T> next;	

public Node(T elem, Node<T> n) {
	element = elem;
	next = n;
}

public T getElement() {
	return element;
}

public Node<T> getNext() {
	return next;
}

public void setElement(T ele) {
	element = ele;
}

public void setNext(Node<T> n) {
	next = n;
	}
}
