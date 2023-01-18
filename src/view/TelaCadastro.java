package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro implements ActionListener {

	private JFrame cadastro;
	private JLabel tituloCadastro;
	private JLabel insiraUsuario;
	private JTextField usuarioCampo;
	private JButton btnCadastrar;
	private JButton btnLogin;
	
	public TelaCadastro() {
		
		//Frame
		cadastro = new JFrame("Cadastro");
		cadastro.setSize(600,700);
		
		Color corFundo = new Color(132,70,150);
		cadastro.getContentPane().setBackground( corFundo );
		
		//titulo
		tituloCadastro = new JLabel("Cadastro");
		tituloCadastro.setBounds(400,50,200,150); //x,y,larg,alt
		tituloCadastro.setFont(new Font("Arial", Font.PLAIN, 40));
		
		insiraUsuario = new JLabel("Insira seu nome:");
		insiraUsuario.setBounds(420,220,130,30);
		insiraUsuario.setFont(new Font("", Font.PLAIN,17));
		
		usuarioCampo = new JTextField("");
		usuarioCampo.setBounds(380,260,200,30);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(380,425,200,40);
		btnCadastrar.setActionCommand("cadastrar");
		btnCadastrar.addActionListener(this);
		
		btnLogin = new JButton("Já possuo conta!");
		btnLogin.setBounds(380,475,200,15);
		btnLogin.setForeground(Color.white);
		btnLogin.setBackground(null);
		btnLogin.setOpaque(false);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorderPainted(false);
		btnLogin.setActionCommand("login");
		btnLogin.addActionListener(this);
		
		//add
		cadastro.add(tituloCadastro);
		cadastro.add(insiraUsuario);
		cadastro.add(usuarioCampo);
		cadastro.add(btnCadastrar);
		cadastro.add(btnLogin);
				

		cadastro.setLocationRelativeTo(null);
		cadastro.setLayout(null);
		cadastro.setVisible(true);
		
	}
		
	public static void main(String[] args) {
		TelaCadastro tela = new TelaCadastro();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "cadastrar") {
			new TelaUsuario();
		} else if(e.getActionCommand() == "login") {
			new TelaLogin();
		}	
	}
}
