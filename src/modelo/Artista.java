package modelo;

import java.util.*;

public class Artista {
    private int id;
    private String nome;
    private int classificacao;
    private ArrayList<String> generos;
    private ArrayList<Musica> musicas;

    public Artista(int id, String nome, int classificacao, ArrayList<String> generos, ArrayList<Musica> musicas) {
        this.id = id;
        this.nome = nome;
        this.classificacao = classificacao;
        this.generos = generos;
        this.musicas = musicas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
}
