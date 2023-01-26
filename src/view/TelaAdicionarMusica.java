package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import controle.*;

public class TelaAdicionarMusica implements ActionListener {
	private JFrame frame;
	private JButton criar;
	private JButton cancelar;
	private JButton btnCriarArtista;
	private JLabel titulo;
	private JLabel nomeArtista;
	private JLabel nomeMusica;
	private JLabel nomeLetra;
	private JLabel nomeTraducao;
	private JTextField musica;
	private JTextArea letra;
	private JTextArea traducao;	
	private JComboBox<String> listaArtista;
	private ControleMusica controleMusica;
	private ControleDados controleDados;
	private int idxArtista;
	private int idxUsuario;
	
	private String[] albuns = {"Midnight", "Lover", "Red", "evermore"};
	
	public TelaAdicionarMusica(ControleDados cd, int idxArtista, int idxUsuario){
		controleDados = cd;
		controleMusica = new ControleMusica(cd);
		this.idxArtista = idxArtista;
		
		this.idxUsuario = idxUsuario;
		
		frame = new JFrame("Letters");
		frame.setSize(900,600);
		frame.getContentPane().setBackground(new Color(121,150,71));
		
		titulo = new JLabel("Adicionar Música");
		titulo.setBounds(290,30,400,30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 40));
		titulo.setForeground(Color.white);
		
		frame.add(titulo);
		musica();
		//album();
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

	public TelaAdicionarMusica(){
		frame = new JFrame("Letters");
		frame.setSize(900,600);
		frame.getContentPane().setBackground(new Color(121,150,71));
		
		titulo = new JLabel("Adicionar Música");
		titulo.setBounds(290,30,400,30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 40));
		titulo.setForeground(Color.white);
		
		frame.add(titulo);
		musica();
		//album();
		artista();
		letra();
		traducao();
		btnCriar();
		btnCancelar();
		
		frame.setResizable(false);
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
	
	public void artista() {
		nomeArtista = new JLabel("Selecionar artista:");
		nomeArtista.setBounds(350,112,120,20);
		nomeArtista.setForeground(Color.black);
		
		listaArtista = new JComboBox<String>(albuns);
		listaArtista.setBounds(350,135,120,25);
		listaArtista.setBackground(Color.white);
		listaArtista.setForeground(Color.black);
		
		btnCriarArtista = new JButton("Criar Artista");
		btnCriarArtista.setBackground(Color.black);
		btnCriarArtista.setForeground(Color.white);
		btnCriarArtista.setBorder(null);
		btnCriarArtista.setBounds(475,135,125,25);
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
		criar.setActionCommand("adicionar");
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
		if(e.getActionCommand() == "adicionar") {
			String nomeMusica = musica.getText();
			String nomeArtista = (String) listaArtista.getSelectedItem();
			boolean verif = controleDados.adicionarMusica(nomeMusica, null);

			if(verif) {
				new TelaArtista(controleDados, idxArtista, idxUsuario);
				frame.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Música já cadastrada!");
			}
		} else if(e.getActionCommand() == "cancelar") {
			new TelaArtista(controleDados, idxArtista, idxUsuario);
			frame.dispose();
			
		} else if(e.getActionCommand() == "criarArtista") {
			//new TelaAdicionarArtista();
			frame.dispose();
		}
		
	}

}
