package modelo;

import java.util.*;

/**
 * Classe Artista herda da classe abstrata pessoa earmazena o nome e as músicas do artista.
 * @author Maria Alice Bernardo da Costa Silva
 */

public class Artista extends Pessoa {
    private ArrayList<Musica> musicas;
    

    public Artista(String nome) {
        super(nome);
    }

    public Artista(String nome, ArrayList<Musica> musicas) {
        super(nome);
        this.musicas = musicas;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public String toString() {
        String artista = "Nome do artista: " + getNome() + ", Músicas: " + musicas;
        return artista;
    }
}
