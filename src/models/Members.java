package models;

import java.util.ArrayList;

public class Members {
	// attributes
	private int memberID;
	private String lastName;
	private String firstName;
	private int age;
	private ArrayList<Item> memberInventory = new ArrayList<Item>();

	// behaviours
	public ArrayList<Item> checkOut(Item checkedItem) {
		getMemberInventory().add(checkedItem);
		return memberInventory;
	}

	public ArrayList<Item> checkIn(Item checkedItem) {
		getMemberInventory().remove(checkedItem);
		return memberInventory;

	}

	// getters and setters
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Item> getMemberInventory() {
		return memberInventory;
	}

	public void setMemberInventory(ArrayList<Item> memberInventory) {
		this.memberInventory = memberInventory;
	}

}
