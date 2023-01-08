package modelo;

import java.util.*;

public class Playlist {
    private String nome;
    private int qtdMusica;
    private ArrayList<Musica> musicas;

    public Playlist(String nome, int qtdMusica, ArrayList<Musica> musicas) {
        this.nome = nome;
        this.qtdMusica = qtdMusica;
        this.musicas = musicas;
    }
    
    public Playlist(String nome) {
        this.nome = nome;
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

    public Boolean adicionarEmPlaylist(Musica musica) {
        return getMusicas().add(musica);
    }

    public String toString() {
        String playlist = "Músicas: " + musicas;
        return playlist;
    }
}
