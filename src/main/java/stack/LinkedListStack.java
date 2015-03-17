package stack;

public class LinkedListStack<Item> implements StackInterface<Item> {

	private Node head;
	private int size;

	private class Node {
		Item item;
		Node next;
	}

	public LinkedListStack() {
		head = null;
		size = 0;
	}

	public void push(Item item) {
		Node oldHead = head;
		head = new Node();
		head.item = item;
		head.next = oldHead;
		++size;
	}

	public Item pop() {
		if (size == 0){
			throw new RuntimeException("Stack is underflow");
		}
		Item item = head.item;
		head = head.next;
		--size;
		return item;
	}

	public Item peak() {
		return head.item;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

}
