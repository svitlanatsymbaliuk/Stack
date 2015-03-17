package stack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Stack<Item> implements StackInterface<Item> {

	private List<Item> items = new LinkedList<Item>();
	private Set<Item> itemsWithoutDuplicates = new HashSet<Item>();
	private int size;

	public Stack() {
		items.clear();
		itemsWithoutDuplicates.clear();
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

	public int getUniqueElementsCount() {
		itemsWithoutDuplicates.addAll(items);
		return itemsWithoutDuplicates.size();
	}

}
