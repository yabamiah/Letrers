package controle;

import modelo.LetraDeMusica;
import java.util.ArrayList;

/**
 * Classe ControleLetra controla todas as informações das letras armazenadas
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 * 
 */
public class ControleLetra {
    private ArrayList<LetraDeMusica> letras;
    private int qtdLetras;

    /**
     * Construtor recebe um objeto do tipo ControleDados para preencher 
     * a ArrayList letras para instanciar um objeto ControleLetra.
     * 
     * @param cd ControleDados com os objetos LetraDeMusica
     */
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
        return letras.get(i).getCorpoOriginal();
    }

    public String getCorpoTraduzido(int i) {
        return letras.get(i).getCorpoTraduzido();
    }
}
