package stack;

import junit.framework.Assert;

import org.junit.Test;

public class CountUniqueElementsStackDecoratorTest {

	@Test
	public void testCountUniqueElements() {
		String stringObj = "String Object";
		String stringObj1 = "String Object";
		String stringObj2 = "String Object";
		String stringObj3 = "String Object2";
		String stringObj4 = "String Object2";
		String stringObj5 = "String Object3";

		CountUniqueElementsStackDecorator<String> stack = new CountUniqueElementsStackDecorator<String>(
				new LinkedListStack<String>());
		stack.push(stringObj);
		stack.push(stringObj1);
		stack.push(stringObj2);
		stack.push(stringObj3);
		stack.push(stringObj4);
		stack.push(stringObj5);

		Assert.assertTrue(stack.getCountOfUniqueElementsInStack() == 3);

	}

	@Test
	public void testPushStringObj() {
		String stringObj = "String Object";
		Stack<String> stack = new CountUniqueElementsStackDecorator<String>(
				new LinkedListStack<String>());
		stack.push(stringObj);
		Assert.assertTrue((stack.peek().equals(stringObj))
				&& (stack.size() == 1));
	}

	@Test
	public void testPopStringObj() {
		String stringObj1 = "String Object 1";
		String stringObj2 = "String Object 2";
		Stack<String> stack = new CountUniqueElementsStackDecorator<String>(
				new LinkedListStack<String>());
		stack.push(stringObj1);
		stack.push(stringObj2);
		Assert.assertTrue((stack.pop().equals(stringObj2))
				&& (stack.size() == 1));
	}

	@Test
	public void checkPeakOfStackStringObjs() {
		String stringObj = "String Object";
		Stack<String> stack = new CountUniqueElementsStackDecorator<String>(
				new LinkedListStack<String>());
		stack.push(stringObj);
		Assert.assertEquals(stack.peek(), stringObj);
	}
}
