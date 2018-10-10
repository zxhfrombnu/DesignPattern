package iterator;

public class DinerMenuIterator implements Iterator {
	String[] items;
	int position = 0;

	public DinerMenuIterator(String[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(items == null || position >= items.length) {
			return false;
		}
		return true;
	}

	@Override
	public String next() {
		return items[position++];
	}
}
