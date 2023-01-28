package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controle.*;

/**
 * Classe TelaAdicionarArtista exibe um TextField para que o usuário adicione um
 * artista.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 *
 */

public class TelaAdicionarArtista implements ActionListener {

	private JFrame frame;
	private JLabel titulo;
	private JLabel labelArtista;
	private JTextArea artista;
	private JButton criar;
	private JButton cancelar;
	private ControleDados cd;
	private int idxUsuario;

	/**
	 * Construtor um do frame. Foi colocado mais de um para possibilitar a entrada
	 * na tela com diferentes argumentos.
	 * 
	 * @param cd
	 * @param idxUsuario
	 * @param idxArtista
	 */

	public TelaAdicionarArtista(ControleDados cd, int idxUsuario, int idxArtista) {
		this.cd = cd;
		this.idxUsuario = idxUsuario;
		cd.removerArtista(idxArtista);

		frame = new JFrame("Letters");
		frame.setSize(600, 300);
		frame.getContentPane().setBackground(new Color(121, 150, 71));

		titulo = new JLabel("Adicionar Artista");
		titulo.setBounds(180, 30, 300, 30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		titulo.setForeground(Color.black);

		frame.add(titulo);
		artista();
		btnCriar();
		btnCancelar();

		frame.setResizable(false);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/**
	 * Construtor dois do frame. Foi colocado mais de um para possibilitar a entrada
	 * na tela com diferentes argumentos.
	 * 
	 * @param cd
	 * @param idxUsuario
	 */

	public TelaAdicionarArtista(ControleDados cd, int idxUsuario) {
		this.cd = cd;
		this.idxUsuario = idxUsuario;

		frame = new JFrame("Letters");
		frame.setSize(600, 300);
		frame.getContentPane().setBackground(new Color(121, 150, 71));

		titulo = new JLabel("Adicionar Artista");
		titulo.setBounds(180, 30, 300, 30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		titulo.setForeground(Color.black);

		frame.add(titulo);
		artista();
		btnCriar();
		btnCancelar();

		frame.setResizable(false);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/**
	 * Função que exibe o JLabel e o JTextArea para inserir as informações do
	 * artista.
	 */

	public void artista() {
		labelArtista = new JLabel("Insira o nome do artista:");
		labelArtista.setBounds(192, 90, 200, 30);
		labelArtista.setForeground(Color.black);

		artista = new JTextArea();
		artista.setBounds(192, 120, 200, 25);

		frame.add(labelArtista);
		frame.add(artista);
	}

	/**
	 * Função do botão criar, que implementa a função criar um usuário.
	 */

	public void btnCriar() {
		criar = new JButton("Adicionar");
		criar.setBounds(314, 190, 170, 40);
		criar.setBackground(new Color(0, 0, 0));
		criar.setForeground(Color.white);
		criar.setActionCommand("criar");
		criar.addActionListener(this);
		criar.setBorder(null);

		frame.add(criar);
	}

	/**
	 * Função do botão canccelar, que cancela a operação criar um usuario e volta
	 * para a {@link TelaUsuario}.
	 */

	public void btnCancelar() {
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(100, 190, 170, 40);
		cancelar.setBackground(new Color(155, 0, 0));
		cancelar.setForeground(Color.white);
		cancelar.setActionCommand("cancelar");
		cancelar.addActionListener(this);
		cancelar.setBorder(null);

		frame.add(cancelar);
	}

	/**
	 * Método da interface ActionListener que implementa as funções estabelecidas
	 * para os botões.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "criar") {
			String nomeArtista = artista.getText();

			boolean verif = cd.adicionarArtista(nomeArtista, null, null);

			int idxArtista = cd.buscarArtista(nomeArtista);

			if (verif) {
				new TelaArtista(cd, idxArtista, idxUsuario);
				frame.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Artista já existe!");
			}

			frame.dispose();

		} else if (e.getActionCommand() == "cancelar") {
			new TelaUsuario(cd, idxUsuario);
			frame.dispose();
		}
	}
}
