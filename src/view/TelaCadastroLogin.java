package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroLogin implements ActionListener {
	
	private JFrame frame;
	private JLabel tituloCadastro;
	private JLabel insiraUsuario;
	private JTextField usuarioCampo;
	private JButton btnCadastroLogin;
	private JButton voltar;
	
	private int opcao=2;
	
	public TelaCadastroLogin() {
		if(opcao == 1) {
			frame = new JFrame("Cadastro");
			BtnCadastrarLogar(1);
		} else {
			frame = new JFrame("Login");
			BtnCadastrarLogar(2);
		}
		
		frame.setSize(600,600);
		frame.getContentPane().setBackground(new Color(132,70,150));
		
		TituloPagina();
		InfoUsuario();
		btnVoltar();

		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void btnVoltar() {
		voltar = new JButton("Voltar");
		voltar.setActionCommand("voltar");
		voltar.addActionListener(this);
		voltar.setBounds(10,10,70,20);
		
		frame.add(voltar);
	}
	
	public void TituloPagina() {
		if(opcao == 1) {
			tituloCadastro = new JLabel("Cadastro");
			tituloCadastro.setBounds(200,80,200,150); //x,y,larg,alt
		} else {
			tituloCadastro = new JLabel("Login");
			tituloCadastro.setBounds(235,80,200,150); //x,y,larg,alt
		}
		
		tituloCadastro.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(tituloCadastro);
	}
	
	public void InfoUsuario() {
		insiraUsuario = new JLabel("Insira seu nome:");
		insiraUsuario.setBounds(230,240,130,30);
		insiraUsuario.setFont(new Font("", Font.PLAIN,17));
		
		usuarioCampo = new JTextField("");
		usuarioCampo.setBounds(190,280,200,30);
		
		frame.add(insiraUsuario);
		frame.add(usuarioCampo);
	}
	
	public void BtnCadastrarLogar(int opcao) {
		if(opcao == 1) {
			btnCadastroLogin = new JButton("Cadastrar");
			btnCadastroLogin.setActionCommand("cadastrar");
		} else {
			btnCadastroLogin = new JButton("Logar");
			btnCadastroLogin.setActionCommand("logar");
		}
		
		btnCadastroLogin.setBounds(190,375,200,40);
		btnCadastroLogin.addActionListener(this);
		frame.add(btnCadastroLogin);
	}
	
	
	public static void main(String[] args) {
		TelaCadastroLogin tela = new TelaCadastroLogin();
		
    }

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "cadastrar") {
			new TelaUsuario();
		} else if(e.getActionCommand() == "voltar") {
			new TelaInicial();
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
