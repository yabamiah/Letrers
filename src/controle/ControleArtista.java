package controle;

import modelo.Artista;

public class ControleArtista {
    private Artista[] artistas;
    private int qtdArtistas;

    public ControleArtista() {
        this.artistas = new Artista[100];
        this.qtdArtistas = 0;
    }

    public void adicionarArtista(Artista artista) {

    }

    public Boolean removerArtista(Artista artista) {
        return false;
    }

    public Boolean editarArtista(Artista artista) {
        return false;
    }
}
