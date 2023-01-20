package views_finalizadas;

import javax.imageio.ImageIO;
import javax.swing.*;

import view.TelaCriarPlaylist;

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
	private JButton btnMais;
	private JTextField buscar;
	
	String usuario = "Marys";
	String playlists[] = {"Meu Apocalipse", "Estados Extremos de Euforia", 
			"We were so tired", "Nacionais" }; 
	String artistas[] = {"Manoel Gomes", "Alec Benjamin", "Valeria Almeida", "Taylor Swift"};
	
	
	public TelaUsuario() {
		frame = new JFrame("Letters");
		frame.setSize(900,600);
		
		panel = new JPanel();
		panel.setBackground(new Color(121,150,71));
		panel.setBounds(75,80,750,400);
		
		//Cabeçalho
		bemVindo = new JLabel("Bem vindo(a) " + usuario);
		bemVindo.setForeground(Color.white);
		bemVindo.setBounds(75,25,400,40);
		bemVindo.setFont(new Font("", Font.PLAIN, 22));
		
		//Playlists
		miPlaylist = new JLabel("Minhas Playlists");
		miPlaylist.setForeground(Color.white);
		miPlaylist.setBounds(215,100,200,20);
		miPlaylist.setFont(new Font("", Font.PLAIN, 15));
		
		listaPlaylists = new JList<String>(playlists);
		listaPlaylists.setBounds(115,130,300,330);
		
		//Artistas
		miArtistas = new JLabel("Meus Artistas Favoritos");
		miArtistas.setForeground(Color.white);
		miArtistas.setBounds(565,100,200,20);
		miArtistas.setFont(new Font("", Font.PLAIN, 15));
		
		listaArtistasFav = new JList<String>(artistas);
		listaArtistasFav.setBounds(485,130,300,330);
		
		//Add
		ImagemFundo("/imagem/Home.jpg");
		frame.add(bemVindo);
		frame.add(listaPlaylists);
		frame.add(miArtistas);
		frame.add(listaArtistasFav);
		Buscar();
		btnCriarPlaylist();
		btnMais();
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

		frame.add(buscar);
		frame.add(btnBuscar);
	}
	
	public void btnMais() {
		btnMais = new JButton("Mais opções");
		btnMais.setBounds(680,540,120,30);
		btnMais.setForeground(Color.white);
		btnMais.setBackground(new Color(0,0,0));
		btnMais.setBorderPainted(true);
		btnMais.setActionCommand("mais");
		btnMais.addActionListener(this);
		frame.add(btnMais);
	}
	
	public void btnCriarPlaylist() {
		btnCriarPlay = new JButton("Criar Playlist");
		btnCriarPlay.setBounds(100,540,120,30);
		btnCriarPlay.setForeground(Color.white);
		btnCriarPlay.setBackground(new Color(0,0,0));
		btnCriarPlay.setBorderPainted(true);
		
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
	
	public static void main(String[] args) {
		TelaUsuario tela = new TelaUsuario();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "criarPlaylist") {
			new TelaCriarPlaylist();
			frame.dispose();
		}else if(e.getActionCommand() == "mais") {
			
		}else if(e.getActionCommand() == "buscar") {
			
			frame.dispose();
		}
	}
}
