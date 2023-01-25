package controle;

import modelo.Playlist;
import java.util.ArrayList;

public class ControlePlaylist {
    private ArrayList<Playlist> playlists;
    private int qtdPlaylists;

    public ControlePlaylist(ControleDados cd) {
        this.playlists = cd.getPlaylists();
        this.qtdPlaylists = cd.getQtdPlaylists();
    }

    public int getQtdPlaylists() {
        return qtdPlaylists;
    }

    public void setQtdPlaylists(int qtdPlaylists) {
        this.qtdPlaylists = qtdPlaylists;
    }

    public String[] getNomePlaylists() {
        String[] nomes = new String[qtdPlaylists];
        for (int i = 0; i < qtdPlaylists; i++) {
            nomes[i] = playlists.get(i).getNome();
        }
        return nomes;
    }

    public String getMusicasPlaylist(int i) {
        String musicas = "";
        for (int j = 0; j < playlists.get(i).getQtdMusica(); j++) {
            int tam = playlists.get(i).getMusicas().size();
            for (int k = 0; k < tam; k++) {
                musicas += playlists.get(i).getMusicas().get(k).getNome() + ", ";
            }
        }
        return musicas;
    }

    public String getNomePlaylist(int i) {
        return playlists.get(i).getNome();
    }
}
