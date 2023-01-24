package view;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCriarAlbum implements ActionListener{

	private JFrame frame;
	private JLabel titulo;
	private JLabel labelArtista;
	private JTextArea artista;
	private JButton criar;
	private JButton cancelar;	
	
	public TelaCriarAlbum() {
		frame = new JFrame("Letters");
		frame.setSize(600,300);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(121,150,71));
		
		titulo = new JLabel("Criar Álbum");
		titulo.setBounds(211,30,300,30);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		titulo.setForeground(Color.black);
		
		frame.add(titulo);
		album();
		btnCriar();
		btnCancelar();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void album() {
		labelArtista = new JLabel("Insira o nome do álbum:");
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
	
	public static void main(String[] args) {
		new TelaCriarAlbum();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "criar") {
			//exibir tela album
			frame.dispose();
		} else if(e.getActionCommand() == "cancelar") {
			new TelaUsuario();
			frame.dispose();
		}
		
	}

}
