package runners;

import models.Book;
import models.Journal;
import models.Library;
import models.Map;
import models.Member;

public class Runner {

	public static void main(String[] args) {
		Library libraryManager = new Library();
		// construct some members
		Member mem1 = new Member("001", "Taylor", "Julie", 35);
		Member mem2 = new Member("002", "Thompson", "John", 28);
		Member mem3 = new Member("003", "Johnson", "Tom", 28);

		// construct some items
		Book b1 = new Book("001", "The Hitchhiker's Guide to the Galaxy", "Adams", "Pan", 224, "978-1509808311",
				"Sci-Fi", true);
		Book b2 = new Book("002", "The Hobbit", "Tolkein", "Harper Collins", 400, "978-0007458424", "Fantasy", true);
		Map m1 = new Map("003", "Ordnance Survey Explorer OL24 The Peak District", "Ordnance Survey",
				"The Peak District", true);
		Map m2 = new Map("004", "Ordnance Survey Explorer OL6 The English Lakes", "Ordnance Survey",
				"The English Lakes", true);
		Journal j1 = new Journal("005", "Iran Journal vol 3", "British Institute of Persian Studies", 92,
				"Iranian Studies", 3, true);
		Journal j2 = new Journal("006", "Iran Journal vol 4", "British Institute of Persian Studies", 92,
				"Iranian Studies", 4, true);
		Journal j3 = new Journal("007", "Iran Journal vol 5", "British Institute of Persian Studies", 92,
				"Iranian Studies", 5, false);

		// run some methods
		libraryManager.addToSystem("001", b1);
		libraryManager.addToSystem("002", b2);
		libraryManager.addToSystem("003", m1);
		libraryManager.addToSystem("004", m2);
		libraryManager.addToSystem("005", j1);
		libraryManager.addToSystem("006", j2);
		libraryManager.addToSystem("007", j3);

		libraryManager.addMem("001", mem1);
		libraryManager.addMem("002", mem2);
		libraryManager.addMem("004", mem3);

		libraryManager.checkAvailability("004");
		libraryManager.checkAvailability("007");

		libraryManager.listAvailability();

		// check how to create a conditional for check in/out
		// checking in and out
		j3.checkIn();
		j3.checkOut(j3);
		libraryManager.listAvailability();
		libraryManager.checkAvailability("001");
	}

}
