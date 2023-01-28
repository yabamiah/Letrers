package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Classe TelaInicial exibe botões para trafegar entre as telas
 * {@link TelaCadastroLogin}.
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 *
 */

public class TelaInicial implements ActionListener {

	private JFrame frame;
	private JButton btnLogin;
	private JButton btnCadastro;

	/**
	 * Contrutor do frame
	 */

	public TelaInicial() {

		frame = new JFrame("Letters");
		frame.setSize(900, 600);

		// botão Login
		btnLogin = new JButton("Entrar");
		btnLogin.setBounds(275, 450, 150, 45);
		btnLogin.setFont(new Font("", Font.PLAIN, 20));
		btnLogin.setBorderPainted(false);
		btnLogin.setForeground(Color.white);
		btnLogin.setBackground(new Color(56, 96, 46));
		btnLogin.setActionCommand("entrar");
		btnLogin.addActionListener(this);

		// botão Cadastro
		btnCadastro = new JButton("Criar conta");
		btnCadastro.setBounds(475, 450, 150, 45);
		btnCadastro.setFont(new Font("", Font.PLAIN, 20));
		btnCadastro.setBorderPainted(false);
		btnCadastro.setForeground(Color.white);
		btnCadastro.setBackground(new Color(56, 96, 46));
		btnCadastro.setActionCommand("registrar");
		btnCadastro.addActionListener(this);

		// Add
		ImagemFundo("imagem/Pagina Inicial.jpg");
		frame.add(btnLogin);
		frame.add(btnCadastro);

		// Edição do frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
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
	 * para os botões do frame.
	 */

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "entrar") {
			TelaCadastroLogin rota = new TelaCadastroLogin(2);
			frame.dispose();
		} else if (e.getActionCommand() == "registrar") {
			TelaCadastroLogin rota = new TelaCadastroLogin(1);
			frame.dispose();
		}
	}
}
