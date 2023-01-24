package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TelaAlbum implements ActionListener {
	private String album = "Born to Die";
	private String artista = "Lana Del Rey";
	
    private JFrame frame;
    private JLabel nomeAlbum;
    private JLabel nomeArtista;
    private JButton voltar;
    
    private JList<String> listaMusicas;
    String musicas[] = {"Blue Jeans", "Video Games", "Summertime Sadness", 
    		"Born to Die", "Young and Beautiful", "Off to the", "Lust for life"};
    private JScrollPane listaMusicasScroll;

    
    public TelaAlbum() {
        frame = new JFrame("Album - " + album); //Trocar para variavel Nome Album
        frame.setSize(900,600);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setLocationRelativeTo(null);

        nomeAlbum = new JLabel(album);
        nomeAlbum.setBounds(193, 50, 300, 50);
        nomeAlbum.setFont(new Font("Times New Roman", Font.BOLD, 25));
        nomeAlbum.setForeground(Color.white);

        nomeArtista = new JLabel(artista);
        nomeArtista.setBounds(193, 80, 300, 50);
        nomeArtista.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        nomeArtista.setForeground(Color.white);
        
        ImagemFundo("/imagem/Home.jpg");
        btnVoltar();
        listaMus();
        frame.add(nomeAlbum);
        frame.add(nomeArtista);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public void btnVoltar() {
		voltar = new JButton("Voltar");
		voltar.setBounds(10,10,70,20);
		voltar.setBorderPainted(true);
		voltar.setForeground(Color.white);
		voltar.setBackground(new Color(0,0,0));
		voltar.setBorder(null);
		
		voltar.setActionCommand("voltar");
		voltar.addActionListener(this);
		
		frame.add(voltar);
	}
    
    public void listaMus() {
        listaMusicas = new JList<String>(musicas);
        listaMusicas.setBounds(192, 135, 500, 325);
        listaMusicas.setFont(new Font("Times New Roman",Font.BOLD,18));
        //listaMusicas.setForeground(new Color(255, 0, 110));
        listaMusicas.setForeground(Color.black);
        //listaMusicas.setBackground(new Color(54,74,20));
        
        listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaMusicas.setLayoutOrientation(JList.VERTICAL);
        listaMusicas.setVisibleRowCount(-1);

        listaMusicasScroll = new JScrollPane(listaMusicas);
        listaMusicasScroll.setBounds(listaMusicas.getX(), listaMusicas.getY(), 
        		listaMusicas.getWidth(), listaMusicas.getHeight());
        listaMusicasScroll.setBorder(null);
        
        frame.add(listaMusicasScroll);
    }
    
    public void ImagemFundo(String srcImg) {
		try {
			BufferedImage img = ImageIO.read(getClass().getResource(srcImg));
			Image dimg = img.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(dimg);
			JLabel label = new JLabel();
			label.setIcon(icon);
			frame.getContentPane().add(label, BorderLayout.CENTER);
			frame.setContentPane(label);
			frame.pack();
			
		}catch(IOException err) {
			err.printStackTrace();
		}
	}

    public static void main(String[] args) {
        new TelaAlbum();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "voltar") {
			new TelaUsuario();
			frame.dispose();
		}
		
	}
}
