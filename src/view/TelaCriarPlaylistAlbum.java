package view;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

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
	
	private static int opcao = 1;
	
	String musicas[] = {"Apocalipse", "champagne problems"};
	
	public TelaCriarPlaylistAlbum(int opcao) {
		if(opcao == 1) {
			frame = new JFrame("Letters - Criar Álbum");
			labelTituloFrame = new JLabel("Criar Álbum");
			labelNomePlaylist = new JLabel("Nome do Álbum:");
			atualizarLista = new JButton("Atualizar Listas");
			
			listSelecMusicas = new JList<String>(musicas);

			labelSelecMusicas.setBounds(590,120,200,30);
			listSelecMusicas.setBounds(500,150,300,100);
			removerMusica.setBounds(500,258,130,20);
			atualizarLista.setBounds(670,418,130,20);
			
			addArtistas();
			SelecArtistas();
			
		}
		else {
			frame = new JFrame("Letters - Criar Playlist");
			labelTituloFrame = new JLabel("Criar Playlist");
			labelNomePlaylist = new JLabel("Nome da Playlist:");
			atualizarLista = new JButton("Atualizar Lista");
			
			listSelecMusicas = new JList<String>(musicas);

			labelSelecMusicas.setBounds(590,135,200,30);
			listSelecMusicas.setBounds(500,170,300,220);
			removerMusica.setBounds(500,400,130,20);
			atualizarLista.setBounds(670,400,130,20);			
		}
		
		frame.setSize(900,600);
		frame.getContentPane().setBackground(new Color(121,150,71));
		
		labelTituloFrame.setBounds(327,30, 300, 50);
		labelTituloFrame.setFont(new Font("Times New Roman", Font.BOLD, 40));
		labelTituloFrame.setForeground(Color.white);
		
		atualizarLista.setBackground(new Color(0,0,0));
		atualizarLista.setForeground(Color.white);
		atualizarLista.setBorder(null);
		atualizarLista.setActionCommand("atualizarLista");
		atualizarLista.addActionListener(this);
		
		frame.add(labelTituloFrame);
		frame.add(atualizarLista);
		InfoPlaylist();
		InfoMusica();
		SelecMusicas();
		
		btnCriar();
		btnCancelar();
		Imagem("/imagem/ImagemPlaylist2.jpg");
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void InfoPlaylist() {
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
	
	public void addArtistas() {
		labelNomeArtista = new JLabel("Adicionar Artista:");
		labelNomeArtista.setForeground(Color.white);
		labelNomeArtista.setBounds(80,290,150,30);
		
		fieldNomeArtista = new JTextField("");
		fieldNomeArtista.setBounds(80,320,200,25);
		
		adicionarArtista = new JButton("Adicionar Artista");
		adicionarArtista.setBounds(290,320,140,25);
		adicionarArtista.setBackground(new Color(0,0,0));
		adicionarArtista.setForeground(Color.white);
		adicionarArtista.setBorder(null);
		
		adicionarArtista.setActionCommand("addArtista");
		adicionarArtista.addActionListener(this);
		
		frame.add(labelNomeArtista);
		frame.add(fieldNomeArtista);
		frame.add(adicionarArtista);
	}
	
	public void SelecMusicas() {
		labelSelecMusicas.setBackground(new Color(0,0,0));
		labelSelecMusicas.setForeground(Color.white);
		
		removerMusica.setBackground(new Color(0,0,0));
		removerMusica.setForeground(Color.white);
		removerMusica.setBorder(null);
		removerMusica.setActionCommand("removerMusica");
		removerMusica.addActionListener(this);
		
		frame.add(labelSelecMusicas);
		frame.add(listSelecMusicas);
		frame.add(removerMusica);
	}
	
	public void SelecArtistas() {
		labelSelecArtistas = new JLabel("Artistas Selecionados:");
		labelSelecArtistas.setBounds(590,280,200,30);
		labelSelecArtistas.setBackground(new Color(0,0,0));
		labelSelecArtistas.setForeground(Color.white);
		
		listSelecArtistas = new JList<String>(musicas);
		listSelecArtistas.setBounds(500,310,300,100);
		
		removerArtista.setBounds(500,418,130,20);
		removerArtista.setBackground(new Color(0,0,0));
		removerArtista.setForeground(Color.white);
		removerArtista.setBorder(null);
		
		removerArtista.setActionCommand("removerArtista");
		removerArtista.addActionListener(this);
		
		frame.add(labelSelecArtistas);
		frame.add(listSelecArtistas);
		frame.add(removerArtista);
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
	
	public static void main(String[] args) {
		new TelaCriarPlaylistAlbum(opcao);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "cancelar") {
			new TelaUsuario();
			frame.dispose();
		} else if(e.getActionCommand() == "criar") {//abrir tela playlist
			frame.dispose();
			
		} else if(e.getActionCommand() == "addMusica") {
			
		} else if(e.getActionCommand() == "removerMusica") {
			
		} else if(e.getActionCommand() == "addArtista") {
			
		} else if(e.getActionCommand() == "removerArtista") {
			
		} else if(e.getActionCommand() == "atualizarLista") {
			
		}
		
	}

}
