package view;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TelaCriarPlaylist implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
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
		frame.setSize(900,600);
		frame.getContentPane().setBackground(new Color(121,150,71));
		
		//panel = new JPanel();
		//panel.setBackground(new Color(121,150,71));
		//panel.setBounds(0,0,100,200);
		
		labelTituloFrame = new JLabel("Criar Playlist");
		labelTituloFrame.setBounds(327,30, 300, 50);
		labelTituloFrame.setFont(new Font("Times New Roman", Font.BOLD, 40));
		labelTituloFrame.setForeground(Color.white);
		
		frame.add(labelTituloFrame);
		InfoPlaylist();
		InfoMusica();
		SelecMusicas();
		btnCriar();
		btnCancelar();
		Imagem("/imagem/ImagemPlaylist2.jpg");
		//frame.add(panel);
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void InfoPlaylist() {
		labelNomePlaylist = new JLabel("Nome da Playlist:");
		labelNomePlaylist.setForeground(new Color(255,255,255));
		labelNomePlaylist.setBounds(80,140,200,30);
		
		fieldNomePlaylist = new JTextField("");
		fieldNomePlaylist.setBounds(80,170,200,25);
		
		frame.add(labelNomePlaylist);
		frame.add(fieldNomePlaylist);
	}
	
	public void InfoMusica() {
		labelNomeMusica = new JLabel("Adicionar Música:");
		labelNomeMusica.setForeground(Color.white);
		labelNomeMusica.setBounds(80,220,150,30);
		
		fieldNomeMusica = new JTextField("");
		fieldNomeMusica.setBounds(80,250,200,25);
		
		adicionarMusica = new JButton("Adicionar Música");
		adicionarMusica.setBounds(290,250,140,25);
		adicionarMusica.setBackground(new Color(0,0,0));
		adicionarMusica.setForeground(Color.white);
		adicionarMusica.setBorder(null);
		
		frame.add(labelNomeMusica);
		frame.add(fieldNomeMusica);
		frame.add(adicionarMusica);
	}
	
	public void SelecMusicas() {
		labelSelecMusicas = new JLabel("Músicas Selecionadas:");
		labelSelecMusicas.setBounds(590,140,200,30);
		labelSelecMusicas.setBackground(new Color(0,0,0));
		labelSelecMusicas.setForeground(Color.white);
		
		listSelecMusicas = new JList<String>(musicas);
		listSelecMusicas.setBounds(500,170,300,220);
		
		removerMusica = new JButton("Remover Música");
		removerMusica.setBounds(500,400,130,20);
		removerMusica.setBackground(new Color(0,0,0));
		removerMusica.setForeground(Color.white);
		removerMusica.setBorder(null);
		
		atualizarLista = new JButton("Atualizar Lista");
		atualizarLista.setBounds(670,400,130,20);
		atualizarLista.setBackground(new Color(0,0,0));
		atualizarLista.setForeground(Color.white);
		atualizarLista.setBorder(null);
		
		frame.add(labelSelecMusicas);
		frame.add(listSelecMusicas);
		frame.add(removerMusica);
		frame.add(atualizarLista);
	}
	
	public void btnCriar() {
		criar = new JButton("Criar");
		criar.setBounds(100,400,250,40);
		criar.setBackground(new Color(0,0,0));
		criar.setForeground(Color.white);
		criar.setBorder(null);
		
		frame.add(criar);
	}
	
	public void btnCancelar() {
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(100,450,250,40);
		cancelar.setBackground(new Color(155,0,0));
		cancelar.setForeground(Color.white);
		cancelar.setActionCommand("cancelar");
		cancelar.addActionListener(this);
		cancelar.setBorder(null);
		
		frame.add(cancelar);
	}
	
	public void Imagem(String srcImg) {
		ImageIcon imagem = new ImageIcon(getClass().getResource(srcImg));
		JLabel label = new JLabel(imagem);
		label.setBounds(430,90,440,440);
		
		frame.add(label);
	}
	
	public static void main(String[] args) {
		new TelaCriarPlaylist();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "cancelar") {
			new TelaUsuario();
			frame.dispose();
		}
		
	}

}
