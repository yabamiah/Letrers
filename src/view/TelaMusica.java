package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMusica implements ActionListener{
	
	private JFrame frame;
	private JLabel nomeMusica;
	private JLabel nomeArtista;
	private JLabel labelLetra;
	private JTextArea textoLetra;
	private JLabel labelTraducao;
	private JTextArea textoTraducao;
	private JButton voltar;
	private JButton excluir;
	private JButton editar;
	
	public void TelaMusica() {
		frame = new JFrame();
		frame.setSize(900,700);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(132,70,150));
		frame.setLayout(new FlowLayout());
		
		infoMusica();
		Letra();
		Traducao();
		btnVoltar();
		btnEditar();
		btnExcluir();
		
		frame.setVisible(true);
	}
	
	public void infoMusica() {
		nomeMusica = new JLabel("champagne problems");
		nomeArtista = new JLabel("Taylor Swift");
		
		frame.add(nomeMusica);
		frame.add(nomeArtista);
	}
	
	public void Letra() {
		labelLetra = new JLabel("Letra Original");
		textoLetra = new JTextArea("                  ");
		
		frame.add(labelLetra);
		frame.add(textoLetra);
	}
	
	public void Traducao() {
		labelTraducao = new JLabel("Tradução");
		textoTraducao = new JTextArea("                  ");
		
		frame.add(labelTraducao);
		frame.add(textoTraducao);
	}	
	
	public void btnVoltar(){
		voltar = new JButton("Voltar");
		voltar.setActionCommand("voltar");
		voltar.addActionListener(this);
		
		frame.add(voltar);
	}
	
	public void btnEditar() {
		editar = new JButton("Editar Música");
		
		frame.add(editar);
	}
	
	public void btnExcluir() {
		excluir = new JButton("Excluir Música");
	
		frame.add(excluir);
	}
	
	public static void main(String[] args) {
		TelaMusica tela = new TelaMusica(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "voltar") {
			new TelaUsuario();//alterar para voltar para a playlist
		//album ou o outro local para onde veio
		}
	}

}
