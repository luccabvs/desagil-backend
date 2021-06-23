package br.edu.insper.desagil.backend;

import java.util.HashMap;
import java.util.Map;

public class Media {
	private String name;
	private int duration;
	private Map<String, Integer> ratings;
	
	public Media(String name, int duration) {
		this.name = name;
		this.duration = duration;
		this.ratings = new HashMap<>();
	}

	public String getName() {
		return name;
	}
	
	public String getDurationString() {
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		String hs = Integer.toString(horas);
		String ms = Integer.toString(minutos);
		String ss = Integer.toString(segundos);
		if (this.duration < 60) {
			hs = "00";
			ms = "00";
			return (hs + ":" + ms + ":" + this.duration);	
		}
		else if ((this.duration > 60 ) && (this.duration < 3600 )) {
			hs = "00";
			ms = Integer.toString(this.duration/60);
			ss = Integer.toString(this.duration%60);
			return (hs + ":" + ms + ":" + ss);
		}
		
		else {
			hs = Integer.toString(this.duration/3600);
			ms = Integer.toString((this.duration%3600)/60);
			ss = Integer.toString((this.duration%3600)%60);
			return (hs + ":" + ms + ":" + ss);
		}
	}
	
	public void putRating(String name, int avaliacao) {
		this.ratings.put(name, avaliacao);
	}
	
	public int numberRating() {
		return this.ratings.size();
	}
	
	public double averageRating() {
		double somatorio = 0.0;
		for (String key : this.ratings.keySet()) {
			somatorio += this.ratings.get(key);
		}
		return (somatorio / this.ratings.size());
	}
}
