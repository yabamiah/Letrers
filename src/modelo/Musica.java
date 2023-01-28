package modelo;

import java.util.*;

/**
 * Classe Musica armazena o nome e a classe LetraDeMusica
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 */

public class Musica {
	private String nome;
	private LetraDeMusica letra;

	public Musica(String nome, LetraDeMusica letra) {
		this.nome = nome;
		this.letra = letra;
	}

	/*
	 * Gets e sets
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LetraDeMusica getLetras() {
		return this.letra;
	}

	public void setLetras(LetraDeMusica letras) {
		this.letra = letras;
	}

	/*
	 * toString
	 */

	public String toString() {
		String musica = "Nome da música: " + nome + ", Letras: " + letra;
		return musica;
	}
}
