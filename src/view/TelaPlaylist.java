package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import controle.*;

/**
 * Classe Tela Playlist exibe uma playlist criada e as músicas associadas a ela.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 */

public class TelaPlaylist implements ActionListener {

	// REMOVER
	private String artista = "Lana Del Rey";
	private JList<String> listaMusicas;
	String musicas[] = { "Blue Jeans", "Video Games", "Summertime Sadness", "Born to Die", "Young and Beautiful",
			"Off to the", "Lust for life" };

	private JScrollPane listaMusicasScroll;
	private ControleDados cd;
	private ControleMusica controleM;
	private ControlePlaylist controleP;
	private int idxPlaylist;
	private int idxUsuario;
	private JFrame frame;
	private JLabel nomeAlbumPlaylist = new JLabel();
	private JLabel nomeArtista = new JLabel(artista);
	private JButton voltar;
	private JButton editar = new JButton("Editar");;
	private JButton excluir = new JButton("Excluir");
	private int opcao;

	/**
	 * Construtor do frame.
	 * 
	 * @param opcao
	 * @param cd
	 * @param idxPlaylist
	 * @param idxUsuario
	 */

	public TelaPlaylist(int opcao, ControleDados cd, int idxPlaylist, int idxUsuario) {
		this.cd = cd;
		controleM = new ControleMusica(cd);
		controleP = new ControlePlaylist(cd);
		this.opcao = opcao;
		this.idxPlaylist = idxPlaylist;
		this.idxUsuario = idxUsuario;

		frame.setSize(900, 600);

		nomeAlbumPlaylist.setFont(new Font("Times New Roman", Font.BOLD, 25));
		nomeAlbumPlaylist.setForeground(Color.white);

		ImagemFundo("imagem/Home.png");
		btnVoltar();
		listaMus();
		btnEditar();
		btnExcluir();
		frame.add(nomeAlbumPlaylist);

		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	 * Função areaMusica exibe um JList com as músicas salvas na playlist.
	 */

	public void listaMus() {
		listaMusicas = new JList<String>(controleM.getNomeMusicas());
		listaMusicas.setBounds(192, 135, 500, 325);
		listaMusicas.setFont(new Font("Times New Roman", Font.BOLD, 18));
		listaMusicas.setForeground(Color.black);

		listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaMusicas.setLayoutOrientation(JList.VERTICAL);
		listaMusicas.setVisibleRowCount(-1);

		listaMusicasScroll = new JScrollPane(listaMusicas);
		listaMusicasScroll.setBounds(listaMusicas.getX(), listaMusicas.getY(), listaMusicas.getWidth(),
				listaMusicas.getHeight());
		listaMusicasScroll.setBorder(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(listaMusicasScroll);
	}

	/**
	 * Função btnEditar exibe um botão para abrir o frame {@link TelaCriarPlaylist},
	 * porém para editar a Playlist.
	 */

	public void btnEditar() {
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
	 * Função btnExcluir exibe um botão para excluir a Playlist do banco de dados e
	 * retornar para o frame {@link TelaUsuario}.
	 */

	public void btnExcluir() {
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
			new TelaUsuario(cd, idxUsuario);
			frame.dispose();

		} else if (e.getActionCommand() == "editar") {
			if (opcao == 1) {

			} else {
				new TelaCriarPlaylist(cd, idxPlaylist, opcao, 0);
				frame.dispose();
			}

		} else if (e.getActionCommand() == "excluir") {
			if (opcao == 1) {

			} else {
				boolean verif = cd.removerPlaylist(idxPlaylist);

				if (verif) {
					JOptionPane.showMessageDialog(null, "Playlist excluída com sucesso!");
					new TelaUsuario(cd, idxUsuario);
				}
			}
			frame.dispose();
		}
	}
}
