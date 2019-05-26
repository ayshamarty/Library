package models;

import interfaces.Updateable;

public class Book extends Item implements Updateable {

	// attributes
	private String author;
	private String isbn;
	private String genre;

	// constructor
	public Book(String itemID, String title, String author, String publisher, int numPages, String isbn, String genre,
			boolean inLibrary) {
		super(itemID, title, publisher, numPages, inLibrary);
		this.isbn = isbn;
		this.genre = genre;
		this.setAuthor(author);
	}

	// behaviours

	// getters and setters

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}
}
