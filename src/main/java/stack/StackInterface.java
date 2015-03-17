package stack;

public interface StackInterface<Item> {

	public void push(Item item);

	public Item pop();

	public Item peak();

	public int size();

	public boolean isEmpty();

}
