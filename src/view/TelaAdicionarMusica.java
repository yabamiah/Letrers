package view;

import javax.swing.*;
import java.awt.*;

public class TelaAdicionarMusica {
	private JFrame frame;
	private JButton btnAdicionar;
	private JButton btnCancelar;
	private JButton btnCriarAlbum;
	private JLabel titulo;
	private JLabel nomeMusica;
	private JLabel nomeAlbum;
	private JLabel nomeLetra;
	private JLabel nomeTraducao;
	private JTextField musica;
	private JTextArea letra;
	private JTextArea traducao;	
	private JComboBox<String> listaAlbuns;
	
	private String[] albuns = {"Midnight", "Lover", "Red", "evermore"};
	
	public TelaAdicionarMusica(){
		frame = new JFrame("Letrers");
		frame.setSize(900,700);
		frame.getContentPane().setBackground(new Color(132,70,150));
		
		btnAdicionar = new JButton("Adicionar");
		btnCancelar = new JButton("Cancelar");
		btnCriarAlbum = new JButton("CriarAlbum");
		
		titulo = new JLabel("Adicionar Música");
		nomeMusica = new JLabel("Nome da Música");
		nomeAlbum = new JLabel("Selecionar álbum:");
		nomeLetra = new JLabel("Insira a Letra Original:");
		nomeTraducao = new JLabel("Insira a tradução da música:");
		
		musica = new JTextField("                ");
		musica.setSize(10,20);
		
		letra = new JTextArea("                  ");
		letra.setSize(20,40);
		
		traducao = new JTextArea("                     ");
		traducao.setSize(20,40);
		
		listaAlbuns = new JComboBox<String>(albuns);
		
		frame.add(titulo);
		frame.add(btnAdicionar);
		frame.add(btnCancelar);
		frame.add(btnCriarAlbum);
		frame.add(nomeMusica);
		frame.add(musica);
		frame.add(nomeAlbum);
		frame.add(listaAlbuns);
		frame.add(nomeLetra);
		frame.add(letra);
		frame.add(nomeTraducao);
		frame.add(traducao);
		
		frame.setLocationRelativeTo(null); //centraliza o frame
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		TelaAdicionarMusica tela = new TelaAdicionarMusica();
	}

}
