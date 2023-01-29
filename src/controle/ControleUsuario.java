package controle;

import modelo.Usuario;
import java.util.ArrayList;

/**
 * Classe ControleUsuario controla todas as informações dos usuarios armazenados
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 * 
 */
public class ControleUsuario {
    private ArrayList<Usuario> usuarios;
    private int qtdusuarios;

    /**
     * Construtor recebe um objeto do tipo ControleDados para preencher 
     * a ArrayList usuarios para instanciar um objeto ControleUsuarios
     * 
     * @param cd ControleDados com os objetos Usuario
     */
    public ControleUsuario(ControleDados cd) {
        usuarios = cd.getUsuarios();
        qtdusuarios = cd.getQtdUsuarios();
    }

    public int getQtdusuarios() {
        return qtdusuarios;
    }

    public void setQtdusuarios(int qtdusuarios) {
        this.qtdusuarios = qtdusuarios;
    }

    public String[] getNomeUsuarios() {
        String[] nomes = new String[qtdusuarios];
        for (int i = 0; i < qtdusuarios; i++) {
            nomes[i] = usuarios.get(i).getNome();
        }
        return nomes;
    }
    
    public String getNomeUsuario(int idx) {
        return usuarios.get(idx).getNome();
    }

    public String getPlayListUsuario(int i) {
        return usuarios.get(i).toString();
    }
}
