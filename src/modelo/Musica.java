package modelo;

//import java.util.*;

public class Musica {
  private String nome;
  private String genero;
  private int classificacao;

  public Musica(String nome, String genero, int classificacao) {
    this.nome = nome;
    this.genero = genero;
    this.classificacao = classificacao;
  }

  public String getNome() { return nome; }

  public void setNome(String nome) { this.nome = nome; }

  public String getGenero() { return genero; }

  public void setGenero(String genero) { this.genero = genero; }

  public int getClassificacao() { return classificacao; }

  public void setClassificacao(int classificacao) {
    this.classificacao = classificacao;
  }
}
