package models;

public class Item {

	// attributes
	private String itemID;
	private String title;
	private String publisher;
	private int numPages;
	private boolean inLibrary;

	// constructor
	public Item(String itemID, String title, String publisher, int numPages, boolean inLibrary) {
		this.setItemID(itemID);
		this.title = title;
		this.publisher = publisher;
		this.numPages = numPages;
		this.inLibrary = inLibrary;
	}

	// behaviours

	// check in and out --> HOW DO I RUN THIS
	public void checkOut(Item chooseItem) {
		if (chooseItem instanceof Book && chooseItem.inLibrary) {
			chooseItem.setInLibrary(false);
		} else {
			System.out.println("This book has already been checked out");
		}
	}

	public void checkIn() {
		((Item) this).setInLibrary(true);
	}

	// getters and setters

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public boolean isInLibrary() {
		return inLibrary;
	}

	public void setInLibrary(boolean inLibrary) {
		this.inLibrary = inLibrary;
	}

}
