package controle;

import modelo.*;
import java.util.ArrayList;

public class ControleArtista {
    private ArrayList<Artista> artistas;
    private int qtdArtistas;

    public ControleArtista(ControleDados cd) {
        this.artistas = cd.getArtistas();
        this.qtdArtistas = cd.getQtdArtistas();
    }

    public int getQtdArtistas() {
        return qtdArtistas;
    }

    public void setQtdArtistas(int qtdArtistas) {
        this.qtdArtistas = qtdArtistas;
    }

    public ArrayList<String> getNomeArtista() {
        ArrayList<String> nomes = new ArrayList<String>();
        for (int i = 0; i < artistas.size(); i++) {
            nomes.add(artistas.get(i).getNome());
        }
        return nomes;
    }

    public String getGeneroArtista(int i) {
        return artistas.get(i).getGeneros().get(i);
    }

    public String getMusicasArtista(int i) {
        return artistas.get(i).getMusicas().get(i).getNome();
    }
}
