package iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<String> items;
	int position = 0;

	public PancakeHouseMenuIterator(ArrayList<String> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(items == null || position >= items.size()) {
			return false;
		}
		return true;
	}

	@Override
	public String next() {
		return items.get(position++);
	}
}
