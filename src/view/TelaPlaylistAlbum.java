package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import controle.*;

public class TelaPlaylistAlbum implements ActionListener {
	
	private String albumPlaylist = "Born to Die";
	private String artista = "Lana Del Rey";
    private JList<String> listaMusicas;
    String musicas[] = {"Blue Jeans", "Video Games", "Summertime Sadness", 
    		"Born to Die", "Young and Beautiful", "Off to the", "Lust for life"};
    private JScrollPane listaMusicasScroll;
	private ControleDados cd;
	private ControleMusica controleM;
	private ControlePlaylist controleP;
	private int idx;
	
    
    private JFrame frame;
    private JLabel nomeAlbumPlaylist = new JLabel();
    private JLabel nomeArtista  = new JLabel(artista);
    private JButton voltar;
    private JButton editar = new JButton("Editar");;
    private JButton excluir = new JButton("Excluir");
    private static int opcao = 1;
        
    public TelaPlaylistAlbum(int opcao, ControleDados cd, int idx) {
		this.cd = cd;
		controleM = new ControleMusica(cd);
		controleP = new ControlePlaylist(cd);
		this.idx = idx;

		if(opcao == 1) {
			frame = new JFrame("Álbum - " + albumPlaylist);
		
			nomeAlbumPlaylist.setBounds(193, 50, 300, 50);
			nomeArtista.setBounds(193, 80, 300, 50);
			nomeArtista.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			nomeArtista.setForeground(Color.white);	        

		} else {
			nomeAlbumPlaylist = new JLabel(controleP.getNomePlaylist(idx));
			frame = new JFrame("Playlist - " + controleP.getNomePlaylist(idx));    		
            nomeAlbumPlaylist.setBounds(193, 60, 300, 50);
		}
        
        frame.setSize(900,600);
        
        nomeAlbumPlaylist.setFont(new Font("Times New Roman", Font.BOLD, 25));
        nomeAlbumPlaylist.setForeground(Color.white);
        
        ImagemFundo("imagem/Home.png");
        btnVoltar();
        listaMus();
        btnEditar();
        btnExcluir();
        if(opcao == 1)	frame.add(nomeArtista);
        frame.add(nomeAlbumPlaylist);
        
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
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
        listaMusicas = new JList<String>(controleM.getNomeMusicas());
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
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(listaMusicasScroll);
    }
    
    public void btnEditar() {
		editar.setBounds(100,540,120,30);
		editar.setForeground(Color.white);
		editar.setBackground(Color.black);
		editar.setBorderPainted(true);
		editar.setActionCommand("editar");
		editar.addActionListener(this);
		editar.setBorder(null);
		
		frame.add(editar);
	}
	
	public void btnExcluir() {
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "voltar") {
			new TelaUsuario(cd);
			frame.dispose();
			
		} else if(e.getActionCommand() == "editar") {
			//new TelaCriarPlaylistAlbum(opcao);
			frame.dispose();
			
		} else if(e.getActionCommand() == "excluir") {
			//new TelaUsuario(cd);
			frame.dispose();
		}
	}
}
