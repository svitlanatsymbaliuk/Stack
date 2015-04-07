package stack;

public class StackDecorator<Item> implements Stack<Item> {

	protected Stack<Item> decoratedStack;

	public StackDecorator(Stack<Item> decoratedStack) {
		this.decoratedStack = decoratedStack;
	}

	public void push(Item item) {
		decoratedStack.push(item);
	}

	public Item pop() {
		return decoratedStack.pop();
	}

	public Item peek() {
		return decoratedStack.peek();
	}

	public int size() {
		return decoratedStack.size();
	}

	public boolean isEmpty() {
		return decoratedStack.isEmpty();
	}

}
