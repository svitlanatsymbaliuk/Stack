package stack;

import java.util.LinkedHashMap;
import java.util.Map;

public class ByInsertionOrderPrintElements<Item> extends
		CountUniqueElementsStackDecorator<Item> {

	private Map<Item, Integer> stackLinkedMap = new LinkedHashMap<Item, Integer>();

	public ByInsertionOrderPrintElements(Stack<Item> decoratedStack) {
		super(decoratedStack);
	}

	@Override
	public void push(Item item) {
		Integer counter = 1;
		if (stackLinkedMap.containsKey(item)) {
			++counter;
		}
		stackLinkedMap.put(item, counter);

		decoratedStack.push(item);
	}

	@Override
	public Item pop() {
		Item item = decoratedStack.pop();
		Integer counter = stackLinkedMap.get(item);
		if (counter == 1) {
			stackLinkedMap.remove(item);
		} else {
			stackLinkedMap.put(item, --counter);
		}

		return item;
	}

	public void printUniqueElements() {
		for (Item item : stackLinkedMap.keySet()) {
			System.out.print(item + " ");
		}
	}

}