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
 * Classe TelaCadastroLogin exibe um pequeno formulário para adicionar um
 * usuário.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 */

public class TelaCadastroLogin implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JLabel tituloCadastro;
	private JLabel insiraUsuario;
	private JTextField usuarioCampo;
	private JButton btnCadastroLogin;
	private JButton voltar;
	private static int opcao = 1;
	private controle.ControleDados cd;

	/**
	 * Construtor do frame.
	 * 
	 * @param opcao
	 */

	public TelaCadastroLogin(int opcao) {

		if (opcao == 1)
			frame = new JFrame("Cadastro");
		else
			frame = new JFrame("Login");

		frame.setSize(500, 600);

		panel = new JPanel();
		panel.setBounds(75, 80, 350, 350);
		panel.setBackground(new Color(121, 150, 71));

		ImagemFundo("imagem/Cadastro-Login.png");
		TituloPagina(opcao);
		InfoUsuario();
		btnVoltar();
		BtnCadastrarLogar(opcao);
		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
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

		voltar.setActionCommand("voltar");
		voltar.addActionListener(this);

		frame.add(voltar);
	}

	/**
	 * Função TituloPagina exibe o titulo da página a depender da operação
	 * solicitada(Cadastro ou Login).
	 * 
	 * @param opcao
	 */

	public void TituloPagina(int opcao) {
		if (opcao == 1) {
			tituloCadastro = new JLabel("Cadastro");
			tituloCadastro.setBounds(170, 60, 200, 150);
		} else {
			tituloCadastro = new JLabel("Login");
			tituloCadastro.setBounds(202, 60, 200, 150);
		}

		tituloCadastro.setFont(new Font("Times New Roman", Font.BOLD, 40));
		tituloCadastro.setForeground(Color.white);
		frame.add(tituloCadastro);
	}

	/**
	 * Função InfoUsuario exibe um JLabel e um JTextField para o usuário inserir seu
	 * nome.
	 */

	public void InfoUsuario() {
		insiraUsuario = new JLabel("Insira seu nome:");
		insiraUsuario.setBounds(190, 205, 200, 30);
		insiraUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		insiraUsuario.setForeground(Color.white);

		usuarioCampo = new JTextField("");
		usuarioCampo.setBounds(150, 250, 200, 30);

		frame.add(insiraUsuario);
		frame.add(usuarioCampo);
	}

	/**
	 * Função BtnCadastrarLogar exibe o botão que realiza o cadastro ou login, a
	 * depender da operação solicitada.
	 * 
	 * @param opcao
	 */

	public void BtnCadastrarLogar(int opcao) {
		if (opcao == 1) {
			btnCadastroLogin = new JButton("Cadastrar");
			btnCadastroLogin.setActionCommand("cadastrar");
		} else {
			btnCadastroLogin = new JButton("Entrar");
			btnCadastroLogin.setActionCommand("logar");
		}

		btnCadastroLogin.setBounds(150, 350, 200, 40);
		btnCadastroLogin.setForeground(Color.white);
		btnCadastroLogin.setBackground(new Color(0, 0, 0));
		btnCadastroLogin.addActionListener(this);
		frame.add(btnCadastroLogin);
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
	 * Método da interface ActionListener que implementa as funções estabelecidas.
	 * para os botões do frame
	 */

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "cadastrar") {
			String nome = usuarioCampo.getText();
			cd = new ControleDados();
			boolean verif = cd.adicionarUsuario(nome, null);
			int idx = cd.BuscarUsuario(nome);

			if (verif) {
				new TelaUsuario(cd, idx);
				frame.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
			}
		} else if (e.getActionCommand() == "logar") {
				String nome = usuarioCampo.getText();
				cd = new ControleDados();
				int idxUsuario = cd.BuscarUsuario(nome);
	
				new TelaUsuario(cd, idxUsuario);
				frame.dispose();
				
		} else if (e.getActionCommand() == "voltar") {
			new TelaInicial();
			frame.dispose();
		}
	}
}