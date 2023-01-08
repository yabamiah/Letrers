package modelo;

import java.util.*;

public class Artista extends Pessoa {
    private int classificacao;
    private ArrayList<String> generos;
    private ArrayList<Musica> musicas;
    

    public Artista(String nome, ArrayList<String> generos) {
        super(nome);
        this.generos = generos;
    }

    public Artista(String nome, ArrayList<String> generos, ArrayList<Musica> musicas) {
        super(nome);
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

    public String toString() {
        String artista = "Nome do artista: " + getNome() + ", Genêros: " + generos + ", Músicas: " + musicas;
        return artista;
    }
}
