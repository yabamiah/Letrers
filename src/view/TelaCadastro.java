package view;

import javax.swing.*;
import java.awt.*;

public class TelaCadastro {

	private JFrame cadastro;
	private JLabel tituloCadastro;
	private JLabel insiraUsuario;
	private JTextField usuarioCampo;
	private JLabel nomeTipoDeUsuario;
	private JLabel nomeTipoArtista;
	private JLabel nomeTipoUsuarioComum;
	private JCheckBox checkArtista;
	private JCheckBox checkUsuario;
	private JButton btnCadastrar;
	private JButton btnLogin;
	
	public TelaCadastro() {
		
		//Frame
		cadastro = new JFrame("Cadastro");
		cadastro.setBounds(250,0,900,700);
		
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
		
		nomeTipoDeUsuario = new JLabel("Você é:");
		nomeTipoDeUsuario.setBounds(455,320,100,20);
		
		nomeTipoArtista = new JLabel("Artista");
		nomeTipoArtista.setBounds(400,340,100,20);
		
		checkArtista = new JCheckBox();
		checkArtista.setBounds(410,360,15,15);
		
		nomeTipoUsuarioComum = new JLabel("Usuário");
		nomeTipoUsuarioComum.setBounds(515,340,100,20);
		
		checkUsuario = new JCheckBox();
		checkUsuario.setBounds(525,360,15,15);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(380,425,200,40);
		
		btnLogin = new JButton("Já possuo conta!");
		btnLogin.setBounds(380,475,200,15);
		btnLogin.setForeground(Color.white);
		btnLogin.setBackground(null);
		btnLogin.setOpaque(false);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorderPainted(false);
		
		//add
		cadastro.add(tituloCadastro);
		cadastro.add(insiraUsuario);
		cadastro.add(usuarioCampo);
		cadastro.add(nomeTipoDeUsuario);
		cadastro.add(nomeTipoArtista);
		cadastro.add(checkArtista);
		cadastro.add(nomeTipoUsuarioComum);
		cadastro.add(checkUsuario);
		cadastro.add(btnCadastrar);
		cadastro.add(btnLogin);
				
		cadastro.setLayout(null);
		cadastro.setVisible(true);
		
	}
		
	public static void main(String[] args) {
		TelaCadastro tela = new TelaCadastro();
    }
}
