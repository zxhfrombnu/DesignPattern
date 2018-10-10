package iterator_builtin;

import java.util.Iterator;

public class Cafe {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		// with iterators
		Iterator<String> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<String> dinerIterator = dinerMenu.createIterator();

		printMenu(pancakeIterator);
		printMenu(dinerIterator);
	}

	private static void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			System.out.println((String)iterator.next());
		}
	}
}
