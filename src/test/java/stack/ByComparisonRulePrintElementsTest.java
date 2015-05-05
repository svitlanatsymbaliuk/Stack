package stack;

import java.util.Comparator;

import org.junit.Test;

public class ByComparisonRulePrintElementsTest {

	@Test
	public void test() {

		Comparator<String> reverseComparator = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		};
	
		ByComparisonRulePrintElements<String> stack = new ByComparisonRulePrintElements<String>(
				new LinkedListStack<String>(), reverseComparator);

		stack.push("Svitlana");
		stack.push("Ivan");
		stack.push("Oleh");
		stack.push("abc");
		stack.push("abc");
		stack.push("abc");
		stack.push("Natalya");

		stack.printUniqueElements();

	}
}
