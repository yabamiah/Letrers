package controle;

import java.util.*;

import modelo.Musica; // Importa a classe Musica do pacote modelo

public class ControleMusica {
    private Musica[] musicas;
    private int qtdMusicas;

    public ControleMusica() {
        this.musicas = new Musica[100];
        this.qtdMusicas = 0;
    }

    public void adicionarMusica(Musica musica) {
        this.musicas[this.qtdMusicas] = musica;
        this.qtdMusicas++;
    }

    public Boolean removerMusica(Musica musica) {
        for (int i = 0; i < this.qtdMusicas; i++) {
            if (this.musicas[i].getId() == musica.getId()) {
                this.musicas[i] = null;
                this.qtdMusicas--;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Boolean editarMusica(Musica musica) {
        for (int i = 0; i < this.qtdMusicas; i++) {
            if (this.musicas[i].getId() == musica.getId()) {
                this.musicas[i] = musica;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
