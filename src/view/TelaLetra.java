package view;

import javax.swing.*;

public class TelaLetra {

	private JFrame letra;
	private JLabel tituloMusica;
	private JLabel nomeArtista;
	private JTextArea letraOriginal;
	private JTextArea letraTraducao;
	private JButton avisaErro;

	public TelaLetra() {

		letra = new JFrame("Letra");
		letra.setSize(1000,500);

		tituloMusica = new JLabel("Olha se você não me ama");
		nomeArtista = new JLabel("Manoel Gomes");

		letraOriginal = new JTextArea("Olha se você não me ama, Lorem Ipsum is simply dummy text of "
				+ "\n the printing and typesetting industry. Lorem Ipsum has been the industry's standard "
				+ "\n dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled "
				+ "\n it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s "
				+ "\n with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker"
				+ "\n including versions of Lorem Ipsum.", 4, 6);
		letraOriginal.setLineWrap(true);
		letraOriginal.setEditable(false);

		letraTraducao = new JTextArea ("Olha se você não me ama, Lorem Ipsum is simply dummy text of "
		+ "\n the printing and typesetting industry. Lorem Ipsum has been the industry's standard "
		+ "\n dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled "
		+ "\n it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s "
		+ "\n with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker"
		+ "\n including versions of Lorem Ipsum.", 4, 6);
		letraTraducao.setLineWrap(true);
		letraTraducao.setEditable(false);

		avisaErro = new JButton("Viu algum erro? Clique aqui para reportar!");

		// x,y,largura, altura
		letra.setSize(1000,500);
		tituloMusica.setBounds(360,-230,700,500);
		nomeArtista.setBounds(386,-200,700,500);
		letraOriginal.setBounds(100,75,700,100);
		letraTraducao.setBounds(100,220,700,100);
		avisaErro.setBounds(100,350,300,32);

		letra.add(tituloMusica);
		letra.add(nomeArtista);
		letra.add(letraOriginal);
		letra.add(letraTraducao);
		letra.add(avisaErro);

		letra.setLayout(null);
		letra.setVisible(true);
	}
	public static void main(String[] args) {
		TelaLetra wxemplo = new TelaLetra();
	}
}
