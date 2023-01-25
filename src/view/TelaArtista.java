package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TelaArtista implements ActionListener{
	
    private JFrame frame;
    private JLabel nomeArtista;
    //private JLabel classificacao;
    //private JLabel generos;
    //private JList<String> listaGeneros;
    private JLabel labelAlbum;
    private JLabel labelMusica;
	private JList<String> listaMusicas;
    private JList<String> listaAlbuns;
    private JScrollPane listaAlbunsScroll;
    private JScrollPane listaMusicasScroll;
    private JButton voltar;
    private JButton editar;
    private JButton excluir;
    private JButton addMusica;
    
    private String artista = "Taylor Swift";
    private String albunsNomes[] = {"Anti-Hero", "Midnights", "Red", "Fearless",
    		"evermore", "folklore", "Lover", "reputation", "1989", "Speak now"};
    String musicas[] = {"champagne problems", "no body, no crime", "Mr.Perfectly Fine(Taylor's Version)",
    		"exile", "Paper Rings", "Afterglow", "Love Story(Taylor's Version)", "Snow On The Beach",
    		"Red", "Run(Taylor's Version)", "All Too Well(Taylor's Version)", "I Knew You Were Trouble(Taylor's Version)", "22(Taylor's Version)",
    		"Dear John", "Last Kiss", "Wildest Dreams(Taylor's Version)"};
    
    public TelaArtista() {
        frame = new JFrame("Letters - " + artista);
        frame.setSize(900,600);
        frame.getContentPane().setBackground(Color.PINK);
           
        nomeArtista = new JLabel(artista);
        nomeArtista.setBounds(385, 10, 300, 50);
        nomeArtista.setFont(new Font("Times New Roman", Font.BOLD, 25));
        nomeArtista.setForeground(Color.white);
        
        ImagemFundo("/imagem/Home.jpg");
        frame.add(nomeArtista);
        btnVoltar();
        areaAlbum();
        areaMusica();
        btnAddMusica();
        btnEditar();
        btnExcluir();
        
        frame.setLayout(null); 
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
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
    
    public void areaAlbum() {
    	labelAlbum = new JLabel("Álbuns:");
    	labelAlbum.setBounds(110, 70, 300, 60);
    	labelAlbum.setForeground(Color.white);
    	labelAlbum.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        listaAlbuns = new JList<String>(albunsNomes);
        listaAlbuns.setBounds(110, 120, 310, 330);
        //listaAlbuns.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //listaAlbuns.setLayoutOrientation(JList.VERTICAL);
        //listaAlbuns.setVisibleRowCount(-1);
        listaAlbuns.setForeground(Color.black);
        //listaAlbuns.setBackground(new Color(54,74,20));
        listaAlbuns.setFont(new Font("", Font.PLAIN, 14));

        listaAlbunsScroll = new JScrollPane(listaAlbuns);
        listaAlbunsScroll.setBounds(listaAlbuns.getX(), listaAlbuns.getY(), 
        		listaAlbuns.getWidth(), listaAlbuns.getHeight());;
       
        frame.add(labelAlbum);
        frame.add(listaAlbunsScroll);
    }

    public void areaMusica() {
    	labelMusica = new JLabel("Músicas deste artista:");
    	labelMusica.setBounds(480, 70, 300, 60);
    	labelMusica.setForeground(Color.white);
    	labelMusica.setFont(new Font("Times New Roman", Font.BOLD, 18));
    	
        listaMusicas = new JList<String>(musicas);
        listaMusicas.setBounds(480, 120, 310, 330);
        listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaMusicas.setLayoutOrientation(JList.VERTICAL);
        listaMusicas.setVisibleRowCount(-1);
        listaMusicas.setForeground(Color.black);
        //listaMusicas.setBackground(new Color(54,74,20));
        listaMusicas.setFont(new Font("", Font.PLAIN, 14));
        
        listaMusicasScroll = new JScrollPane(listaMusicas);
        listaMusicasScroll.setBounds(listaMusicas.getX(), listaMusicas.getY(), 
        		listaMusicas.getWidth(), listaMusicas.getHeight());
        
        frame.add(labelMusica);
        frame.add(listaMusicasScroll);
    }
    
    public void btnAddMusica() {
    	addMusica = new JButton("Adicionar Música");
    	addMusica.setBounds(35,540,120,30);
    	addMusica.setForeground(Color.white);
    	addMusica.setBackground(Color.black);
    	addMusica.setBorderPainted(true);
    	addMusica.setActionCommand("addMusica");
    	addMusica.addActionListener(this);
    	addMusica.setBorder(null);
		
		frame.add(addMusica);
    }
    
    public void btnEditar() {
		editar = new JButton("Editar Artista");
		editar.setBounds(170,540,120,30);
		editar.setForeground(Color.white);
		editar.setBackground(Color.black);
		editar.setBorderPainted(true);
		editar.setActionCommand("editar");
		editar.addActionListener(this);
		editar.setBorder(null);
		
		frame.add(editar);
	}
	
	public void btnExcluir() {
		excluir = new JButton("Excluir Artista");
		excluir.setBounds(680,540,120,30);
		excluir.setForeground(Color.white);
		excluir.setBackground(Color.black);
		excluir.setBorderPainted(true);
		excluir.setActionCommand("excluir");
		excluir.addActionListener(this);
		excluir.setBorder(null);
	
		frame.add(excluir);
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
        new TelaArtista();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "voltar") {
			new TelaUsuario();
			frame.dispose();
			
		} else if(e.getActionCommand() == "editar") {
			
		} else if(e.getActionCommand() == "excluir") {
			
		}
		
	}
}

/*
classificacao = new JLabel("Classificação: 4.5");
classificacao.setBounds(200, 16, 200, 50);

generos = new JLabel("Genêros:");
generos.setBounds(380, 16, 200, 50);
frame.add(generos);

String generosArrays[] = {"Pop", "Rock", "Indie"};
listaGeneros = new JList<String>(generosArrays);
listaGeneros.setBounds(400, 29, 100, 100);
listaGeneros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
listaGeneros.setLayoutOrientation(JList.HORIZONTAL_WRAP);
listaGeneros.setVisibleRowCount(4);

frame.add(classificacao);
frame.add(listaGenerosScroll);
 */
