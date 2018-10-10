package iterator_builtin;

import java.util.Iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	String[] menuItems;

	public DinerMenu() {
		menuItems = new String[MAX_ITEMS];
		addItem("Vegetarian BLT");
		addItem("BLT");
		addItem("Soup of the day");
		addItem("Hotdog");
		addItem("Pasta");
		addItem("Rice");
	}

	public void addItem(String name) {
		if(numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, cannot add any item more.");
		} else {
			menuItems[numberOfItems++] = name;
		}
	}

	public String[] getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator<String> createIterator() {
		return new DinerMenuIterator(menuItems);
	}

	public String toString() {
		return "Diner Menu";
	}
}
