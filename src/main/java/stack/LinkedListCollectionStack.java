package stack;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollectionStack<Item> implements StackInterface<Item> {

	protected List<Item> items = new LinkedList<Item>();
	private int size;

	public LinkedListCollectionStack() {
		items.clear();
		size = 0;
	}

	public void push(Item item) {
		items.add(item);
		++size;
	}

	public Item pop() {
		if (size == 0) {
			throw new RuntimeException("Stack is underflow");
		}
		--size;
		return items.remove(size);
	}

	public Item peak() {
		return items.get(size - 1);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

}
