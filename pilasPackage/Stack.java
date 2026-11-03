package pilasPackage;

public interface Stack<T> {
	void push(T element);
	T pop() throws EmptyStackException;
	T top() throws EmptyStackException;
	boolean isEmpty();
	int size();
	String toString();
}