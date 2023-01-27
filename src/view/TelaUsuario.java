package view;

import javax.imageio.ImageIO;
//import javax.imageio.ImageIO;
import javax.swing.*;
import controle.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TelaUsuario implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel bemVindo;
	private JLabel miPlaylist;
	private JLabel miArtistas;
	private JList<String> listaPlaylists;
	private JList<String> listaArtistasFav;
	private JButton btnBuscar;
	private JButton btnCriarPlay;
	private JButton addArtista;
	private JTextField buscar;
	private controle.ControleUsuario controleU;
	private controle.ControlePlaylist controleP;
	private controle.ControleArtista controleA;
	private ControleDados cd;
	private int idxUsuario;
	
	String usuario = "Marys";
	String playlists[] = {"Meu Apocalipse", "Estados Extremos de Euforia", 
			"We were so tired", "Nacionais" }; 
	String artistas[] = {"Manoel Gomes", "Alec Benjamin", "Valeria Almeida", "Taylor Swift"};
	
	
	public TelaUsuario(controle.ControleDados cd, int idx) {
		this.cd = cd;
		controleP = new controle.ControlePlaylist(cd);
		controleA = new controle.ControleArtista(cd);
		controleU = new controle.ControleUsuario(cd);
		
		idxUsuario = idx;

		frame = new JFrame("Letters");
		frame.setSize(900,600);
	
		panel = new JPanel();
		panel.setBackground(new Color(121,150,71));
		panel.setBounds(75,80,750,400);
		
		//Cabeçalho
		bemVindo = new JLabel("Bem vindo(a) " + controleU.getNomeUsuario(idx));
		bemVindo.setForeground(Color.white);
		bemVindo.setBounds(75,35,400,40);
		bemVindo.setFont(new Font("Times New Roman", Font.BOLD, 27));
		
		//Playlists
		miPlaylist = new JLabel("Minhas Playlists");
		miPlaylist.setForeground(Color.white);
		miPlaylist.setBounds(215,100,200,20);
		miPlaylist.setFont(new Font("", Font.BOLD, 18));
		
		listaPlaylists = new JList<String>(controleP.getNomePlaylists());
		listaPlaylists.setBounds(115,130,295,330);
		listaPlaylists.setBackground(new Color(121,150,71));
		listaPlaylists.setForeground(new Color(30,30,30));
		listaPlaylists.setFont(new Font("", Font.BOLD,15));
		
		miArtistas = new JLabel("Meus Artistas Favoritos");
		miArtistas.setForeground(Color.white);
		miArtistas.setBounds(525,100,300,20);
		miArtistas.setFont(new Font("", Font.BOLD, 18));
		
		listaArtistasFav = new JList<String>(controleA.getNomeArtistas());
		listaArtistasFav.setBounds(490,130,295,330);
		listaArtistasFav.setBackground(new Color(121,150,71));
		listaArtistasFav.setForeground(new Color(30,30,30));
		listaArtistasFav.setFont(new Font("", Font.BOLD,15));
		
		//Add
		ImagemFundo("imagem/Home.png");
		frame.add(bemVindo);
		frame.add(listaPlaylists);
		frame.add(miArtistas);
		frame.add(listaArtistasFav);
		Buscar();
		btnCriarPlaylist();
		btnAddArtista();
		frame.add(miPlaylist);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public TelaUsuario(ControleDados cd) {
		this.cd = cd;
		controleP = new ControlePlaylist(cd);
		controleA = new ControleArtista(cd);
		controleU = new ControleUsuario(cd);

		frame = new JFrame("Letters");
		frame.setSize(900,600);
		
		panel = new JPanel();
		panel.setBackground(new Color(121,150,71));
		panel.setBounds(75,80,750,400);
		
		//Cabeçalho
		bemVindo = new JLabel("Bem vindo(a) "/*+controleU.getNomeUsuario(idx)*/);
		bemVindo.setForeground(Color.white);
		bemVindo.setBounds(75,35,400,40);
		bemVindo.setFont(new Font("Times New Roman", Font.BOLD, 27));
		
		//Playlists
		miPlaylist = new JLabel("Minhas Playlists");
		miPlaylist.setForeground(Color.white);
		miPlaylist.setBounds(215,100,200,20);
		miPlaylist.setFont(new Font("", Font.BOLD, 18));
		
		listaPlaylists = new JList<String>(controleP.getNomePlaylists());
		listaPlaylists.setBounds(115,130,295,330);
		listaPlaylists.setBackground(new Color(121,150,71));
		
		miArtistas = new JLabel("Meus Artistas Favoritos");
		miArtistas.setForeground(Color.white);
		miArtistas.setBounds(525,100,300,20);
		miArtistas.setFont(new Font("", Font.BOLD, 18));
		
		listaArtistasFav = new JList<String>(controleA.getNomeArtistas());
		listaArtistasFav.setBounds(490,130,295,330);
		listaArtistasFav.setBackground(new Color(121,150,71));
		listaArtistasFav.setForeground(new Color(30,30,30));
		listaArtistasFav.setFont(new Font("", Font.BOLD,15));
		
		//Add
		ImagemFundo("imagem/Home.png");
		frame.add(bemVindo);
		frame.add(listaPlaylists);
		frame.add(miArtistas);
		frame.add(listaArtistasFav);
		Buscar();
		btnCriarPlaylist();
		btnAddArtista();
		frame.add(miPlaylist);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void Buscar() {
		buscar = new JTextField("");
		buscar.setBounds(520,35,222,30);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(746,35,80,30);
		btnBuscar.setForeground(Color.white);
		btnBuscar.setBackground(new Color(0,0,0));
		btnBuscar.setBorderPainted(true);
		btnBuscar.setActionCommand("buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBorder(null);

		frame.add(buscar);
		frame.add(btnBuscar);
	}
	
	public void btnAddArtista() {
		addArtista = new JButton("Adicionar Artista");
		addArtista.setBounds(670,540,130,30);
		addArtista.setForeground(Color.white);
		addArtista.setBackground(new Color(0,0,0));
		addArtista.setBorderPainted(true);
		addArtista.setBorder(null);
		
		addArtista.setActionCommand("addArtista");
		addArtista.addActionListener(this);
		
		frame.add(addArtista);
	}
	
	public void btnCriarPlaylist() {
		btnCriarPlay = new JButton("Criar Playlist");
		btnCriarPlay.setBounds(100,540,120,30);
		btnCriarPlay.setForeground(Color.white);
		btnCriarPlay.setBackground(new Color(0,0,0));
		btnCriarPlay.setBorderPainted(true);
		btnCriarPlay.setBorder(null);
		
		btnCriarPlay.setActionCommand("criarPlaylist");
		btnCriarPlay.addActionListener(this);
		
		frame.add(btnCriarPlay);
	}
	
	public void ImagemFundo(String srcImg) {
		try {
			BufferedImage img = ImageIO.read(getClass().getResource(srcImg));
			Image dimg = img.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(dimg);
			JLabel label = new JLabel();
			label.setIcon(icon);
			frame.getContentPane().add(label, BorderLayout.CENTER);
			frame.setContentPane(label);
			frame.pack();
			
		}catch(IOException err) {
			err.printStackTrace();
		}
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "criarPlaylist") {
			new TelaCriarPlaylistAlbum(cd, idxUsuario, 2);
			frame.dispose();
		}else if(e.getActionCommand() == "addArtista") {
			new TelaAdicionarArtista(cd, idxUsuario);
			frame.dispose();
			
		}else if(e.getActionCommand() == "buscar") {
			String nomeMusica = buscar.getText();
			
			int idxMusica = cd.buscarMusica(nomeMusica);
			
				
			new TelaMusica(cd, idxMusica);
			frame.dispose();
		
		}
	}
}
