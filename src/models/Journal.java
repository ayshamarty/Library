package models;

import interfaces.Updateable;

public class Journal extends Item implements Updateable {

	// attributes
	private String subject;
	private int volume;

	// constructor
	public Journal(String itemID, String title, String publisher, int numPages, String subject, int volume,
			boolean inLibrary) {
		super(itemID, title, publisher, numPages, inLibrary);
		this.subject = subject;
		this.volume = volume;
	}

	// behaviours

	// getters and setters

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
