package controle;

import modelo.Usuario;
import java.util.ArrayList;

public class ControleUsuario {
    private ArrayList<Usuario> usuarios;
    private int qtdusuarios;

    public ControleUsuario(ControleDados cd) {
        this.usuarios = cd.getUsuarios();
        this.qtdusuarios = cd.getQtdUsuarios();
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
