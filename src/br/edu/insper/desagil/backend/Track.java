package br.edu.insper.desagil.backend;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}
	
	public Artist getArtist() {
		return artist;
	}
	public String getName() {
		return name;
	}
	public int getDuration() {
		return duration;
	}

	public String getDurationString() {
		int m = (this.duration/60);
		int s = (this.duration%60);
		String minutos = Integer.toString(m);
		String segundos = Integer.toString(s);
		return (minutos + ":" + segundos);
	}
	
	public String getFullArtistName() {
		return "";
	}
}
