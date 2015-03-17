package stack;

import junit.framework.Assert;

import org.junit.Test;

public class StackTest {

	@Test
	public void uniqueStringElementsCountTest() {
		String obj1 = "String Object 1";
		String obj2 = "String Object";
		String obj3 = "String Object 3";
		String obj4 = "String Object";
		String obj5 = "String Object 5";
		String obj6 = "String Object";

		Stack<String> stack = new Stack<String>();

		stack.push(obj1);
		stack.push(obj2);
		stack.push(obj3);
		stack.push(obj4);
		stack.push(obj5);
		stack.push(obj6);

		Assert.assertTrue(stack.getUniqueElementsCount() == 4);
	}

	@Test
	public void uniqueIntElementsCountTest() {

		Stack<Integer> stack = new Stack<Integer>();

		int n = 10000;
		for (int i = 0; i < n; ++i) {
			stack.push(i);
			stack.push(i);
		}
		stack.push(100001);
		stack.push(100001);
		stack.push(100001);

		Assert.assertTrue(stack.getUniqueElementsCount() == n + 1);
	}

	@Test
	public void testPushStringObj() {
		String stringObj = "String Object";
		StackInterface<String> stack = new Stack<String>();
		stack.push(stringObj);
		Assert.assertTrue((stack.peak().equals(stringObj))
				&& (stack.size() == 1));
	}

	@Test
	public void testPopStringObj() {
		String stringObj1 = "String Object 1";
		String stringObj2 = "String Object 2";
		StackInterface<String> stack = new Stack<String>();
		stack.push(stringObj1);
		stack.push(stringObj2);
		Assert.assertTrue((stack.pop().equals(stringObj2))
				&& (stack.size() == 1));
	}

	@Test
	public void checkPeakOfStackStringObjs() {
		String stringObj = "String Object";
		StackInterface<String> stack = new Stack<String>();
		stack.push(stringObj);
		Assert.assertEquals(stack.peak(), stringObj);
	}

	@Test
	public void testEmptyStack() {
		String stringObj1 = "String Object 1";
		String stringObj2 = "String Object 2";
		String stringObj3 = "String Object 3";
		StackInterface<String> stack = new Stack<String>();
		stack.push(stringObj1);
		stack.push(stringObj2);
		stack.push(stringObj3);
		stack.pop();
		stack.pop();
		stack.pop();
		Assert.assertTrue((stack.size() == 0) && stack.isEmpty());
	}

	@Test
	public void testStackIsUnderflow() {
		String stringObj1 = "String Object 1";
		String stringObj2 = "String Object 2";
		String stringObj3 = "String Object 3";
		StackInterface<String> stack = new Stack<String>();
		stack.push(stringObj1);
		stack.push(stringObj2);
		stack.push(stringObj3);
		try {
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		} catch (RuntimeException exception) {
			Assert.assertEquals("Stack is underflow", exception.getMessage());
		}
	}
}
