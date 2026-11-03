package pilasPackage;


public class StaticStack<T> implements Stack<T> {

	public static final int DEFAULT_CAPACITY = 10;

	private T[] elementsArray;
	private int topIndex;

	public StaticStack() {
		this(DEFAULT_CAPACITY);
	}

	public StaticStack(int initialCapacity) {
		if (initialCapacity <= 0) {
			initialCapacity = DEFAULT_CAPACITY;
		}
		elementsArray = (T[]) new Object[initialCapacity];
		topIndex = -1;
	}

	private void doubleCapacity() {
		T[] biggerArray = (T[]) new Object[elementsArray.length * 2];
		for (int index = 0; index <= topIndex; index++) {
			biggerArray[index] = elementsArray[index];
		}
		elementsArray = biggerArray;
	}


	public void push(T element) {
		if (topIndex == elementsArray.length - 1) {
			doubleCapacity();
		}
		topIndex++;
		elementsArray[topIndex] = element;
	}


	public T pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("pop: la pila está vacía");
		}
		T removedElement = elementsArray[topIndex];
		elementsArray[topIndex] = null;
		topIndex--;
		return removedElement;
	}


	public T top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("top: la pila está vacía");
		}
		return elementsArray[topIndex];
	}


	public boolean isEmpty() {
		return topIndex < 0;
	}


	public int size() {
		return topIndex + 1;
	}


	public String toString() {
		StringBuilder text = new StringBuilder("[");
		for (int index = topIndex; index >= 0; index--) {
			text.append(elementsArray[index]);
			if (index > 0) {
				text.append(", ");
			}
		}
		return text.append("]").toString();
	}
}