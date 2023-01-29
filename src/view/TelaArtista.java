package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import controle.*;

/**
 * Classe TelaArtista exibe as informações e músicas cadastradas para o artista.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 *
 */

public class TelaArtista implements ActionListener {

	private JFrame frame;
	private JLabel nomeArtista;
	private JLabel labelMusica;
	private JList<String> listaMusicas;
	private JScrollPane listaMusicasScroll;
	private JTextField buscar;
	private JButton btnBuscar;
	private JButton voltar;
	private JButton editar;
	private JButton excluir;
	private JButton addMusica;
	private String artistaAtual;
	private int idxArtista;
	private ControleArtista controlA;
	private ControleMusica controlM;
	private ControleDados cd;
	private int idxUsuario;

	/**
	 * Construtor um do frame. Foi colocado mais de um para possibilitar a entrada
	 * na tela com diferentes argumentos.
	 * 
	 * @param cd
	 * @param idxArtista
	 * @param idxUsuario
	 */

	public TelaArtista(ControleDados cd, int idxArtista, int idxUsuario) {
		this.cd = cd;

		controlM = new controle.ControleMusica(cd);
		controlA = new controle.ControleArtista(cd);

		this.idxUsuario = idxUsuario;
		this.idxArtista = idxArtista;
		artistaAtual = controlA.getNomeArtista(idxArtista);

		frame = new JFrame("Letters - " + artistaAtual);
		frame.setSize(900, 600);
		frame.getContentPane().setBackground(Color.PINK);
		
		nomeArtista = new JLabel(controlA.getNomeArtista(idxArtista));
		nomeArtista.setBounds(225, 20, 300, 50);
		nomeArtista.setFont(new Font("Times New Roman", Font.BOLD, 25));
		nomeArtista.setForeground(Color.white);

		ImagemFundo("imagem/Home.png");
		frame.add(nomeArtista);
		Buscar();
		btnVoltar();
		areaMusica();
		btnAddMusica();
		btnEditar();
		btnExcluir();

		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	/**
	 * Construtor dois do frame. Foi colocado mais de um para possibilitar a entrada
	 * na tela com diferentes argumentos.
	 * 
	 * @param cd
	 * @param idxArtista
	 * @param idxUsuario
	 * @param idxMusica
	 */

	public TelaArtista(ControleDados cd, int idxArtista, int idxUsuario, int idxMusica) {
		this.cd = cd;

		controlM = new ControleMusica(cd);
		controlA = new controle.ControleArtista(cd);
		nomeArtista = new JLabel(controlA.getNomeArtista(idxArtista));

		this.idxUsuario = idxUsuario;
		this.idxArtista = idxArtista;
		artistaAtual = controlA.getNomeArtista(idxArtista);

		frame = new JFrame("Letters - " + artistaAtual);
		frame.setSize(900, 600);
		frame.getContentPane().setBackground(Color.PINK);

		nomeArtista.setBounds(225, 20, 300, 50);
		nomeArtista.setFont(new Font("Times New Roman", Font.BOLD, 25));
		nomeArtista.setForeground(Color.white);

		ImagemFundo("imagem/Home.png");
		frame.add(nomeArtista);
		Buscar();
		btnVoltar();
		areaMusica();
		btnAddMusica();
		btnEditar();
		btnExcluir();

		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	/**
	 * Função btnVoltar exibe um botão para voltar a {@link TelaUsuario}.
	 */

	public void btnVoltar() {
		voltar = new JButton("Voltar");
		voltar.setBounds(10, 10, 70, 20);
		voltar.setBorderPainted(true);
		voltar.setForeground(Color.white);
		voltar.setBackground(new Color(0, 0, 0));
		voltar.setBorder(null);
		voltar.setActionCommand("voltar");
		voltar.addActionListener(this);

		frame.add(voltar);
	}

	/**
	 * Função areaMusica exibe um JList com as músicas cadastradas para o artista.
	 */

	public void areaMusica() {
		labelMusica = new JLabel("Músicas deste artista:");
		labelMusica.setBounds(225, 70, 500, 60);
		labelMusica.setForeground(Color.white);
		labelMusica.setFont(new Font("Times New Roman", Font.BOLD, 18));

		listaMusicas = new JList<String>(controlM.getNomeMusicas());

		listaMusicas.setBounds(225, 120, 442, 330);
		listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaMusicas.setLayoutOrientation(JList.VERTICAL);
		listaMusicas.setVisibleRowCount(-1);
		listaMusicas.setForeground(Color.black);
		listaMusicas.setFont(new Font("", Font.PLAIN, 18));

		listaMusicasScroll = new JScrollPane(listaMusicas);
		listaMusicasScroll.setBounds(listaMusicas.getX(), listaMusicas.getY(), listaMusicas.getWidth(),
				listaMusicas.getHeight());

		frame.add(labelMusica);
		frame.add(listaMusicasScroll);
	}

	/**
	 * Função btnAddMusica exibe um botão para abrir o frame
	 * {@link TelaAdicionarMusica}.
	 */

	public void btnAddMusica() {
		addMusica = new JButton("Adicionar Música");
		addMusica.setBounds(35, 540, 120, 30);
		addMusica.setForeground(Color.white);
		addMusica.setBackground(Color.black);
		addMusica.setBorderPainted(true);
		addMusica.setActionCommand("addMusica");
		addMusica.addActionListener(this);
		addMusica.setBorder(null);

		frame.add(addMusica);
	}

	/**
	 * Função btnEditar exibe um botão para abrir o frame
	 * {@link TelaAdicionarArtista}, porém para editar o Artista.
	 */

	public void btnEditar() {
		editar = new JButton("Editar Artista");
		editar.setBounds(170, 540, 120, 30);
		editar.setForeground(Color.white);
		editar.setBackground(Color.black);
		editar.setBorderPainted(true);
		editar.setActionCommand("editar");
		editar.addActionListener(this);
		editar.setBorder(null);

		frame.add(editar);
	}

	/**
	 * Função btnExcluir exibe um botão para excluir o Artista do banco de dados e
	 * retornar para o frame {@link TelaUsuario}.
	 */

	public void btnExcluir() {
		excluir = new JButton("Excluir Artista");
		excluir.setBounds(680, 540, 120, 30);
		excluir.setForeground(Color.white);
		excluir.setBackground(Color.black);
		excluir.setBorderPainted(true);
		excluir.setActionCommand("excluir");
		excluir.addActionListener(this);
		excluir.setBorder(null);

		frame.add(excluir);
	}

	/**
	 * Função Buscar exibe uma JTextField e um botão para realizar a busca das
	 * músicas do artista.
	 */

	public void Buscar() {
		buscar = new JTextField("");
		buscar.setBounds(500, 35, 222, 30);

		btnBuscar = new JButton("Buscar Música");
		btnBuscar.setBounds(726, 35, 100, 30);
		btnBuscar.setForeground(Color.white);
		btnBuscar.setBackground(new Color(0, 0, 0));
		btnBuscar.setBorderPainted(true);
		btnBuscar.setActionCommand("buscarMusica");
		btnBuscar.addActionListener(this);
		btnBuscar.setBorder(null);

		frame.add(buscar);
		frame.add(btnBuscar);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "voltar") {
			new TelaUsuario(cd, idxUsuario);
			frame.dispose();

		} else if (e.getActionCommand() == "editar") {
			new TelaAdicionarArtista(cd, idxUsuario, idxArtista);
			frame.dispose();

		} else if (e.getActionCommand() == "excluir") {
			boolean verifA = cd.removerArtista(idxArtista);

			if (verifA) {
				JOptionPane.showMessageDialog(null, "Artista excluído com sucesso!");
				new TelaUsuario(cd, idxUsuario);
				frame.dispose();

			} else {
				JOptionPane.showMessageDialog(null, "Erro ao excluir artista!");
				new TelaUsuario(cd, idxUsuario);
				frame.dispose();
			}
			frame.dispose();

		} else if (e.getActionCommand() == "addMusica") {
			new TelaAdicionarMusica(cd, idxArtista, idxUsuario);
			frame.dispose();

		} else if (e.getActionCommand() == "buscarMusica") {
			String nomeArtista = artistaAtual;
			String nomeMusica = buscar.getText();

			int idxMusica = cd.buscarMusica(nomeMusica);
			if (idxMusica == -1) {
				JOptionPane.showMessageDialog(null, "Essa música não está cadastrada!");
			}
			{
				new TelaMusica(cd, idxMusica, idxUsuario, nomeArtista);
				frame.dispose();
			}
		}
	}
}
