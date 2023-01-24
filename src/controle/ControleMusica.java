package controle;

import modelo.Musica; // Importa a classe Musica do pacote modelo

public class ControleMusica {
    private Musica[] musicas;
    private int qtdMusicas;

    public ControleMusica(ControleDados cd) {
        this.musicas = cd.getMusicas();
        this.qtdMusicas = cd.getQtdMusicas();
    }

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public String[] getNomeMusica() {
        String[] nomes = new String[qtdMusicas];
        for (int i = 0; i < qtdMusicas; i++) {
            nomes[i] = musicas[i].getNome();
        }
        return nomes;
    }

    public String getGeneroMusica(int i) {
        return musicas[i].getGenero();
    }
}
