package modelo;

/**
 * Classe Pessoa é uma classe abstrata e tem como atributo o nome a ser cadastrado pelo usuário.
 * @author Maria Alice Bernardo da Costa Silva
 */

public abstract class Pessoa {
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
