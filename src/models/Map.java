package models;

import interfaces.Updateable;

public class Map extends Item implements Updateable {

	// attributes
	private String location;

	// constructor
	public Map(String itemID, String title, String publisher, String location, boolean inLibrary) {
		super(itemID, title, publisher, 1, inLibrary);
		this.location = location;

	}

	// behaviours

	// getters and setters
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
