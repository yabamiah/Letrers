package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaUsuario implements ActionListener{
	JFrame telaCentral;
	JLabel bemVindo;
	JLabel miPlaylist;
	JLabel miArtistas;
	JList<String> listaPlaylists;
	JList<String> listaArtistasFav;
	JButton btnBuscar;
	JButton btnCriarPlay;
	JButton btnMais;
	JTextField buscar;
	
	String usuario = "Marys";
	String playlists[] = {"Meu Apocalipse", "Estados Extremos de Euforia", 
			"We were so tired", "Nacionais" }; 
	String artistas[] = {"Manoel Gomes", "Alec Benjamin", "Valeria Almeida", "Taylor Swift"};
	
	
	public TelaUsuario() {
		telaCentral = new JFrame("Letters");
		telaCentral.setBounds(250,0,900,700);
		telaCentral.getContentPane().setBackground(new Color(132,70,150));
		
		bemVindo = new JLabel("Bem vindo(a) " + usuario);
		
		miPlaylist = new JLabel("Minhas Playlists");
		listaPlaylists = new JList<String>(playlists);
		
		miArtistas = new JLabel("Meus Artistas Favoritos");
		listaArtistasFav = new JList<String>(artistas);
		
		buscar = new JTextField("                   ");
		btnBuscar = new JButton("Buscar música");
		
		btnCriarPlay = new JButton("Criar Playlist");
		btnMais = new JButton("Mais opções");
		
		telaCentral.add(bemVindo);
		telaCentral.add(miPlaylist);
		telaCentral.add(listaPlaylists);
		telaCentral.add(miArtistas);
		telaCentral.add(listaArtistasFav);
		telaCentral.add(buscar);
		telaCentral.add(btnBuscar);
		telaCentral.add(btnCriarPlay);
		telaCentral.add(btnMais);
				
		telaCentral.setLayout(new FlowLayout());
		telaCentral.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		TelaUsuario tela = new TelaUsuario();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
