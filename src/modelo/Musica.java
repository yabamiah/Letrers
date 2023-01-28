package modelo;

import java.util.*;

/**
 * Classe Música usada para escrever os métodos gets e sets e sobrescrever o ToString
 * @author Vinícius Mendes Martins 
 */

public class Musica {
  private String nome;
  private LetraDeMusica letra;

  public Musica(String nome, LetraDeMusica letra) {
    this.nome = nome;
    this.letra = letra;
  }

  public String getNome() { return nome; }

  public void setNome(String nome) { this.nome = nome; }

  public LetraDeMusica getLetras() { return this.letra; }

  public void setLetras(LetraDeMusica letras) { this.letra = letras; }

  public String toString() {
    String musica = "Nome da música: " + nome + ", Letras: " + letra;
    return musica;
  }
}
