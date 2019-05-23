package models;

public class Journal extends Item {

	// attributes
	private String subject;
	private int volume;

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

}
