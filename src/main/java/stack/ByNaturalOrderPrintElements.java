package stack;

import java.util.Map;
import java.util.TreeMap;

public class ByNaturalOrderPrintElements<Item> extends
		CountUniqueElementsStackDecorator<Item> {

	private Map<Item, Integer> stackTreeMap = new TreeMap<Item, Integer>();

	public ByNaturalOrderPrintElements(Stack<Item> decoratedStack) {
		super(decoratedStack);
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
			System.out.print(item + " ");
		}
	}

}
