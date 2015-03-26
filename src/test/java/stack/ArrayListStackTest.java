package stack;

import junit.framework.Assert;

import org.junit.Test;

public class ArrayListStackTest {

	@Test
	public void testUniqueElementsCount() {
		String stringObj1 = "String Object";
		String stringObj2 = "String Object";
		String stringObj3 = "String Object";
		String stringObj4 = "String Object 1";
		String stringObj5 = "String Object 2";
		String stringObj6 = "String Object 3";
		ArrayListStack<String> stack = new ArrayListStack<String>();
		stack.push(stringObj1);
		stack.push(stringObj2);
		stack.push(stringObj3);
		stack.push(stringObj4);
		stack.push(stringObj5);
		stack.push(stringObj6);
		Assert.assertTrue((stack.getUniqueElementsCount()) == 4
				&& (stack.getUniqueElementsCount() == 4));
	}

	@Test
	public void testPushStringObj() {
		String stringObj = "String Object";
		StackInterface<String> stack = new ArrayListStack<String>();
		stack.push(stringObj);
		Assert.assertTrue((stack.peak().equals(stringObj))
				&& (stack.size() == 1));
	}

	@Test
	public void testPopStringObj() {
		String stringObj1 = "String Object 1";
		String stringObj2 = "String Object 2";
		StackInterface<String> stack = new ArrayListStack<String>();
		stack.push(stringObj1);
		stack.push(stringObj2);
		Assert.assertTrue((stack.pop().equals(stringObj2))
				&& (stack.size() == 1));
	}

	@Test
	public void checkPeakOfStackStringObjs() {
		String stringObj = "String Object";
		StackInterface<String> stack = new ArrayListStack<String>();
		stack.push(stringObj);
		Assert.assertEquals(stack.peak(), stringObj);
	}

	@Test
	public void testPushIntNum() {
		Integer intNum = 0;
		StackInterface<Integer> stack = new ArrayListStack<Integer>();
		int n = 10000;
		for (int i = 1; i < n; ++i) {
			intNum = n;
			stack.push(intNum);
		}
		Assert.assertTrue((stack.peak().equals(intNum))
				&& (stack.size() == n - 1));
	}

	@Test
	public void testPopIntNum() {
		Integer intObj1 = 1;
		Integer intObj2 = 2;
		StackInterface<Integer> stack = new ArrayListStack<Integer>();
		stack.push(intObj1);
		stack.push(intObj2);
		Assert.assertTrue((stack.pop().equals(intObj2)) && (stack.size() == 1));
	}

	@Test
	public void checkPeakOfStackIntNums() {
		Integer intNum = 1;
		StackInterface<Integer> stack = new ArrayListStack<Integer>();
		stack.push(intNum);
		Assert.assertEquals(stack.peak(), intNum);
	}

	@Test
	public void testPushObject() {
		Object obj = new Object();
		StackInterface<Object> stack = new ArrayListStack<Object>();
		stack.push(obj);
		Assert.assertTrue((stack.peak().equals(obj)) && (stack.size() == 1));
	}

	@Test
	public void testPopObject() {
		Object objectObj1 = new Object();
		Object objectObj2 = new Object();
		StackInterface<Object> stack = new ArrayListStack<Object>();
		stack.push(objectObj1);
		stack.push(objectObj2);
		Assert.assertTrue((stack.pop().equals(objectObj2))
				&& (stack.size() == 1));
	}

	@Test
	public void checkPeakOfStackObjs() {
		Object obj = new Object();
		StackInterface<Object> stack = new ArrayListStack<Object>();
		stack.push(obj);
		Assert.assertEquals(stack.peak(), obj);
	}

	@Test
	public void testEmptyStack() {
		String stringObj1 = "String Object 1";
		String stringObj2 = "String Object 2";
		String stringObj3 = "String Object 3";
		StackInterface<String> stack = new ArrayListStack<String>();
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
		StackInterface<String> stack = new ArrayListStack<String>();
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
