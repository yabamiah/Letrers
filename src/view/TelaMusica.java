package view;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import controle.*;
import modelo.*;

/**
 * Classe TelaMusica exibe as informações da música, a letra e a tradução.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 *
 */

public class TelaMusica implements ActionListener {

	private JFrame frame;
	private JLabel nomeMusica;
	private JLabel nomeArtista;
	private JLabel labelLetra;
	private JTextArea textoLetra;
	private JLabel labelTraducao;
	private JTextArea textoTraducao;
	private JButton voltar;
	private JButton excluir;
	private JButton editar;
	private JScrollPane textoLetraScroll;
	private JScrollPane textoTraducaoScroll;
	private ControleDados cd;
	private ControleMusica controleM;
	private ControleArtista controleA;
	private ControleLetra controleL;
	private int idxMusica;
	private int idxUsuario;
	private String artista;
	private int idxArtista;
	private String letra;
	private String traducao;
	private String musicaNome;
	private String letraOriginal;
	private String letraTraduzido;

	/**
	 * Contrutor do frame.
	 * 
	 * @param cd
	 * @param idxMusica
	 * @param idxUsuario
	 * @param nomeArtista
	 */

	public TelaMusica(ControleDados cd, int idxMusica, int idxUsuario, int idxArtista) {
		this.cd = cd;
		this.idxArtista = idxArtista;
		
		controleA = new ControleArtista(cd);

		musicaNome = cd.getArtistas().get(idxArtista).getMusicas().get(idxMusica).getNome();
		letraOriginal = cd.getArtistas().get(idxArtista).getMusicas().get(idxMusica).getLetras().getCorpoOriginal();
		letraTraduzido = cd.getArtistas().get(idxArtista).getMusicas().get(idxMusica).getLetras().getCorpoTraduzido();
		
		controleL = new ControleLetra(cd);

		this.idxMusica = idxMusica;
		this.idxUsuario = idxUsuario;

		frame = new JFrame("Letters - " + musicaNome);
		frame.setSize(900, 600);

		ImagemFundo("imagem/Home.png");
		infoMusica();
		Letra();
		Traducao();
		btnVoltar();
		btnEditar();
		btnExcluir();

		frame.setResizable(false);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/**
	 * Função infoMusica exibe informações a cerca da música e do artista.
	 */

	public void infoMusica() {
		nomeMusica = new JLabel(musicaNome);
		nomeMusica.setBounds(193, 20, 300, 50);
		nomeMusica.setFont(new Font("Times New Roman", Font.BOLD, 25));
		nomeMusica.setForeground(Color.white);

		nomeArtista = new JLabel(cd.getArtistas().get(idxArtista).getNome());
		nomeArtista.setBounds(193, 50, 300, 50);
		nomeArtista.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		nomeArtista.setForeground(Color.white);

		frame.add(nomeMusica);
		frame.add(nomeArtista);
	}

	/**
	 * Função Letra reune informações a cerca da letra e a exibe através de um
	 * JTextArea.
	 */

	public void Letra() {
		labelLetra = new JLabel("Letra Original:");
		labelLetra.setBounds(80, -65, 350, 350);
		labelLetra.setForeground(Color.white);
		labelLetra.setFont(new Font("Times New Roman", Font.BOLD, 17));

		textoLetra = new JTextArea(letraOriginal);
		textoLetra.setBounds(80, 130, 350, 350);
		textoLetra.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textoLetra.setLineWrap(true);
		textoLetra.setEditable(false);
		textoLetra.setBackground(new Color(54, 74, 20));
		textoLetra.setForeground(Color.white);

		textoLetraScroll = new JScrollPane(textoLetra);
		textoLetraScroll.setBounds(textoLetra.getX(), textoLetra.getY(), textoLetra.getWidth(), textoLetra.getHeight());
		textoLetraScroll.setBorder(null);

		frame.add(labelLetra);
		frame.add(textoLetraScroll);
	}

	/**
	 * Função Traducao reune informações a cerca da tradução e a exibe através de um
	 * JTextArea.
	 */

	public void Traducao() {
		labelTraducao = new JLabel("Tradução:");
		labelTraducao.setBounds(470, -65, 350, 350);
		labelTraducao.setForeground(Color.white);
		labelTraducao.setFont(new Font("Times New Roman", Font.BOLD, 17));

		textoTraducao = new JTextArea(letraTraduzido);
		textoTraducao.setBounds(470, 130, 350, 350);
		textoTraducao.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textoTraducao.setLineWrap(true);
		textoTraducao.setEditable(false);
		textoTraducao.setBackground(new Color(54, 74, 20));
		textoTraducao.setForeground(Color.white);

		textoTraducaoScroll = new JScrollPane(textoTraducao);
		textoTraducaoScroll.setBounds(textoTraducao.getX(), textoTraducao.getY(), textoTraducao.getWidth(),
				textoTraducao.getHeight());
		textoTraducaoScroll.setBorder(null);

		frame.add(labelTraducao);
		frame.add(textoTraducaoScroll);
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
	 * Função btnEditar exibe um botão para abrir o frame
	 * {@link TelaAdicionarMusica}, porém para editar a Música.
	 */

	public void btnEditar() {
		editar = new JButton("Editar Música");
		editar.setBounds(100, 540, 120, 30);
		editar.setForeground(Color.white);
		editar.setBackground(Color.black);
		editar.setBorderPainted(true);
		editar.setActionCommand("editar");
		editar.addActionListener(this);
		editar.setBorder(null);

		frame.add(editar);
	}

	/**
	 * Função btnExcluir exibe um botão para excluir a música e as letras do banco
	 * de dados e retornar para o frame {@link TelaUsuario}.
	 */

	public void btnExcluir() {
		excluir = new JButton("Excluir Música");
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
			new TelaArtista(cd, idxArtista, idxUsuario, idxMusica);			
			frame.dispose();

		} else if (e.getActionCommand() == "editar") {
			new TelaAdicionarMusica(cd, idxArtista, idxMusica, 0);
			frame.dispose();

		} else if (e.getActionCommand() == "excluir") {
			boolean verif = cd.removerMusica(idxMusica, idxArtista);

			if (verif) {
				JOptionPane.showMessageDialog(null, "Música excluída com sucesso!");
				new TelaArtista(cd, idxArtista, idxUsuario);
				frame.dispose();
			}

			if (verif) {
				JOptionPane.showMessageDialog(null, "Música excluída com sucesso!");
				new TelaArtista(cd, idxArtista, idxUsuario);
				frame.dispose();
			}
		}
	}
}