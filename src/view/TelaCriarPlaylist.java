package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCriarPlaylist implements ActionListener{
	
	private JFrame frame;
	private JLabel labelTituloFrame;
	private JLabel labelNomePlaylist;
	private JLabel labelNomeMusica;
	private JLabel labelSelecMusicas;
	private JTextField fieldNomePlaylist;
	private JTextField fieldNomeMusica;
	private JList<String> listSelecMusicas;
	private JButton adicionarMusica;
	private JButton criar;
	private JButton cancelar;
	private JButton removerMusica;
	private JButton atualizarLista;
	private JButton voltar;
	
	String musicas[] = {"Apocalipse", "champagne problems"};
	
	public TelaCriarPlaylist() {
		frame = new JFrame("Letrers - Criar Playlist");
		frame.setSize(900,700);
		frame.setLocationRelativeTo(null);
		labelTituloFrame = new JLabel("Criar Playlist");
		
		frame.add(labelTituloFrame);
		InfoPlaylist();
		InfoMusica();
		SelecMusicas();
		btnCriar();
		btnCancelar();
		btnVoltar();
		
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public void InfoPlaylist() {
		labelNomePlaylist = new JLabel("Nome da Playlist:");
		fieldNomePlaylist = new JTextField("                ");
		
		frame.add(labelNomePlaylist);
		frame.add(fieldNomePlaylist);
	}
	
	public void InfoMusica() {
		labelNomeMusica = new JLabel("Adicionar Música:");
		fieldNomeMusica = new JTextField("             ");
		adicionarMusica = new JButton("Adicionar Música");
		
		frame.add(labelNomeMusica);
		frame.add(fieldNomeMusica);
		frame.add(adicionarMusica);
	}
	
	public void SelecMusicas() {
		labelSelecMusicas = new JLabel("Músicas Selecionadas:");
		listSelecMusicas = new JList<String>(musicas);
		removerMusica = new JButton("Remover Música");
		atualizarLista = new JButton("Atualizar Lista");
		
		frame.add(labelSelecMusicas);
		frame.add(listSelecMusicas);
		frame.add(removerMusica);
		frame.add(atualizarLista);
	}
	
	public void btnCriar() {
		criar = new JButton("Criar");
		
		frame.add(criar);
	}
	
	public void btnCancelar() {
		cancelar = new JButton("Cancelar");
		
		frame.add(cancelar);
	}
	
	public void btnVoltar() {
		voltar = new JButton("Voltar");
		voltar.setActionCommand("voltar");
		voltar.addActionListener(this);
		
		frame.add(voltar);
	}
	
	public static void main(String[] args) {
		new TelaCriarPlaylist();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "voltar") {
			new TelaUsuario();
		}
		
	}

}
