package br.edu.insper.desagil.backend;

import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> collaborators) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}

	public String getFullArtistName() {
		String fullArtistName = this.getArtist().getName();
		fullArtistName += " (feat. ";
		for (int indice = 0; indice < this.collaborators.size(); indice++) {
			fullArtistName += this.collaborators.get(indice).getName();
		if (indice == this.collaborators.size() - 1) {
			fullArtistName += ")";
			}
		else {
			fullArtistName += ",";
			}
		}
		return fullArtistName;
	}
		}
	
