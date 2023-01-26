package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controle.*;

public class TelaAdicionarArtista implements ActionListener {
	
	private JFrame frame;
	private JLabel titulo;
	private JLabel labelArtista;
	private JTextArea artista;
	private JButton criar;
	private JButton cancelar;
	private ControleDados cd;
	
	public TelaAdicionarArtista() {
		frame = new JFrame("Letters");
		frame.setSize(600,300);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(121,150,71));
		
		titulo = new JLabel("Adicionar Artista");
		titulo.setBounds(180,30,300,30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		titulo.setForeground(Color.black);
		
		frame.add(titulo);
		artista();
		btnCriar();
		btnCancelar();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public TelaAdicionarArtista(ControleDados cd) {
		this.cd = cd;

		frame = new JFrame("Letters");
		frame.setSize(600,300);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(121,150,71));
		
		titulo = new JLabel("Adicionar Artista");
		titulo.setBounds(180,30,300,30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		titulo.setForeground(Color.black);
		
		frame.add(titulo);
		artista();
		btnCriar();
		btnCancelar();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void artista() {
		labelArtista = new JLabel("Insira o nome do artista:");
		labelArtista.setBounds(192,90,200,30);
		labelArtista.setForeground(Color.black);
		
		artista = new JTextArea();
		artista.setBounds(192,120,200,25);
		
		frame.add(labelArtista);
		frame.add(artista);
	}
	
	public void btnCriar() {
		criar = new JButton("Adicionar");
		criar.setBounds(314,190,170,40);
		criar.setBackground(new Color(0,0,0));
		criar.setForeground(Color.white);
		criar.setActionCommand("criar");
		criar.addActionListener(this);
		criar.setBorder(null);
		
		frame.add(criar);
	}
	
	public void btnCancelar() {
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(100,190,170,40);
		cancelar.setBackground(new Color(155,0,0));
		cancelar.setForeground(Color.white);
		cancelar.setActionCommand("cancelar");
		cancelar.addActionListener(this);
		cancelar.setBorder(null);
		
		frame.add(cancelar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "criar") {
			//exibir tela artista
			String nomeArtista = artista.getText();
			//ControleDados cd = new ControleDados();
			boolean verif = cd.adicionarArtista(nomeArtista, null, null);

			int idx = cd.buscarArtista(nomeArtista);

			if(verif) {
				new TelaUsuario(cd, idx);
				frame.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Artista já existe!");
			}

			frame.dispose();
		} else if(e.getActionCommand() == "cancelar") {
			new TelaUsuario(cd);
			frame.dispose();
		}
		
	}
}
