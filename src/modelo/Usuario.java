package modelo;

import java.util.*;

public class Usuario extends Pessoa{
	private ArrayList<Playlist> playlist;
	
	public Usuario(String nome) {
		super(nome);
	}

	public Usuario(String nome, ArrayList<Playlist> playlist) {
		super(nome);
		this.playlist = playlist;
	}
	
	public ArrayList<Playlist> getPlaylist() {
		return playlist;
	}
	
	public void setPlaylist(ArrayList<Playlist> playlist) {
		this.playlist = playlist;
	}
	
	public Playlist criarPlaylist(String nome) {
		Playlist playlist = new Playlist(nome);
		return playlist;
	}
}
