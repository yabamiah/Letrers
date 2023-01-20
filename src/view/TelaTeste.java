package view;

	import java.awt.*;
	import java.awt.image.BufferedImage;
	import javax.swing.*;
	import java.io.File;
	import java.io.IOException;
	import javax.imageio.ImageIO;
	
public class TelaTeste {
	
	public TelaTeste() {
		BufferedImage img = null;
			
			try {
				img = ImageIO.read(getClass().getResource("/imagem/Pagina Inicial.jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			// Cria e configura o texto no JLabel
						JLabel label = new JLabel();
						label.setText("One Piece é legal!");
						label.setFont(new Font("Calibri", Font.BOLD, 120));
						label.setForeground(Color.white);
						label.setHorizontalTextPosition(JLabel.CENTER);		
						
						// Cria e configura a janela
						JFrame janela = new JFrame();
						janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						janela.setSize(1280, 720);
						
						// Força a imagem a ficar do tamanho da janela
						Image dimg = img.getScaledInstance(janela.getWidth(), janela.getHeight(),
								Image.SCALE_SMOOTH);
						
						ImageIcon imageIcon = new ImageIcon(dimg);
						label.setIcon(imageIcon);
						
						// mostra a janela e adiciona o label a ela
						janela.setVisible(true);
						janela.add(label);
						
	}

		public static void main(String[] args) {
			
			new TelaTeste();
			
			
		}

	}
