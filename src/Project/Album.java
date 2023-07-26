package Project;

import java.util.ArrayList;

public class Album {
	private String name ;
	private String artist;
	private ArrayList<Songs> songs;
	
	public Album(String name, String artist, ArrayList<Songs> songs) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Songs>();
		
	}

	public Album() {
		super();
	}
	 
	
	

}
