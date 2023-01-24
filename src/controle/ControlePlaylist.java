package controle;

import modelo.Playlist;

public class ControlePlaylist {
    private Playlist[] playlists;
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
            nomes[i] = playlists[i].getNome();
        }
        return nomes;
    }

    public String getMusicasPlaylist(int i) {
        String musicas = "";
        for (int j = 0; j < playlists[i].getQtdMusica(); j++) {
            int tam = playlists[i].getMusicas().size();
            for (int k = 0; k < tam; k++) {
                musicas += playlists[i].getMusicas().get(k).getNome() + ", ";
            }
        }
        return musicas;
    }

    public String getNomePlaylist(int i) {
        return playlists[i].getNome();
    }
}
