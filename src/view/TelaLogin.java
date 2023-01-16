package view;

import javax.swing.*;
import java.awt.*;

public class TelaLogin {

	private JFrame login;
	private JLabel tituloLogin;
	private JLabel insiraUsuario;
	private JTextField usuarioCampo;
	private JButton btnLogar;
	private JButton btnCadastro;
	
	public TelaLogin() {
		
		//Frame
		login = new JFrame("Login");
		login.setBounds(200,0,1000,700);
		
		Color corFundo = new Color(132,70,150);
		login.getContentPane().setBackground( corFundo );
		
		//titulo
		tituloLogin = new JLabel("Login");
		tituloLogin.setBounds(430,50,200,150); //x,y,larg,alt
		tituloLogin.setFont(new Font("Arial", 20, 40));
		
		insiraUsuario = new JLabel("Insira seu nome:");
		insiraUsuario.setBounds(420,230,150,40);
		insiraUsuario.setFont(new Font("", 10,18));
		
		usuarioCampo = new JTextField("");
		usuarioCampo.setBounds(360,275,250,50);
		
		btnLogar = new JButton("Logar");
		btnLogar.setBounds(360,395,250,50);
		
		btnCadastro = new JButton("Ainda não possuo conta!");
		btnCadastro.setBounds(380,455,200,15);
		btnCadastro.setForeground(Color.white);
		btnCadastro.setBackground(null);
		btnCadastro.setOpaque(false);
		btnCadastro.setContentAreaFilled(false);
		btnCadastro.setBorderPainted(false);
		
		//add
		login.add(tituloLogin);
		login.add(insiraUsuario);
		login.add(usuarioCampo);
		login.add(btnLogar);
		login.add(btnCadastro);
				
		login.setLayout(null);
		login.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaLogin tela = new TelaLogin();
		
	}
}
