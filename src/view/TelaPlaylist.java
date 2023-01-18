package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPlaylist implements ActionListener{
	JFrame frame;
	JLabel nomePlaylist;
	JList<String> listaMusicas;
	
	JButton editar;
	JButton excluir;
	JButton voltar;
	JButton addMusica;
	
	//temporário
	String musicas[] = {"Apocalypse", "Sunsetz", "Cry", "K.", "Sweet", "Sesame Syrup", 
			"Touch", "Falling in Love"};
	
	public TelaPlaylist() {
		frame = new JFrame("Letrers - " + "Nome da Playlist");
		frame.setSize(900,700);
		frame.getContentPane().setBackground(new Color(132,70,150));

		nomePlaylist = new JLabel("Meu Apocalipse");
		
		listaMusicas = new JList<String>(musicas);
        listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		frame.add(nomePlaylist);
		frame.add(listaMusicas);
		
		btnVoltar();
		btnExcluir();
		btnAddMusica();
		btnEditar();
		
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}	
	
	public void btnAddMusica() {
		addMusica = new JButton("Adicionar Música");
		
		frame.add(addMusica);
	}
	
	public void btnEditar() {
		editar = new JButton("Editar Playlist");
		frame.add(editar);
	}
	
	public void btnVoltar() {
		voltar = new JButton("Voltar");
		
		frame.add(voltar);
	}
	
	public void btnExcluir() {
		excluir = new JButton("Excluir Playlist");
		
		excluir.setActionCommand("excluir");
		excluir.addActionListener(this);
		frame.add(excluir);
	}
	
	public static void main(String[] args) {
		TelaPlaylist tela = new TelaPlaylist(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == "excluir") {
		}
		
	}
	
}
