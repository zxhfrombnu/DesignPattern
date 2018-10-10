package iterator_builtin;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<String> {
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

	public void remove() {
		if(position <= 0) {
			throw new IllegalStateException("there is no item to remove");
		}
		if(items[position - 1] != null) {
			for(int i = position - 1; i < items.length - 1; i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}
}