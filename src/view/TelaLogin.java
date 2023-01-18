package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin implements ActionListener {

	private JFrame login;
	private JLabel tituloLogin;
	private JLabel insiraUsuario;
	private JTextField usuarioCampo;
	private JButton btnLogar;
	private JButton btnCadastro;
	private JButton voltar;
	
	public TelaLogin() {
		
		//Frame
		login = new JFrame("Login");
		login.setSize(600,700);
		
		Color corFundo = new Color(132,70,150);
		login.getContentPane().setBackground( corFundo );
		
		//titulo
		tituloLogin = new JLabel("Login");
		tituloLogin.setBounds(245,50,200,150); //x,y,larg,alt
		tituloLogin.setFont(new Font("Arial", Font.PLAIN, 40));
		
		insiraUsuario = new JLabel("Insira seu nome:");
		insiraUsuario.setBounds(210,230,150,40);
		insiraUsuario.setFont(new Font("", Font.PLAIN,18));
		
		usuarioCampo = new JTextField("");
		usuarioCampo.setBounds(180,275,250,50);
		
		btnLogar = new JButton("Logar");
		btnLogar.setBounds(180,395,250,50);
		
		btnLogar.setActionCommand("logar");
		btnLogar.addActionListener(this);
		
		btnCadastro = new JButton("Ainda não possuo conta!");
		btnCadastro.setBounds(190,455,200,15);
		btnCadastro.setForeground(Color.white);
		btnCadastro.setBackground(null);
		btnCadastro.setOpaque(false);
		btnCadastro.setContentAreaFilled(false);
		btnCadastro.setBorderPainted(false);
		
		btnCadastro.setActionCommand("cadastrar");
		btnCadastro.addActionListener(this);
		
		btnVoltar();
		
		//add
		login.add(tituloLogin);
		login.add(insiraUsuario);
		login.add(usuarioCampo);
		login.add(btnLogar);
		login.add(btnCadastro);
		
		
		login.setLocationRelativeTo(null);
		login.setLayout(null);
		login.setVisible(true);
	}
	
	public void btnVoltar(){
		voltar = new JButton("Voltar");
		voltar.setBounds(10,10,70,20);
		voltar.setActionCommand("voltar");
		voltar.addActionListener(this);
		
		login.add(voltar);
	}
	
	public static void main(String[] args) {
		TelaLogin tela = new TelaLogin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "logar") {
			new TelaUsuario();
		} else if(e.getActionCommand() == "cadastrar") {
			new TelaCadastro();
		} else if(e.getActionCommand() == "voltar") {
			new TelaInicial();
		}
		
	}
}
