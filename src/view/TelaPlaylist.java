package view;

import javax.swing.*;
import java.awt.*;

public class TelaPlaylist {
	JFrame frame;
	JLabel nomePlaylist;
	JList<String> listaMusicas;
	
	JButton editarPlaylist;
	JButton excluirPlaylist;
	JButton voltar;
	
	//temporário
	String musicas[] = {"Apocalypse", "Sunsetz", "Cry", "K.", "Sweet", "Sesame Syrup", 
			"Touch", "Falling in Love"};
	
	public TelaPlaylist() {
		frame = new JFrame("Letrers - " + "Nome da Playlist");
		frame.setBounds(250,0,900,700);
		frame.getContentPane().setBackground(new Color(132,70,150));

		nomePlaylist = new JLabel("Meu Apocalipse");
		
		listaMusicas = new JList<String>(musicas);
        listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		editarPlaylist = new JButton("Editar Playlist");
		excluirPlaylist = new JButton("Excluir Playlist");
		voltar = new JButton("Voltar");
		
		frame.add(nomePlaylist);
		frame.add(listaMusicas);
		frame.add(editarPlaylist);
		frame.add(excluirPlaylist);
		frame.add(voltar);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaPlaylist tela = new TelaPlaylist(); 
	}
	
}
