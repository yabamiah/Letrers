package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAdicionarMusica implements ActionListener {
	private JFrame frame;
	private JButton criar;
	private JButton cancelar;
	private JButton btnCriarAlbum;
	private JButton btnCriarArtista;
	private JLabel titulo;
	private JLabel nomeMusica;
	private JLabel nomeAlbum;
	private JLabel nomeArtista;
	private JLabel nomeLetra;
	private JLabel nomeTraducao;
	private JTextField musica;
	private JTextArea letra;
	private JTextArea traducao;	
	private JComboBox<String> listaAlbuns;
	private JComboBox<String> listaArtista;
	
	private String[] albuns = {"Midnight", "Lover", "Red", "evermore"};
	
	public TelaAdicionarMusica(){
		frame = new JFrame("Letters");
		frame.setSize(900,600);
		frame.getContentPane().setBackground(new Color(121,150,71));
		
		titulo = new JLabel("Adicionar Música");
		titulo.setBounds(330,30,300,30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		titulo.setForeground(Color.black);
		
		frame.add(titulo);
		musica();
		album();
		artista();
		letra();
		traducao();
		btnCriar();
		btnCancelar();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); //centraliza o frame
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public void musica() {
		nomeMusica = new JLabel("Nome da Música");
		nomeMusica.setBounds(70,112,120,20);
		nomeMusica.setForeground(Color.black);
		
		musica = new JTextField();
		musica.setBounds(70,135,250,25);
		
		frame.add(musica);
		frame.add(nomeMusica);
	}
	
	public void album() {
		nomeAlbum = new JLabel("Selecionar álbum:");
		nomeAlbum.setBounds(350,112,120,20);
		nomeAlbum.setForeground(Color.black);
		
		listaAlbuns = new JComboBox<String>(albuns);
		listaAlbuns.setBounds(350,135,120,25);
		listaAlbuns.setBackground(Color.white);
		listaAlbuns.setForeground(Color.black);
		
		btnCriarAlbum = new JButton("Criar Álbum");
		btnCriarAlbum.setBackground(Color.black);
		btnCriarAlbum.setForeground(Color.white);
		btnCriarAlbum.setBorder(null);
		btnCriarAlbum.setBounds(475,135,125,25);
		btnCriarAlbum.setActionCommand("criarAlbum");
		btnCriarAlbum.addActionListener(this);
		
		frame.add(nomeAlbum);
		frame.add(listaAlbuns);
		frame.add(btnCriarAlbum);
	}
	
	public void artista() {
		nomeArtista = new JLabel("Selecionar artista:");
		nomeArtista.setBounds(650,112,170,20);
		nomeArtista.setForeground(Color.black);
		
		listaArtista = new JComboBox<String>(albuns);
		listaArtista.setBounds(650,135,170,25);
		listaArtista.setBackground(Color.white);
		listaArtista.setForeground(Color.black);
		
		btnCriarArtista = new JButton("Criar Artista");
		btnCriarArtista.setBackground(Color.black);
		btnCriarArtista.setForeground(Color.white);
		btnCriarArtista.setBorder(null);
		btnCriarArtista.setBounds(650,170,170,25);
		btnCriarArtista.setActionCommand("criarArtista");
		btnCriarArtista.addActionListener(this);
		
		frame.add(nomeArtista);
		frame.add(listaArtista);
		frame.add(btnCriarArtista);
	}
	
	public void letra() {
		nomeLetra = new JLabel("Insira a Letra Original:");
		nomeLetra.setForeground(Color.black);
		nomeLetra.setBounds(70,175,200,20);
		
		letra = new JTextArea(5,10);
		letra.setBounds(70,200,250,300);
		
		frame.add(nomeLetra);
		frame.add(letra);
	}
	
	public void traducao() {
		nomeTraducao = new JLabel("Insira a Tradução da Música:");
		nomeTraducao.setForeground(Color.black);
		nomeTraducao.setBounds(350,175,200,20);
		
		traducao = new JTextArea(5,10);
		traducao.setBounds(350,200,250,300);
		
		frame.add(nomeTraducao);
		frame.add(traducao);
	}
	
	
	public void btnCriar() {
		criar = new JButton("Adicionar");
		criar.setBounds(650,400,170,40);
		criar.setBackground(new Color(0,0,0));
		criar.setForeground(Color.white);
		criar.setBorder(null);
		criar.setActionCommand("criarMusica");
		criar.addActionListener(this);
		
		frame.add(criar);
	}
	
	
	public void btnCancelar() {
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(650,450,170,40);
		cancelar.setBackground(new Color(155,0,0));
		cancelar.setForeground(Color.white);
		cancelar.setActionCommand("cancelar");
		cancelar.addActionListener(this);
		cancelar.setBorder(null);
		
		frame.add(cancelar);
	}
	
	public static void main(String[] args) {
		TelaAdicionarMusica tela = new TelaAdicionarMusica();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "criar") {
			//ir pra tela da musica
		} else if(e.getActionCommand() == "cancelar") {
			new TelaMaisOpcoes();
			frame.dispose();
			
		} else if(e.getActionCommand() == "criarAlbum") {
			new TelaCriarAlbum();
			frame.dispose();
			
		} else if(e.getActionCommand() == "criarArtista") {
			new TelaAdicionarArtista();
			frame.dispose();
		}
		
	}

}
