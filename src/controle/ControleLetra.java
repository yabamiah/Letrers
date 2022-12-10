package controle;

import modelo.LetraDeMusica;

public class ControleLetra {
    private LetraDeMusica[] letras;
    private int qtdLetras;

    public ControleLetra() {
        this.letras = new LetraDeMusica[100];
        this.qtdLetras = 0;
    }

    public void adicionarLetra(LetraDeMusica letra) {

    }

    public Boolean removerLetra(LetraDeMusica letra) {
        return false;
    }

    public Boolean editarLetra(LetraDeMusica letra) {
        return false;
    }
}
