package views_finalizadas;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TelaCadastroLogin implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel tituloCadastro;
	private JLabel insiraUsuario;
	private JTextField usuarioCampo;
	private JButton btnCadastroLogin;
	private JButton voltar;
	private static int opcao = 1;
	
	public TelaCadastroLogin(int opcao) {
		
		if(opcao == 1)  frame = new JFrame("Cadastro");
		else 			frame = new JFrame("Login");
		
		frame.setSize(500,600);
		
		panel = new JPanel();
		panel.setBounds(75,80,350,350);		
		panel.setBackground(new Color(121,150,71));
		
		ImagemFundo("/imagem/Cadastro-Login.png");
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
	
	public void btnVoltar() {
		voltar = new JButton("Voltar");
		voltar.setBounds(10,10,70,20);
		voltar.setBorderPainted(true);
		voltar.setForeground(Color.white);
		voltar.setBackground(new Color(0,0,0));
		
		voltar.setActionCommand("voltar");
		voltar.addActionListener(this);
		
		frame.add(voltar);
	}
	
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
			
		}catch(IOException err) {
			err.printStackTrace();
		}
	}
	
	public void TituloPagina(int opcao) {
		if(opcao == 1) {
			tituloCadastro = new JLabel("Cadastro");
			tituloCadastro.setBounds(170,60,200,150); //x,y,larg,alt
		} else {
			tituloCadastro = new JLabel("Login");
			tituloCadastro.setBounds(202,60,200,150); //x,y,larg,alt
		}
		
		tituloCadastro.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(tituloCadastro);
	}
	
	public void InfoUsuario() {
		insiraUsuario = new JLabel("Insira seu nome:");
		insiraUsuario.setBounds(190,205,130,30);
		insiraUsuario.setFont(new Font("", Font.PLAIN,17));
		
		usuarioCampo = new JTextField("");
		usuarioCampo.setBounds(150,250,200,30);
		
		frame.add(insiraUsuario);
		frame.add(usuarioCampo);
	}
	
	public void BtnCadastrarLogar(int opcao) {
		if(opcao == 1) {
			btnCadastroLogin = new JButton("Cadastrar");
			btnCadastroLogin.setActionCommand("cadastrar");
		} else {
			btnCadastroLogin = new JButton("Entrar");
			btnCadastroLogin.setActionCommand("logar");
		}
		
		btnCadastroLogin.setBounds(150,350,200,40);
		btnCadastroLogin.setForeground(Color.white);
		btnCadastroLogin.setBackground(new Color(0,0,0));
		btnCadastroLogin.addActionListener(this);
		frame.add(btnCadastroLogin);
	}
	
	public static void main(String[] args) {
		TelaCadastroLogin tela = new TelaCadastroLogin(opcao);
    }

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "cadastrar") {
			new TelaUsuario();
			frame.dispose();
		} else if(e.getActionCommand() == "logar") {
			new TelaUsuario();
			frame.dispose();
		} else if(e.getActionCommand() == "voltar") {
			new TelaInicial();
			frame.dispose();
		}	
	}
}

//btnLogin.setForeground(Color.white);
		//btnLogin.setBackground(null);
		//btnLogin.setOpaque(false);
		//btnLogin.setContentAreaFilled(false);
		//btnLogin.setBorderPainted(false);
		//btnLogin.setActionCommand("login");
		//btnLogin.addActionListener(this);
