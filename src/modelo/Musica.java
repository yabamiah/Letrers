package modelo;

import java.util.*;

public class Musica {
    private String nome;
    private String artistaNome;
    private String genero;
    private int classificacao;

    private int id;
    private int artistaId;
    private int letraId;

    public Musica(String nome, String artistaNome, String genero, int classificacao, int id, int artistaId, int letraId) {
        this.nome = nome;
        this.artistaNome = artistaNome;
        this.genero = genero;
        this.classificacao = classificacao;
        this.id = id;
        this.artistaId = artistaId;
        this.letraId = letraId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtistaNome() {
        return artistaNome;
    }

    public void setArtistaNome(String artistaNome) {
        this.artistaNome = artistaNome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(int artistaId) {
        this.artistaId = artistaId;
    }

    public int getLetraId() {
        return letraId;
    }

    public void setLetraId(int letraId) {
        this.letraId = letraId;
    }

    public Boolean adicionarEmPlaylista(Playlist playlist, Musica musica) {
        return playlist.getMusicas().add(musica);
    }
}
