package modelo;

import java.util.*;

public class Artista extends Pessoa {
    private int classificacao;
    private ArrayList<String> generos;
    private ArrayList<Musica> musicas;
    
    public Artista(int id, String nome, int classificacao, ArrayList<String> generos, ArrayList<Musica> musicas) {
        super(id, nome);
    	this.classificacao = classificacao;
        this.generos = generos;
        this.musicas = musicas;
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
