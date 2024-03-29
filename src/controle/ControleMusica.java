package controle;

import modelo.Musica;
import java.util.ArrayList;

/**
 * Classe ControleMusica controla todas as informações das musicas armazenadas
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 * 
 */
public class ControleMusica {
    private ArrayList<Musica> musicas;
    private int qtdMusicas = 10;

    /**
     * Construtor recebe um objeto do tipo ControleDados para preencher 
     * a ArrayList musicas para instanciar um objeto ControleMusica
     * 
     * @param cd ControleDados com os objetos Musica
     */
    public ControleMusica(ControleDados cd) {
        this.musicas = cd.getMusicas();
        this.qtdMusicas = cd.getQtdMusicas();
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public String[] getNomeMusicas() {
        String[] nomes = new String[qtdMusicas];
        
        for (int i = 0; i < qtdMusicas; i++) {
            nomes[i] = musicas.get(i).getNome();
        }
        return nomes;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public String getNomeMusica(int idx) {
        return musicas.get(idx).getNome();
    }

    public String getLetraOriginal(int idx) {
        return musicas.get(idx).getLetras().getCorpoOriginal();
    }

    public void getLetraOriginal(String letraOriginal, int idx) {
        musicas.get(idx).getLetras().setCorpoOriginal(letraOriginal);
    }

    public String getLetraTraduzido(int idx) {
        return musicas.get(idx).getLetras().getCorpoTraduzido();
    }

    public void getLetraTraduzido(String letraTraduzido, int idx) {
        musicas.get(idx).getLetras().setCorpoTraduzido(letraTraduzido);
    }
}
