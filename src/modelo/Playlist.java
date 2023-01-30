package modelo;

import java.util.*;

/**
 * Classe Playlist armazena as músicas selecionadas pelo usuário.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinicius Mendes Martins
 */

public class Playlist {
	private String nome;
	private int qtdMusica;
	private ArrayList<Musica> musicas;

	/**
	 * Construtor Playlist
	 * 
	 * @param nome
	 * @param qtdMusica
	 * @param musicas
	 */

	public Playlist(String nome, int qtdMusica, ArrayList<Musica> musicas) {
		this.nome = nome;
		this.qtdMusica = qtdMusica;
		this.musicas = musicas;
	}

	public Playlist(String nome) {
		this.nome = nome;
	}

	/**
	 * Gets e sets
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdMusica() {
		return qtdMusica;
	}

	public void setQtdMusica(int qtdMusica) {
		this.qtdMusica = qtdMusica;
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}

	public Boolean adicionarEmPlaylist(Musica musica) {
		return getMusicas().add(musica);
	}

	/**
	 * toString
	 */

	public String toString() {
		String playlist = "Músicas: " + musicas;
		return playlist;
	}
}
