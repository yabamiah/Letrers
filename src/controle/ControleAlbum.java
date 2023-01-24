package controle;

import modelo.Album;

public class ControleAlbum {
    private Album[] albuns;
    private int qtdAlbuns;

    public ControleAlbum(ControleDados cd) {
        this.albuns = cd.getAlbuns();
        this.qtdAlbuns = cd.getQtdAlbuns();
    }

    public int getQtdAlbuns() {
        return qtdAlbuns;
    }

    public void setQtdAlbuns(int qtdAlbuns) {
        this.qtdAlbuns = qtdAlbuns;
    }

    public String[] getNomeAlbuns() {
        String[] nomes = new String[qtdAlbuns];
        for (int i = 0; i < qtdAlbuns; i++) {
            nomes[i] = albuns[i].getNome();
        }
        return nomes;
    }

    public String getMusicasAlbum(int i) {
        String musicas = "";
        for (int j = 0; j < albuns[i].getQtdMusica(); j++) {
            int tam = albuns[i].getMusicas().size();
            for (int k = 0; k < tam; k++) {
                musicas += albuns[i].getMusicas().get(k).getNome() + ", ";
            }
        }
        return musicas;
    }

    public String getArtistasAlbum(int i) {
        String artistas = "";
        for (int j = 0; j < albuns[i].getQtdMusica(); j++) {
            int tam = albuns[i].getArtistas().size();
            for (int k = 0; k < tam; k++) {
                artistas += albuns[i].getArtistas().get(k) + ", ";
            }
        }
        return artistas;
    }
}
