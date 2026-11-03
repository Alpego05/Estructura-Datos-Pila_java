package pilasPackage;

public class main {
	 
	public static void main(String[] args) {
		testStack("StaticStack", new StaticStack<Integer>(2));
		testStack("LinkedStack", new LinkedStack<Integer>());
	}
 
	private static void testStack(String stackName, Stack<Integer> stack) {
		System.out.println("=== " + stackName + " ===");
		System.out.println( stack.isEmpty());
 
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		System.out.println("Tras apilar 1..5: " + stack + " (size=" + stack.size() + ")");
		System.out.println("top = " + stack.top());
 
		int firstRemoved = stack.pop();
		int secondRemoved = stack.pop();
		System.out.println("pop = " + firstRemoved + ", pop = " + secondRemoved);
		System.out.println("Estado: " + stack + " (size=" + stack.size() + ")");
 
		while (!stack.isEmpty()) {
			stack.pop();
		}
		System.out.println(stack.isEmpty());
 
		try {
			stack.pop();
		} catch (EmptyStackException exception) {
			System.out.println(exception.getMessage());
		}
		try {
			stack.top();
		} catch (EmptyStackException exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println();  
	}
}
