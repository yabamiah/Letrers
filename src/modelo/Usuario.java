package modelo;

import java.util.*;

public class Usuario extends Pessoa{
	private ArrayList<Playlist> playlist;
	
	public Usuario(int id, String nome) {
		super(id, nome);
	}
	
	public ArrayList<Playlist> getPlaylist() {
		return playlist;
	}
	
	public void setPlaylist(ArrayList<Playlist> playlist) {
		this.playlist = playlist;
	}
	
	public Playlist criarPlaylist(String nome) {
		Playlist playlist = new Playlist(1, nome);
		return playlist;
	}
}
