package stack;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollectionStack<Item> implements StackInterface<Item> {

	private List<Item> items = new LinkedList<Item>();

	public LinkedListCollectionStack() {
	}

	public void push(Item item) {
		items.add(item);
	}

	public Item pop() {
		if (size() == 0) {
			throw new RuntimeException("Stack is underflow");
		}
		return items.remove(size() - 1);
	}

	public Item peak() {
		return items.get(size() - 1);
	}

	public int size() {
		return items.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

}
