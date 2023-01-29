package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Classe TelaUsuario é a tela principal da aplicação a apresenta uma barra de
 * busca, lista de artistas cadastrados e playlists criadas.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 */

public class TelaUsuario implements ActionListener, ListSelectionListener {

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
	private JButton sair;
	private JTextField buscar;
	private controle.ControleUsuario controleU;
	private controle.ControlePlaylist controleP;
	private controle.ControleArtista controleA;
	private ControleDados cd;
	private int idxUsuario;

	/**
	 * Contrutor um do frame. Foram colocados mais de um para possibilitar a entrada
	 * na tela com diferentes argumentos.
	 * 
	 * @param cd
	 * @param idx
	 */

	public TelaUsuario(controle.ControleDados cd, int idx) {
		this.cd = cd;
		controleP = new controle.ControlePlaylist(cd);
		controleA = new controle.ControleArtista(cd);
		controleU = new controle.ControleUsuario(cd);

		idxUsuario = idx;

		frame = new JFrame("Letters");
		frame.setSize(900, 600);

		panel = new JPanel();
		panel.setBackground(new Color(121, 150, 71));
		panel.setBounds(75, 80, 750, 400);

		// Cabeçalho
		bemVindo = new JLabel("Bem vindo(a) " + controleU.getNomeUsuario(idx));
		bemVindo.setForeground(Color.white);
		bemVindo.setBounds(75, 35, 400, 40);
		bemVindo.setFont(new Font("Times New Roman", Font.BOLD, 27));

		// Playlists
		miPlaylist = new JLabel("Minhas Playlists");
		miPlaylist.setForeground(Color.white);
		miPlaylist.setBounds(215, 100, 200, 20);
		miPlaylist.setFont(new Font("", Font.BOLD, 18));

		listaPlaylists = new JList<String>(controleP.getNomePlaylists());
		listaPlaylists.setBounds(115, 130, 295, 330);
		listaPlaylists.setBackground(new Color(121, 150, 71));
		listaPlaylists.setForeground(new Color(30, 30, 30));
		listaPlaylists.setFont(new Font("", Font.BOLD, 15));
		listaPlaylists.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaPlaylists.addListSelectionListener(this);

		miArtistas = new JLabel("Meus Artistas Favoritos");
		miArtistas.setForeground(Color.white);
		miArtistas.setBounds(525, 100, 300, 20);
		miArtistas.setFont(new Font("", Font.BOLD, 18));

		listaArtistasFav = new JList<String>(controleA.getNomeArtistas());
		listaArtistasFav.setBounds(490, 130, 295, 330);
		listaArtistasFav.setBackground(new Color(121, 150, 71));
		listaArtistasFav.setForeground(new Color(30, 30, 30));
		listaArtistasFav.setFont(new Font("", Font.BOLD, 15));
		listaArtistasFav.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaArtistasFav.addListSelectionListener(this);

		// Add
		ImagemFundo("imagem/Home.png");
		frame.add(bemVindo);
		frame.add(listaPlaylists);
		frame.add(miArtistas);
		frame.add(listaArtistasFav);
		Buscar();
		btnCriarPlaylist();
		btnAddArtista();
		btnSair();
		frame.add(miPlaylist);
		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	/**
	 * Função Buscar exibe uma JTextField e um botão para realizar a busca dos
	 * artista.
	 */

	public void Buscar() {
		buscar = new JTextField("");
		buscar.setBounds(500, 35, 222, 30);

		btnBuscar = new JButton("Buscar Artista");
		btnBuscar.setBounds(726, 35, 100, 30);
		btnBuscar.setForeground(Color.white);
		btnBuscar.setBackground(new Color(0, 0, 0));
		btnBuscar.setBorderPainted(true);
		btnBuscar.setActionCommand("buscarArtista");
		btnBuscar.addActionListener(this);
		btnBuscar.setBorder(null);

		frame.add(buscar);
		frame.add(btnBuscar);
	}

	/**
	 * Função btnAddArtista exibe um botão para adicionar artistas a base de dados
	 * da aplicação
	 */

	public void btnAddArtista() {
		addArtista = new JButton("Adicionar Artista");
		addArtista.setBounds(670, 540, 130, 30);
		addArtista.setForeground(Color.white);
		addArtista.setBackground(new Color(0, 0, 0));
		addArtista.setBorderPainted(true);
		addArtista.setBorder(null);

		addArtista.setActionCommand("addArtista");
		addArtista.addActionListener(this);

		frame.add(addArtista);
	}

	/**
	 * Função btnCriarPlaylist exibe um botão para criar playlist para aquele
	 * usuário
	 */

	public void btnCriarPlaylist() {
		btnCriarPlay = new JButton("Criar Playlist");
		btnCriarPlay.setBounds(100, 540, 120, 30);
		btnCriarPlay.setForeground(Color.white);
		btnCriarPlay.setBackground(new Color(0, 0, 0));
		btnCriarPlay.setBorderPainted(true);
		btnCriarPlay.setBorder(null);

		btnCriarPlay.setActionCommand("criarPlaylist");
		btnCriarPlay.addActionListener(this);

		frame.add(btnCriarPlay);
	}

	/**
	 * Função btnSair exibe um botão para o usuário deslogar e retornar para
	 * {@link TelaInicial}.
	 */

	public void btnSair() {
		sair = new JButton("Sair");
		sair.setBounds(10, 10, 70, 20);
		sair.setBorderPainted(true);
		sair.setForeground(Color.white);
		sair.setBackground(new Color(0, 0, 0));
		sair.setBorder(null);
		sair.setActionCommand("sair");
		sair.addActionListener(this);

		frame.add(sair);
	}

	/**
	 * Função ImagemFundo coloca uma imagem de fundo do frame.
	 * 
	 * @param srcImg
	 */

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

		} catch (IOException err) {
			err.printStackTrace();
		}
	}

	/**
	 * Método da interface ActionListener que implementa as funções estabelecidas
	 * para os botões e para os elementos do frame.
	 */

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "criarPlaylist") {
			new TelaCriarPlaylist(cd, idxUsuario, 2);
			frame.dispose();
		} else if (e.getActionCommand() == "addArtista") {
			new TelaAdicionarArtista(cd, idxUsuario);
			frame.dispose();

		} else if (e.getActionCommand() == "buscarArtista") {
			String nomeArtista = buscar.getText();

			int idxArtista = cd.buscarArtista(nomeArtista);
			if (idxArtista == -1) {
				JOptionPane.showMessageDialog(null, "Esse artista não está cadastrado!");
			} else {
				new TelaArtista(cd, idxArtista, idxUsuario);
				frame.dispose();
			}
		} else if (e.getActionCommand() == "sair") {
			idxUsuario = 0;
			new TelaInicial();
			frame.dispose();
		}
	}
	
	/**
	 * Método da interface ListSelectionListener que abre as telas selecionadas pelo usuário.
	 */

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object object = e.getSource();
		String nome;
		
		if(e.getValueIsAdjusting() && object == listaPlaylists) {
			nome = listaPlaylists.getSelectedValue().toString();
			int idxPlaylist = cd.buscarPlaylist(nome);
			
			new TelaPlaylist(2, cd, idxPlaylist, idxUsuario);
			frame.dispose();
			
		} else if(e.getValueIsAdjusting() && object == listaArtistasFav) {
			nome = listaArtistasFav.getSelectedValue().toString();
			int idxArtista = cd.buscarArtista(nome);
			
			new TelaArtista(cd, idxArtista, idxUsuario);
			frame.dispose();			
		}
		
		
		
	}
}
