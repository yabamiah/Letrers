package controle;

import modelo.Playlist;
import java.util.ArrayList;

/**
 * Classe ControlePlaylist controla todas as informações das playlists armazenadas
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 * 
 */
public class ControlePlaylist {
    private ArrayList<Playlist> playlists;
    private int qtdPlaylists;
    
    /**
     * Construtor recebe um objeto do tipo ControleDados para preencher 
     * a ArrayList playlist para instanciar um objeto ControlePlaylist
     * 
     * @param cd ControleDados com os objetos Playlist
     */
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
    
    public String getNomePlaylists(int i) {
        if(playlists.get(i).getNome() == null) {
        	return "Playlist não encontrada";
        } else {
        	return playlists.get(i).getNome();
        }
    }

    public String[] getMusicasPlaylist(int i) {
        int tam = playlists.get(i).getMusicas().size();
        String[] musicas = new String[tam];
        
        for (int j = 0; j < playlists.get(i).getQtdMusica(); j++) {
            for (int k = 0; k < tam; k++) {
                musicas[k] = playlists.get(i).getMusicas().get(k).getNome();
            }
        }
        return musicas;
    }

    public String getNomePlaylist(int i) {
        return playlists.get(i).getNome();
    }
}
