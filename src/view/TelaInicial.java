package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial implements ActionListener {

	private JFrame inicio;
	private JLabel titulo;
	private JButton btnLogin;
	private JButton btnCadastro;
	
	public TelaInicial() {
		
		inicio = new JFrame("Letrers");
		inicio.setSize(1000,700);
		Color corFundo = new Color(132,70,150);
		inicio.getContentPane().setBackground( corFundo );
		
		titulo = new JLabel("LeTrErS");
		titulo.setBounds(375,160,250,150);
		titulo.setFont(new Font("", Font.PLAIN,65));
		
		btnLogin = new JButton("Entrar");
		btnLogin.setBounds(425,350,150,45);
		btnLogin.setFont(new Font("",Font.PLAIN,20));
		btnLogin.setBorderPainted(false);
		btnLogin.setForeground(Color.white);
		btnLogin.setBackground(new Color(56,96,46));
		
		btnLogin.setActionCommand("entrar");
		btnLogin.addActionListener(this);
		
		btnCadastro = new JButton("Criar conta");
		btnCadastro.setBounds(425,440,150,45);
		btnCadastro.setFont(new Font("",Font.PLAIN,20));
		btnCadastro.setBorderPainted(false);
		btnCadastro.setForeground(Color.white);
		btnCadastro.setBackground(new Color(56,96,46));
		
		btnCadastro.setActionCommand("registrar");
		btnCadastro.addActionListener(this);
		
		inicio.add(titulo);
		inicio.add(btnLogin);
		inicio.add(btnCadastro);
		
		inicio.setLocationRelativeTo(null);
		inicio.setLayout(null);
		inicio.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaInicial tela = new TelaInicial();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "entrar") {
			new TelaLogin();
		}
		else if(e.getActionCommand() == "registrar") {
			new TelaCadastro();
		}
	}
	
}
