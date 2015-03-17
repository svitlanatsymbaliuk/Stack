package stack;

import java.util.HashSet;
import java.util.Set;

public class Stack<Item> extends LinkedListCollectionStack<Item> {

	private Set<Item> itemsWithoutDuplicates = new HashSet<Item>();

	public Stack() {
		itemsWithoutDuplicates.clear();
	}

	public int getUniqueElementsCount() {
		itemsWithoutDuplicates.addAll(items);
		return itemsWithoutDuplicates.size();
	}

}