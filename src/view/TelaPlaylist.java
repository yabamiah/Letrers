package view;

import javax.swing.*;
import java.awt.*;

public class TelaPlaylist {
	JFrame telaPlaylist;
	JLabel nomePlaylist;
	JList<String> listaMusicas;
	
	JButton editarPlaylist;
	JButton excluirPlaylist;
	JButton voltar;
	
	//temporário
	String musicas[] = {"Apocalypse", "Sunsetz", "Cry", "K.", "Sweet", "Sesame Syrup", 
			"Touch", "Falling in Love"};
	
	public TelaPlaylist() {
		telaPlaylist = new JFrame("Letrers - " + "Nome da Playlist");
		
		telaPlaylist.setBounds(250,0,900,700);
		telaPlaylist.getContentPane().setBackground(new Color(132,70,150));

		nomePlaylist = new JLabel("Meu Apocalipse");
		
		listaMusicas = new JList<String>(musicas);
        //listaMusicas.setBounds(100, 130, 200, 200);
        listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaMusicas.setLayoutOrientation(JList.VERTICAL);
		
		editarPlaylist = new JButton("Editar Playlist");
		excluirPlaylist = new JButton("Excluir Playlist");
		voltar = new JButton("Voltar");
		
		telaPlaylist.add(nomePlaylist);
		telaPlaylist.add(listaMusicas);
		telaPlaylist.add(editarPlaylist);
		telaPlaylist.add(excluirPlaylist);
		telaPlaylist.add(voltar);
		
		telaPlaylist.setLayout(new FlowLayout());
		telaPlaylist.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaPlaylist tela = new TelaPlaylist(); 
	}
	
}
