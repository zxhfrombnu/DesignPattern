package iterator;

public class Cafe {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		// with iterators
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();

		printMenu(pancakeIterator);
		printMenu(dinerIterator);
	}

	private static void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			System.out.println((String)iterator.next());
		}
	}
}
