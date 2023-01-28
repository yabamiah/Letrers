package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import controle.*;
import modelo.Musica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class TelaCriarPlaylistAlbum implements ActionListener{
	
	private JFrame frame;
	private JLabel labelTituloFrame;
	private JLabel labelNomePlaylist;
	private JLabel labelNomeMusica;
	private JLabel labelNomeArtista;
	private JLabel labelSelecMusicas  = new JLabel("Músicas Selecionadas:");;
	private JLabel labelSelecArtistas;
	private JTextField fieldNomePlaylist;
	private JTextField fieldNomeMusica;
	private JTextField fieldNomeArtista;
	private JList<String> listSelecMusicas;
	private JList<String> listSelecArtistas;
	private JButton adicionarMusica;
	private JButton adicionarArtista;
	private JButton criar;
	private JButton cancelar;
	private JButton removerMusica = new JButton("Remover Música");;
	private JButton removerArtista = new JButton("Remover Artista");;
	private JButton atualizarLista;
	private ControleDados cd;
	private ControleArtista controleA;
	private ControleMusica controleM;
	private int idxUsuario;
	private int idxPlaylist;
	
	private int opcao;
	
	String musicas[] = {"Apocalipse", "champagne problems"};
	
	public TelaCriarPlaylistAlbum(ControleDados cd, int idxPlaylist, int opcao, int editar) {
		this.cd = cd;
		this.idxPlaylist = idxPlaylist;
		this.opcao = opcao;
		cd.removerPlaylist(idxPlaylist);

		controleA = new ControleArtista(cd);
		controleM = new ControleMusica(cd);

		frame = new JFrame("Letters - Criar Playlist");
		frame.setSize(900,600);
		frame.getContentPane().setBackground(new Color(121,150,71));
					
		labelTituloFrame = new JLabel("Criar Playlist");
		labelTituloFrame.setBounds(327,30, 300, 50);
		labelTituloFrame.setFont(new Font("Times New Roman", Font.BOLD, 40));
		labelTituloFrame.setForeground(Color.white);

		atualizarLista = new JButton("Atualizar Lista");
		atualizarLista.setBackground(new Color(0,0,0));
		atualizarLista.setForeground(Color.white);
		atualizarLista.setBorder(null);
		atualizarLista.setActionCommand("atualizarLista");
		atualizarLista.addActionListener(this);
		atualizarLista.setBounds(670,400,130,20);
		
		frame.add(labelTituloFrame);
		frame.add(atualizarLista);
		InfoPlaylist();
		InfoMusica();
		SelecMusicas();
		
		btnCriar();
		btnCancelar();
		Imagem("imagem/ImagemPlaylist2.jpg");
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public TelaCriarPlaylistAlbum(ControleDados cd, int idxUsuario, int opcao) {
		this.cd = cd;
		controleA = new ControleArtista(cd);
		controleM = new ControleMusica(cd);
		
		this.idxUsuario = idxUsuario;

		frame = new JFrame("Letters - Criar Playlist");
		frame.setSize(900,600);
		frame.getContentPane().setBackground(new Color(121,150,71));
				
		labelTituloFrame = new JLabel("Criar Playlist");
		labelTituloFrame.setBounds(327,30, 300, 50);
		labelTituloFrame.setFont(new Font("Times New Roman", Font.BOLD, 40));
		labelTituloFrame.setForeground(Color.white);

		atualizarLista = new JButton("Atualizar Lista");
		atualizarLista.setBackground(new Color(0,0,0));
		atualizarLista.setForeground(Color.white);
		atualizarLista.setBorder(null);
		atualizarLista.setActionCommand("atualizarLista");
		atualizarLista.addActionListener(this);
		atualizarLista.setBounds(670,400,130,20);

		frame.add(labelTituloFrame);
		frame.add(atualizarLista);
		InfoPlaylist();
		InfoMusica();
		SelecMusicas();
		
		btnCriar();
		btnCancelar();
		Imagem("imagem/ImagemPlaylist2.jpg");
		
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
		labelNomeMusica.setBounds(80,215,150,30);
		
		fieldNomeMusica = new JTextField("");
		fieldNomeMusica.setBounds(80,245,200,25);
		
		adicionarMusica = new JButton("Adicionar Música");
		adicionarMusica.setBounds(290,245,140,25);
		adicionarMusica.setBackground(new Color(0,0,0));
		adicionarMusica.setForeground(Color.white);
		adicionarMusica.setBorder(null);
		
		adicionarMusica.setActionCommand("addMusica");
		adicionarMusica.addActionListener(this);
		
		frame.add(labelNomeMusica);
		frame.add(fieldNomeMusica);
		frame.add(adicionarMusica);
	}
		
	public void SelecMusicas() {
		listSelecMusicas = new JList<String>(controleM.getNomeMusicas());
		listSelecMusicas.setBounds(500,170,300,220);

		labelSelecMusicas.setBackground(new Color(0,0,0));
		labelSelecMusicas.setForeground(Color.white);
		labelSelecMusicas.setBounds(590,135,200,30);
		
		removerMusica.setBackground(new Color(0,0,0));
		removerMusica.setForeground(Color.white);
		removerMusica.setBorder(null);
		removerMusica.setActionCommand("removerMusica");
		removerMusica.addActionListener(this);
		removerMusica.setBounds(500,400,130,20);
		
		frame.add(labelSelecMusicas);
		frame.add(listSelecMusicas);
		frame.add(removerMusica);
	}
	
	public void btnCriar() {
		criar = new JButton("Criar");
		criar.setBounds(100,400,250,40);
		criar.setBackground(new Color(0,0,0));
		criar.setForeground(Color.white);
		criar.setActionCommand("criar");
		criar.addActionListener(this);
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
		label.setBounds(430,85,440,450);
		
		frame.add(label);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "cancelar") {
			new TelaUsuario(cd, idxUsuario);
			frame.dispose();
			
		} else if(e.getActionCommand() == "criar") {//abrir tela playlist
			String nomePlaylist = fieldNomePlaylist.getText();
			ArrayList<Musica> musicas = new ArrayList();

			for(int i = 0; i < listSelecMusicas.getModel().getSize(); i++) {
				musicas.add( new Musica(listSelecMusicas.getModel().getElementAt(i), null));
			}

			boolean verif = cd.adicionarPlaylist(nomePlaylist, musicas);
			int idx = cd.buscarPlaylist(nomePlaylist);

			if(verif) {
				new TelaPlaylistAlbum(2, cd, idx, idxUsuario);
			}
			frame.dispose();
			
		} else if(e.getActionCommand() == "addMusica") {
			
		} else if(e.getActionCommand() == "removerMusica") {
			int idxMusica = listSelecMusicas.getSelectedIndex();
			this.cd.removerMusica(idxMusica);
			controleM = new ControleMusica(this.cd);
			listSelecMusicas = new JList<String>(controleM.getNomeMusicas());

			
		} else if(e.getActionCommand() == "addArtista") {
			
		} else if(e.getActionCommand() == "removerArtista") {
			
		} else if(e.getActionCommand() == "atualizarLista") {
			controleM = new ControleMusica(this.cd);
			listSelecMusicas = new JList<String>(controleM.getNomeMusicas());
		}
		
	}
}