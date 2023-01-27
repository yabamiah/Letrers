package modelo;

import java.util.*;

public class Musica {
  private String nome;
  private String genero;
  private LetraDeMusica letra;

  public Musica(String nome, String genero, LetraDeMusica letra) {
    this.nome = nome;
    this.genero = genero;
    this.letra = letra;
  }

  public String getNome() { return nome; }

  public void setNome(String nome) { this.nome = nome; }

  public String getGenero() { return genero; }

  public void setGenero(String genero) { this.genero = genero; }

  public LetraDeMusica getLetras() { return this.letra; }

  public void setLetras(LetraDeMusica letras) { this.letra = letras; }

  public String toString() {
    String musica = "Nome da música: " + nome + ", Genêro: " + genero + ", Letras: " + letra;
    return musica;
  }
}
