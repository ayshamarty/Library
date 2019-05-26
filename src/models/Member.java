package models;

import java.util.ArrayList;

public class Member {
	// attributes
	private String memberID;
	private String lastName;
	private String firstName;
	private int age;
	private ArrayList<Item> memberInventory = new ArrayList<Item>();

	// constructor
	public Member(String memberID, String lastName, String firstName, int age) {
		this.memberID = memberID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	// behaviours
	public ArrayList<Item> takeItem(Member chooseMem, Item checkedItem) {
		getMemberInventory().add(checkedItem);
		return memberInventory;
	}

	public ArrayList<Item> returnItem(Member chooseMem, Item checkedItem) {
		getMemberInventory().remove(checkedItem);
		return memberInventory;

	}

	// getters and setters
	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
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
