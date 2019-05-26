package models;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	// attributes
	private ArrayList<Item> libInventoryList = new ArrayList<Item>();
	private HashMap<String, Item> libInventoryMap = new HashMap<String, Item>();
	private ArrayList<Member> libMemberList = new ArrayList<Member>();
	private HashMap<String, Member> libMemberMap = new HashMap<String, Member>();

	// behaviours
	// add all items to List and Map
	public void addToSystem(String chooseKey, Item chooseItem) {
		libInventoryMap.put(chooseKey, chooseItem);
		libInventoryList.add(chooseItem);
	}

	// add members
	public void addMem(String chooseKey, Member chooseMember) {
		libMemberList.add(chooseMember);
		libMemberMap.put(chooseKey, chooseMember);
	}

	// check availability
	public boolean checkAvailability(String chooseKey) {
		Item i = libInventoryMap.get(chooseKey);
		if (i.isInLibrary()) {
			System.out.println("Item " + chooseKey + ": " + i.getTitle() + " is available.");
		} else {
			System.out.println("Item " + chooseKey + ": " + i.getTitle() + " is unavailable.");
		}
		return i.isInLibrary();
	}

	public void listAvailability() {
		int numBooks = 0;
		int numMaps = 0;
		int numJournals = 0;
		int totalItems = 0;

		for (Item i : libInventoryList) {
			if (i instanceof Book && i.isInLibrary()) {
				numBooks++;
				totalItems++;
			}
			if (i instanceof Map && i.isInLibrary()) {
				numMaps++;
				totalItems++;
			}
			if (i instanceof Journal && i.isInLibrary()) {
				numJournals++;
				totalItems++;
			}
		}
		System.out.println("The library currently has " + totalItems + " avaiable item(s)");
		System.out.println((libInventoryList.size() - totalItems) + " item(s) have been checked out");
		System.out.println("The following number of items are available:");
		System.out.println("Books: " + numBooks);
		System.out.println("Maps: " + numMaps);
		System.out.println("Journals: " + numJournals);

	}

	public ArrayList<Item> getLibInventoryList() {
		return libInventoryList;
	}

	public void setLibInventoryList(ArrayList<Item> libInventoryList) {
		this.libInventoryList = libInventoryList;
	}

	public HashMap<String, Item> getLibInventoryMap() {
		return libInventoryMap;
	}

	public void setLibInventoryMap(HashMap<String, Item> libInventoryMap) {
		this.libInventoryMap = libInventoryMap;
	}

	public ArrayList<Member> getLibMemberList() {
		return libMemberList;
	}

	public void setLibMemberList(ArrayList<Member> libMemberList) {
		this.libMemberList = libMemberList;
	}

	public HashMap<String, Member> getLibMemberMap() {
		return libMemberMap;
	}

	public void setLibMemberMap(HashMap<String, Member> libMemberMap) {
		this.libMemberMap = libMemberMap;
	}

}
