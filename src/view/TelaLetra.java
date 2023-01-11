package view;

import javax.swing.*;

public class TelaLetra {

	public static void main(String[] args) {
		
		JFrame letra = new JFrame("Letra");
		
		JLabel tituloMusica = new JLabel("tituloExemplo");
		JTextArea letraOriginal = new JTextArea("Olha se você não me ama, Lorem Ipsum is simply dummy text of "
				+ "\n the printing and typesetting industry. Lorem Ipsum has been the industry's standard "
				+ "\n dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled "
				+ "\n it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s "
				+ "\n with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker"
				+ "\n including versions of Lorem Ipsum.", 4, 6);
		letraOriginal.setLineWrap(true);
		JTextArea letraTraducao = new JTextArea("\n\n Look if you don't love me, Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		letraTraducao.setLineWrap(true);
		letraOriginal.setEditable(false);

	
		//x,y,larg, alt
		letra.setSize(1000,500);
		tituloMusica.setBounds(20,-200,700,500);
		letraOriginal.setBounds(20,75,700,100);
		letraTraducao.setBounds(20,220,700,100);
		
		letra.add(tituloMusica);
		letra.add(letraOriginal);
		letra.add(letraTraducao);

		letra.setLayout(null);
		letra.setVisible(true);
		

	}
}
