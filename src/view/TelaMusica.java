package view;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TelaMusica implements ActionListener{
	
	private JFrame frame;
	private JLabel nomeMusica;
	private JLabel nomeArtista;
	private JLabel labelLetra;
	private JTextArea textoLetra;
	private JLabel labelTraducao;
	private JTextArea textoTraducao;
	private JButton voltar;
	private JButton excluir;
	private JButton editar;
	private JScrollPane textoLetraScroll;
	private JScrollPane textoTraducaoScroll;
	
	
	
	private String musica = "champagne problems";
	private String artista = "Taylor Swift";
	private String letra = "You booked the night train for a reason\r\n"
			+ "So you could sit there in this hurt\r\n"
			+ "Bustling crowds or silent sleepers\r\n"
			+ "You're not sure which is worse\r\n"
			+ "\r\n"
			+ "Because I dropped your hand while dancing\r\n"
			+ "Left you out there standing\r\n"
			+ "Crestfallen on the landing\r\n"
			+ "Champagne problems\r\n"
			+ "Your mom's ring in your pocket\r\n"
			+ "My picture in your wallet\r\n"
			+ "Your heart was glass, I dropped it\r\n"
			+ "Champagne problems\r\n"
			+ "\r\n"
			+ "You told your family for a reason\r\n"
			+ "You couldn't keep it in\r\n"
			+ "Your sister splashed out on the bottle\r\n"
			+ "Now no one's celebrating\r\n"
			+ "\r\n"
			+ "Dom Perignon, you brought it\r\n"
			+ "No crowd of friends applauded\r\n"
			+ "Your hometown skeptics called it\r\n"
			+ "Champagne problems\r\n"
			+ "You had a speech, you're speechless\r\n"
			+ "Love slipped beyond your reaches\r\n"
			+ "And I couldn't give a reason\r\n"
			+ "Champagne problems\r\n"
			+ "\r\n"
			+ "Your Midas touch on the Chevy door\r\n"
			+ "November flush and your flannel cure\r\n"
			+ "This dorm was once a madhouse\r\n"
			+ "I made a joke: Well, it's made for me\r\n"
			+ "How evergreen, our group of friends\r\n"
			+ "Don't think we'll say that word again\r\n"
			+ "And soon they'll have the nerve to deck the halls\r\n"
			+ "That we once walked through\r\n"
			+ "One for the money, two for the show\r\n"
			+ "I never was ready so I watch you go\r\n"
			+ "Sometimes you just don't know the answer\r\n"
			+ "Till someone's on their knees and asks you\r\n"
			+ "She would've made such a lovely bride\r\n"
			+ "What a shame she's fucked in the head, they said\r\n"
			+ "But you'll find the real thing instead\r\n"
			+ "She'll patch up your tapestry that I shred\r\n"
			+ "\r\n"
			+ "And hold your hand while dancing\r\n"
			+ "Never leave you standing\r\n"
			+ "Crestfallen on the landing\r\n"
			+ "With champagne problems\r\n"
			+ "Your mom's ring in your pocket\r\n"
			+ "Her picture in your wallet\r\n"
			+ "You won't remember all my\r\n"
			+ "Champagne problems\r\n"
			+ "\r\n"
			+ "You won't remember all my\r\n"
			+ "Champagne problems";
	private String traducao = "Você reservou o trem noturno por um motivo\r\n"
			+ "Para você poder sentar aí nesta dor\r\n"
			+ "Multidões agitadas ou dorminhocos silenciosos\r\n"
			+ "Você não tem certeza de qual é pior\r\n"
			+ "\r\n"
			+ "Porque eu soltei sua mão enquanto dançava\r\n"
			+ "Deixei você aí parado\r\n"
			+ "Devastado no patamar\r\n"
			+ "Problemas insignificantes\r\n"
			+ "O anel da sua mãe no seu bolso\r\n"
			+ "Minha foto na sua carteira\r\n"
			+ "Seu coração era de vidro, eu deixei cair\r\n"
			+ "Problemas insignificantes\r\n"
			+ "\r\n"
			+ "Você contou para sua família por um motivo\r\n"
			+ "Você não conseguiu guardar\r\n"
			+ "Sua irmã virou toda a garrafa\r\n"
			+ "Agora ninguém está comemorando\r\n"
			+ "\r\n"
			+ "Dom Perignon, você trouxe\r\n"
			+ "Nenhuma multidão de amigos aplaudiu\r\n"
			+ "Os céticos de sua cidade natal chamaram isso de\r\n"
			+ "Problemas insignificantes\r\n"
			+ "Você tinha um discurso, você está sem palavras\r\n"
			+ "O amor escapou do seu alcance\r\n"
			+ "E eu não pude dar uma razão\r\n"
			+ "Problemas insignificantes\r\n"
			+ "\r\n"
			+ "Seu toque de Midas na porta do Chevy\r\n"
			+ "O frio de novembro e sua cura de flanela\r\n"
			+ "Este dormitório já foi um hospício\r\n"
			+ "Eu fiz uma piada: Bem, foi feito para mim\r\n"
			+ "Quão perene, nosso grupo de amigos\r\n"
			+ "Não acho que vamos dizer essa palavra de novo\r\n"
			+ "E logo eles terão coragem de enfeitar os corredores\r\n"
			+ "Que uma vez percorremos\r\n"
			+ "Um pelo dinheiro, dois pelo show\r\n"
			+ "Eu nunca estive pronta, então eu vejo você ir\r\n"
			+ "Às vezes você simplesmente não sabe a resposta\r\n"
			+ "Até que alguém fique de joelhos e te pergunte\r\n"
			+ "Ela teria sido uma noiva tão adorável\r\n"
			+ "Que pena que ela é fodida da cabeça, disseram\r\n"
			+ "Mas você encontrará a coisa real, em vez disso\r\n"
			+ "Ela vai remendar sua tapeçaria que eu destruí\r\n"
			+ "\r\n"
			+ "E segurar sua mão enquanto dança\r\n"
			+ "Nunca te deixar aí parado\r\n"
			+ "Devastado no patamar\r\n"
			+ "Com problemas insignificantes\r\n"
			+ "O anel da sua mãe no seu bolso\r\n"
			+ "A foto dela na sua carteira\r\n"
			+ "Você não vai se lembrar de todos os meus\r\n"
			+ "Problemas insignificantes\r\n"
			+ "\r\n"
			+ "Você não vai se lembrar de todos os meus\r\n"
			+ "Problemas insignificantes";
	
	public TelaMusica(controle.ControleDados cd, int idxMusica) {
		frame = new JFrame("Letters - " + musica);
		frame.setSize(900,600);
		
        ImagemFundo("imagem/Home.png");
		infoMusica();
		Letra();
		Traducao();
		btnVoltar();
		btnEditar();
		btnExcluir();
		
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void infoMusica() {
		nomeMusica = new JLabel(musica);
		nomeMusica.setBounds(193, 20, 300, 50);
		nomeMusica.setFont(new Font("Times New Roman", Font.BOLD, 25));
		nomeMusica.setForeground(Color.white);
        
		nomeArtista = new JLabel(artista);
		nomeArtista.setBounds(193, 50, 300, 50);
        nomeArtista.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        nomeArtista.setForeground(Color.white);
		
		frame.add(nomeMusica);
		frame.add(nomeArtista);
	}
	
	public void Letra() {
		labelLetra = new JLabel("Letra Original");
		labelLetra.setBounds(80,-65,350,350);
		labelLetra.setForeground(Color.white);
		labelLetra.setFont(new Font("Times New Roman", Font.BOLD,17));
		
		textoLetra = new JTextArea(letra);
		textoLetra.setBounds(80, 130, 350, 350);
		textoLetra.setFont(new Font("Times New Roman",Font.BOLD,15));
		textoLetra.setLineWrap(true);
		textoLetra.setEditable(false);
		textoLetra.setBackground(new Color(54,74,20));
		textoLetra.setForeground(Color.white);
		
		textoLetraScroll = new JScrollPane(textoLetra);
		textoLetraScroll.setBounds(textoLetra.getX(), textoLetra.getY(), 
				textoLetra.getWidth(), textoLetra.getHeight());
		textoLetraScroll.setBorder(null);
		
		frame.add(labelLetra);
		frame.add(textoLetraScroll);
	}
	
	public void Traducao() {
		labelTraducao = new JLabel("Tradução");
		labelTraducao.setBounds(470,-65,350,350);
		labelTraducao.setForeground(Color.white);
		labelTraducao.setFont(new Font("Times New Roman", Font.BOLD,17));
		
		textoTraducao = new JTextArea(traducao);
		textoTraducao.setBounds(470, 130, 350, 350);
		textoTraducao.setFont(new Font("Times New Roman",Font.BOLD,15));
		textoTraducao.setLineWrap(true);
		textoTraducao.setEditable(false);
		textoTraducao.setBackground(new Color(54,74,20));
		textoTraducao.setForeground(Color.white);
		
		textoTraducaoScroll = new JScrollPane(textoTraducao);
		textoTraducaoScroll.setBounds(textoTraducao.getX(), textoTraducao.getY(), 
				textoTraducao.getWidth(), textoTraducao.getHeight());
		textoTraducaoScroll.setBorder(null);
		
		frame.add(labelTraducao);
		frame.add(textoTraducaoScroll);
	}	
	
	public void btnVoltar(){
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
	
	public void btnEditar() {
		editar = new JButton("Editar Música");
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
		excluir = new JButton("Excluir Música");
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
		new TelaMusica(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "voltar") {
			//new TelaUsuario();
			frame.dispose();
			
		} else if(e.getActionCommand() == "editar") {
			
		} else if(e.getActionCommand() == "excluir") {
			
		}
	}

}