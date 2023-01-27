package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import controle.*;

public class TelaArtista implements ActionListener{
	
    private JFrame frame;
    private JLabel nomeArtista;
    //private JLabel classificacao;
    //private JLabel generos;
    //private JList<String> listaGeneros;
    private JLabel labelMusica;
	private JList<String> listaMusicas;
    private JList<String> listaAlbuns;
    private JScrollPane listaAlbunsScroll;
    private JScrollPane listaMusicasScroll;
    private JButton voltar;
    private JButton editar;
    private JButton excluir;
    private JButton addMusica;
	private String artistaAtual;
	private int idxArtista;
	private int idxMusica;
	private ControleArtista controlA;
	private ControleMusica controlM;
	private ControleDados cd;
	private int idxUsuario;
    
    public TelaArtista(ControleDados cd, int idxArtista, int idxUsuario) {
		this.cd = cd;
		controlM = new controle.ControleMusica(cd);
		controlA = new controle.ControleArtista(cd);
		nomeArtista = new JLabel(controlA.getNomeArtista(idxArtista));

		this.idxUsuario = idxUsuario;
		
		this.idxArtista = idxArtista;
		artistaAtual = controlA.getNomeArtista(idxArtista);

        frame = new JFrame("Letters - " + artistaAtual);
        frame.setSize(900,600);
        frame.getContentPane().setBackground(Color.PINK);

        nomeArtista.setBounds(385, 20, 300, 50);
        nomeArtista.setFont(new Font("Times New Roman", Font.BOLD, 25));
        nomeArtista.setForeground(Color.white);
        
        ImagemFundo("imagem/Home.png");
        frame.add(nomeArtista);
        btnVoltar();
        areaMusica();
        btnAddMusica();
        btnEditar();
        btnExcluir();
        
        frame.setLayout(null); 
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

	public TelaArtista(ControleDados cd, int idxArtista, int idxUsuario, int idxMusica) {
		this.cd = cd;

		controlM = new ControleMusica(cd);
		controlA = new controle.ControleArtista(cd);

		nomeArtista = new JLabel(controlA.getNomeArtista(idxArtista));

		this.idxArtista = idxArtista;
		artistaAtual = controlA.getNomeArtista(idxArtista);

        frame = new JFrame("Letters - " + artistaAtual);
        frame.setSize(900,600);
        frame.getContentPane().setBackground(Color.PINK);

        nomeArtista.setBounds(385, 20, 300, 50);
        nomeArtista.setFont(new Font("Times New Roman", Font.BOLD, 25));
        nomeArtista.setForeground(Color.white);
        
        ImagemFundo("imagem/Home.png");
        frame.add(nomeArtista);
        btnVoltar();
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

    public void areaMusica() {
    	labelMusica = new JLabel("Músicas deste artista:");
    	labelMusica.setBounds(480, 70, 300, 60);
    	labelMusica.setForeground(Color.white);
    	labelMusica.setFont(new Font("Times New Roman", Font.BOLD, 18));
    	
		listaMusicas = new JList<String>(controlM.getNomeMusicas());

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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "voltar") {
			new TelaUsuario(cd, idxUsuario);
			frame.dispose();
			
		} else if(e.getActionCommand() == "editar") {
			new TelaAdicionarArtista(cd, idxUsuario, idxArtista);
			frame.dispose();
			
		} else if(e.getActionCommand() == "excluir") {
			boolean verifA = cd.removerArtista(idxArtista);
			boolean verifM = cd.removerMusica(idxMusica);

			if(verifA && verifM) {
				JOptionPane.showMessageDialog(null, "Artista excluído com sucesso!");
				new TelaUsuario(cd, idxUsuario);
				frame.dispose();
				
			} else {
				JOptionPane.showMessageDialog(null, "Erro ao excluir artista!");
				new TelaUsuario(cd, idxUsuario);
				frame.dispose();
			}
			frame.dispose();
			
		} else if(e.getActionCommand() == "addMusica") {
			new TelaAdicionarMusica(cd, idxArtista, idxUsuario);
			frame.dispose();
		}
		
	}
}
