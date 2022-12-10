package modelo;

import java.util.*;

public class Playlist {
    private int id;
    private String nome;
    private int qtdMusica;
    private ArrayList<Musica> musicas;

    public Playlist(int id, String nome, int qtdMusica, ArrayList<Musica> musicas) {
        this.id = id;
        this.nome = nome;
        this.qtdMusica = qtdMusica;
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
}
