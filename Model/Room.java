package model;

/**
 * A class representing a Room in the game Cluedo
 * 
 * @author Kieran Mckay
 *
 */
public class Room extends Tile{
	
	String name;

	public Room(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
	public char toChar(){
		return this.name.charAt(0);
	}
}