package br.edu.insper.desagil.backend;

import java.util.List;

public class Series extends Collection {
	
	private List<Episode> episodes;

	public Series(String title, List<Episode> episodes) {
		super(title);
		this.episodes = episodes;
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}
}
