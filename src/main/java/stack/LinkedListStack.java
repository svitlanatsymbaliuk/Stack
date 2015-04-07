package stack;

import java.util.LinkedList;

public class LinkedListStack<Item> implements Stack<Item> {

	private LinkedList<Item> items = new LinkedList<Item>();

	public LinkedListStack() {
	}

	public void push(Item item) {
		items.addLast(item);
	}

	public Item pop() {
		if (items.isEmpty()) {
			throw new RuntimeException("Stack is underflow");
		}
		return items.removeLast();
	}

	public Item peek() {
		return items.peekLast();
	}

	public int size() {
		return items.size();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

}
