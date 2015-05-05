package stack;

import java.util.Comparator;
import java.util.TreeMap;

public class ByComparisonRulePrintElements<Item> extends
		CountUniqueElementsStackDecorator<Item> {

	private TreeMap<Item, Integer> stackTreeMap;

	public ByComparisonRulePrintElements(Stack<Item> decoratedStack,
			Comparator<Item> comparator) {
		super(decoratedStack);
		stackTreeMap = new TreeMap<Item, Integer>(comparator);
	}

	@Override
	public void push(Item item) {
		Integer counter = 1;
		if (stackTreeMap.containsKey(item)) {
			++counter;
		}
		stackTreeMap.put(item, counter);

		decoratedStack.push(item);
	}

	@Override
	public Item pop() {
		Item item = decoratedStack.pop();
		Integer counter = stackTreeMap.get(item);
		if (counter == 1) {
			stackTreeMap.remove(item);
		} else {
			stackTreeMap.put(item, --counter);
		}

		return item;
	}

	public void printUniqueElements() {
		for (Item item : stackTreeMap.keySet()) {
			System.out.println(item + " ");
		}
	}

}
