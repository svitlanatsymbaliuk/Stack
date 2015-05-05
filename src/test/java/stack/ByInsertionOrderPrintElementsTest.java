package stack;

import org.junit.Test;

public class ByInsertionOrderPrintElementsTest {

	@Test
	public void test() {
		ByInsertionOrderPrintElements<Integer> stack = new ByInsertionOrderPrintElements<Integer>(
				new LinkedListStack<Integer>());
		
		stack.push(5);
		stack.push(10);
		stack.push(5);
		stack.push(16);
		stack.push(7);
		stack.push(5);
		stack.push(2);
		stack.push(1);
		stack.push(29);
		stack.push(5);
		stack.push(5);
		
		stack.printUniqueElements();
		
		ByInsertionOrderPrintElements<String> stack_2 = new ByInsertionOrderPrintElements<String>(
				new LinkedListStack<String>());
		
		stack_2.push("Svitlana");
		stack_2.push("Ivan");
		stack_2.push("Oleh");
		stack_2.push("asd");
		stack_2.push("asd");
		stack_2.push("asd");
		stack_2.push("Natalya");
		
		stack_2.printUniqueElements();
		
	}

}
