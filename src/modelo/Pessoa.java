package modelo;

/**
 * Classe Pessoa é uma classe abstrata e simula uma pessoa
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 */

public abstract class Pessoa {
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	//gets e sets

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
