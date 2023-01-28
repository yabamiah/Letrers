package modelo;

import java.util.*;

/**
 * Classe Artista herda da classe abstrata {@link Pessoa} e armazena o nome e as
 * músicas do artista.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinicius Mendes Martins
 */

public class Artista extends Pessoa {
	private ArrayList<Musica> musicas;

	public Artista(String nome) {
		super(nome);
	}

	/**
	 * Construtor de artista.
	 * 
	 * @param nome
	 * @param musicas
	 */

	public Artista(String nome, ArrayList<Musica> musicas) {
		super(nome);
		this.musicas = musicas;
	}

	/**
	 * Gets e sets
	 */

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}

	/**
	 * ToString
	 */

	public String toString() {
		String artista = "Nome do artista: " + getNome() + ", Músicas: " + musicas;
		return artista;
	}
}
