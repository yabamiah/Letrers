package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.*;
import controle.*;

/**
 * Classe TelaAdicionarMusica exibe um pequeno formulário para adicionar uma
 * música.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 *
 */

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
	private ControleDados controleDados;
	private ControleArtista controleArtista;
	private int idxArtista;
	private int idxUsuario;

	/**
	 * Construtor um do frame. Foi colocado mais de um para possibilitar a entrada
	 * na tela com diferentes argumentos.
	 * 
	 * @param cd
	 * @param idxArtista
	 * @param idxUsuario
	 */

	public TelaAdicionarMusica(ControleDados cd, int idxArtista, int idxUsuario) {
		controleDados = cd;

		controleArtista = new ControleArtista(cd);
		this.idxArtista = idxArtista;
		this.idxUsuario = idxUsuario;

		frame = new JFrame("Letters");
		frame.setSize(900, 600);
		frame.getContentPane().setBackground(new Color(121, 150, 71));

		titulo = new JLabel("Adicionar Música");
		titulo.setBounds(290, 30, 400, 30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 40));
		titulo.setForeground(Color.white);

		frame.add(titulo);
		
		musica = new JTextField();
		musica();
		artista();
		letra = new JTextArea(5, 10);
		letra();
		traducao = new JTextArea(5, 10);
		traducao();
		btnCriar();
		btnCancelar();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	/**
	 * Contrutor dois do frame. Foi colocado mais de um para possibilitar a entrada
	 * na tela com diferentes argumentos.
	 * 
	 * @param cd
	 * @param idxArtista
	 * @param idxMusica
	 * @param editar
	 */

	public TelaAdicionarMusica(ControleDados cd, int idxArtista, int idxMusica, int editar) {
		controleDados = cd;

		this.idxArtista = idxArtista;
		String nomeAntigo = cd.getMusicas().get(idxMusica).getNome();
		String letraAntiga = cd.getMusicas().get(idxMusica).getLetras().getCorpoOriginal();
		String traducaoAntiga = cd.getMusicas().get(idxMusica).getLetras().getCorpoTraduzido();
		cd.removerMusica(idxMusica);
		controleArtista = new ControleArtista(cd);

		frame = new JFrame("Letters");
		frame.setSize(900, 600);
		frame.getContentPane().setBackground(new Color(121, 150, 71));

		titulo = new JLabel("Adicionar Música");
		titulo.setBounds(290, 30, 400, 30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 40));
		titulo.setForeground(Color.white);

		frame.add(titulo);
		musica = new JTextField(nomeAntigo);
		musica();
		artista();
		letra = new JTextArea(letraAntiga);
		letra();
		traducao = new JTextArea(traducaoAntiga);
		traducao();
		btnCriar();
		btnCancelar();

		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	/**
	 * Função musica exibe um JLabel e um JTextField relacionados ao nome da música
	 * no frame.
	 */

	public void musica() {
		nomeMusica = new JLabel("Nome da Música");
		nomeMusica.setBounds(70, 112, 120, 20);
		nomeMusica.setForeground(Color.black);
	
		musica.setBounds(70, 135, 250, 25);

		frame.add(musica);
		frame.add(nomeMusica);
	}

	/**
	 * Função artista exibe um JLabel, JComboBox para selecionar o artista a que
	 * corresponde a música.
	 */

	public void artista() {
		nomeArtista = new JLabel("Selecionar artista:");
		nomeArtista.setBounds(350, 112, 120, 20);
		nomeArtista.setForeground(Color.black);

		listaArtista = new JComboBox<String>(controleArtista.getNomeArtistas());
		listaArtista.setBounds(350, 135, 250, 25);
		listaArtista.setBackground(Color.white);
		listaArtista.setForeground(Color.black);

		frame.add(nomeArtista);
		frame.add(listaArtista);
	}

	/**
	 * Função letra exibe um JLabel e um JTextAreaa para inserir a letra original da
	 * música.
	 */

	public void letra() {
		nomeLetra = new JLabel("Insira a Letra Original:");
		nomeLetra.setForeground(Color.black);
		nomeLetra.setBounds(70, 175, 200, 20);

		letra.setBounds(70, 200, 250, 300);

		frame.add(nomeLetra);
		frame.add(letra);
	}

	/**
	 * Função tradução exibe um JLabel e um JTextAreaa para inserir a tradução da
	 * música.
	 */

	public void traducao() {
		nomeTraducao = new JLabel("Insira a Tradução da Música:");
		nomeTraducao.setForeground(Color.black);
		nomeTraducao.setBounds(350, 175, 200, 20);

		traducao.setBounds(350, 200, 250, 300);

		frame.add(nomeTraducao);
		frame.add(traducao);
	}

	/**
	 * Função btnCriar exibe um botão para adicionar a música ao banco de dados.
	 */

	public void btnCriar() {
		criar = new JButton("Adicionar");
		criar.setBounds(650, 400, 170, 40);
		criar.setBackground(new Color(0, 0, 0));
		criar.setForeground(Color.white);
		criar.setBorder(null);
		criar.setActionCommand("adicionar");
		criar.addActionListener(this);

		frame.add(criar);
	}

	/**
	 * Função btnCancelar exibe um botão para cancelar a operação de adicionar a
	 * música.
	 */

	public void btnCancelar() {
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(650, 450, 170, 40);
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
		if (e.getActionCommand() == "adicionar") {
			String nomeMusica = musica.getText();
			String nomeArtista = (String) listaArtista.getSelectedItem();
			String letraOriginal = letra.getText();
			String letraTraducao = traducao.getText();
			LetraDeMusica letraMusica = new LetraDeMusica(letraOriginal, letraTraducao);

			boolean verif = controleDados.adicionarMusica(nomeMusica, null, letraMusica);
			int idxMusica = controleDados.buscarMusica(nomeMusica);

			if (verif) {
				new TelaMusica(controleDados, idxMusica, idxUsuario, nomeArtista);
				frame.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Música já cadastrada!");
			}

		} else if (e.getActionCommand() == "cancelar") {
			new TelaArtista(controleDados, idxArtista, idxUsuario);
			frame.dispose();
		}
	}
}
