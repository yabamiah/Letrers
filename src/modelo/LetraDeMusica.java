package modelo;

import java.util.*;

import javax.print.DocFlavor.STRING;

public class LetraDeMusica {
    private int id;
    private String corpoOriginal;
    private String corpoTraduzido;
    private String musicaNome;
    private String artistaNome;

    public LetraDeMusica(int id, String corpoOriginal, String corpoTraduzido, String musicaNome, String artistaNome) {
        this.id = id;
        this.corpoOriginal = corpoOriginal;
        this.corpoTraduzido = corpoTraduzido;
        this.musicaNome = musicaNome;
        this.artistaNome = artistaNome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorpoOriginal() {
        return corpoOriginal;
    }

    public void setCorpoOriginal(String corpoOriginal) {
        this.corpoOriginal = corpoOriginal;
    }

    public String getCorpoTraduzido() {
        return corpoTraduzido;
    }

    public void setCorpoTraduzido(String corpoTraduzido) {
        this.corpoTraduzido = corpoTraduzido;
    }

    public String getMusicaNome() {
        return musicaNome;
    }

    public void setMusicaNome(String musicaNome) {
        this.musicaNome = musicaNome;
    }

    public String getArtistaNome() {
        return artistaNome;
    }

    public void setArtistaNome(String artistaNome) {
        this.artistaNome = artistaNome;
    }
}
