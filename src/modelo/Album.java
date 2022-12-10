package modelo;

import java.util.*;

public class Album {
    private int id;
    private String nome;
    private int qtdMusica;
    private ArrayList<Musica> musicas;
    private String artistaNome;

    public Album(int id, String nome, int qtdMusica, ArrayList<Musica> musicas, String artistaNome) {
        this.id = id;
        this.nome = nome;
        this.qtdMusica = qtdMusica;
        this.musicas = musicas;
        this.artistaNome = artistaNome;
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

    public String getArtistaNome() {
        return artistaNome;
    }

    public void setArtistaNome(String artistaNome) {
        this.artistaNome = artistaNome;
    }
}
