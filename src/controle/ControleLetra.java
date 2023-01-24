package controle;

import modelo.LetraDeMusica;

public class ControleLetra {
    private LetraDeMusica[] letras;
    private int qtdLetras;

    public ControleLetra(ControleDados cd) {
        this.letras = cd.getLetras();
        this.qtdLetras = cd.getQtdLetras();
    }

    public int getQtdLetras() {
        return qtdLetras;
    }

    public void setQtdLetras(int qtdLetras) {
        this.qtdLetras = qtdLetras;
    }

    public String getCorpoOriginal(int i) {
        return letras[i].getCorpoOriginal();
    }

    public String getCorpoTraduzido(int i) {
        return letras[i].getCorpoTraduzido();
    }
}
