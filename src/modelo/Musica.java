package modelo;

//import java.util.*;

public class Musica {
  private String nome;
  private String genero;
  private int classificacao;

  public Musica(String nome, String genero) {
    this.nome = nome;
    this.genero = genero;
  }

  public String getNome() { return nome; }

  public void setNome(String nome) { this.nome = nome; }

  public String getGenero() { return genero; }

  public void setGenero(String genero) { this.genero = genero; }

  public int getClassificacao() { return classificacao; }

  public void setClassificacao(int classificacao) {
    this.classificacao = classificacao;
  }

  public String toString() {
    String musica = "Nome da música: " + nome + ", Genêro: " + genero + ", Classificação: " + classificacao;
    return musica;
  }
}
