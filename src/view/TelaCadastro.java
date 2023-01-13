package view;

import javax.swing.*;

public class TelaCadastro {

	public TelaCadastro() {
		
		JFrame cadastro = new JFrame("Cadastro");
		cadastro.setSize(800,500);
		
		//Cadastro
		JLabel tituloCadastro = new JLabel("Cadastro");
		JLabel nomeUsuario = new JLabel("Adicione um nome:"); ///fica no meio
		JTextField fieldNome = new JTextField("");			 ///fica no meio
		JButton usuarioBtn = new JButton("Usuário");
		JButton artistaBtn = new JButton("Artista");
		
		//x,y,largura, altura
		tituloCadastro.setBounds(175,10,500,100);
		nomeUsuario.setBounds(362,92,500,100);		///fica no meio
		fieldNome.setBounds(362,154,110,25);		///fica no meio
		usuarioBtn.setBounds(100,200,100,50);
		artistaBtn.setBounds(250,200,100,50);
		
		cadastro.add(tituloCadastro);
		cadastro.add(nomeUsuario);
		cadastro.add(fieldNome);
		cadastro.add(usuarioBtn);
		cadastro.add(artistaBtn);
		
		//Login
		JLabel tituloLogin = new JLabel("Login");
		JButton entrarBtn = new JButton("Entrar");
		
		tituloLogin.setBounds(475,10,500,100);
		entrarBtn.setBounds(475,200,100,50);
		
		cadastro.add(tituloLogin);
		cadastro.add(entrarBtn);
		
		cadastro.setLayout(null);
		cadastro.setVisible(true);
		
	}

	public static void main(String[] args) {
		TelaCadastro tela = new TelaCadastro();
    }
}
