package map;

import java.util.Scanner;

public class Car {
	private String name;
	private String genre;
	private String actorName;
	private String directorName;
	private int year;
	
	public void setname (String name) {
		this.name = name;
	}
	
	public void setgenre (String genre) {
		this.genre = genre;
	}
	
	public void setactorName (String actorName) {
		this.actorName = actorName;
	}
	
	public void setdirectorName (String directorName) {
		this.directorName = directorName;
	}
	
	public void setyear (int year) {
		this.year = year;
	}
	
	public void Info() {
		System.out.println(name);
		System.out.println(genre);
		System.out.println(actorName);
		System.out.println(directorName);
		System.out.println(year);
		
	}
	
}