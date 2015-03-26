package stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListStack<Item> implements StackInterface<Item> {
	private List<Item> items = new ArrayList<Item>();

	public ArrayListStack() {
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

	public int getUniqueElementsCount() {
		Set<Item> itemsWithoutDuplicates = new HashSet<Item>();

		for (Item i : items) {
			itemsWithoutDuplicates.add(i);
		}
		return itemsWithoutDuplicates.size();
	}
}
