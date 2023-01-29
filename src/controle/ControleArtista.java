package controle;

import modelo.*;
import java.util.ArrayList;

/**
 * Classe ControleArtista controla todas as informações 
 * dos artistas armazenados.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 * 
 */

public class ControleArtista {
    private ArrayList<Artista> artistas;
    private int qtdArtistas = 10;

    /**
     * Construtor padrão para instanciar um objeto ControleArtista
     * 
     * @param cd
     */
    public ControleArtista(ControleDados cd) {
        this.artistas = cd.getArtistas();
        this.qtdArtistas = cd.getQtdArtistas();
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public int getQtdArtistas() {
        return qtdArtistas;
    }

    public void setQtdArtistas(int qtdArtistas) {
        this.qtdArtistas = qtdArtistas;
    }

    public String[] getNomeArtistas() {
        String[] nomes = new String[qtdArtistas];
        for (int i = 0; i < qtdArtistas; i++) {
            nomes[i] = artistas.get(i).getNome();
        }
        return nomes;
    }

    public String getNomeArtista(int i) {
        if(artistas.get(i).getNome() == null)
            return "Artista não encontrado";
        else
            return artistas.get(i).getNome();
    }

    public String getMusicasArtista(int i) {
        return artistas.get(i).getMusicas().get(i).getNome();
    }

    public String[] getMusicas() {
        String[] musicas = new String[artistas.size()];
        for (int i = 0; i <= artistas.size(); i++) {
            if (artistas.get(i).getMusicas() == null) {
                return musicas;
            } else {
                musicas[i] = artistas.get(i).getMusicas().get(i).getNome();
            }
        }
        return musicas;
    }
}
