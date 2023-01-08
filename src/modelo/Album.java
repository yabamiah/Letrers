package modelo;

import java.util.*;

public class Album {
    private String nome;
    private int qtdMusica;
    private ArrayList<Musica> musicas;
    private ArrayList<String> artistas;

    public Album(String nome, int qtdMusica, ArrayList<Musica> musicas, ArrayList<String> artistas) {
        this.nome = nome;
        this.qtdMusica = qtdMusica;
        this.musicas = musicas;
        this.artistas = artistas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdMusica() {
        return qtdMusica;
    }
    
    public void setQtdMusica(int qtdMusica) {
        this.qtdMusica = qtdMusica;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public ArrayList<String> getArtistas() {
        return artistas;
    }

    public void setArtistaNome(ArrayList<String> artistas) {
        this.artistas = artistas;
    }

    public String toString() {
        String album = "Nome do Álbum: " + nome + ", Artistas: " + artistas + ", Músicas: " + musicas;
        return album;
    }
}
