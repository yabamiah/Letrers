package modelo;

import java.util.*;

/** Classe Usuário herda da classe abstrata pessoa, possui uma associação simples com a classe playlist e armazena playlists criadas pelo usuário. Estão presentes o toString e os gets e sets.
 * @author Maria Alice Bernardo da Costa Silva
 */

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
