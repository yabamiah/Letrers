package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaMaisOpcoes implements ActionListener {
	
	private JFrame frame;
	private JButton voltar;
	private JButton addArtista;
	private JButton addMusica;
	private JButton excluirArtista;
	private JButton excluirMusica;
	
	public TelaMaisOpcoes() {
		frame = new JFrame("Letters");
		frame.getContentPane().setBackground(new Color(121,150,71));
		frame.setSize(600,300);
		
		btnVoltar();
		btnAddMusica();
		btnAddArtista();
		btnExcluirMusica();
		btnExcluirArtista();
		
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void btnAddMusica() {
		addMusica = new JButton("Adicionar Música");
		addMusica.setBounds(100,70,150,50);
		addMusica.setForeground(Color.white);
		addMusica.setBackground(new Color(0,0,0));
		
		frame.add(addMusica);
	}
	
	public void btnAddArtista() {
		addArtista = new JButton("Adicionar Artista");
		addArtista.setBounds(334,70,150,50);
		addArtista.setForeground(Color.white);
		addArtista.setBackground(new Color(0,0,0));
		
		frame.add(addArtista);
	}
	
	public void btnExcluirMusica() {
		excluirMusica = new JButton("Excluir Música");
		excluirMusica.setBounds(100,150,150,50);
		excluirMusica.setForeground(Color.white);
		excluirMusica.setBackground(new Color(155,0,0));
		
		frame.add(excluirMusica);
	}
	
	public void btnExcluirArtista() {
		excluirArtista = new JButton("Excluir Artista");
		excluirArtista.setBounds(334,150,150,50);
		excluirArtista.setForeground(Color.white);
		excluirArtista.setBackground(new Color(155,0,0));
		
		frame.add(excluirArtista);
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
	
	public static void main(String[] args) {
		new TelaMaisOpcoes();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "voltar") {
			new TelaUsuario();
			frame.dispose();
		}
		
	}
}
