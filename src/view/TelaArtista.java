package view;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;

public class TelaArtista {
//exibir albuns e músicas
    private JFrame artista;
    private JLabel nomeArtista;
    private JLabel classificacao;
    private JLabel generos;
    private JList<String> listaGeneros;
    private JLabel albuns;
    private JLabel acessadas;
	private JList<String> listaMusicas;
    private JList<String> listaAlbuns;
    
    public TelaArtista() {

        artista = new JFrame("Artista");
        artista.setSize(800,500);
        artista.getContentPane().setBackground(Color.PINK);
        artista.setLayout(null);    

        nomeArtista = new JLabel("Lana Del Rey");
        nomeArtista.setBounds(300, -10, 200, 50);
        nomeArtista.setFont(new Font("Arial", Font.BOLD, 16));

        classificacao = new JLabel("Classificação: 4.5");
        classificacao.setBounds(200, 16, 200, 50);

        generos = new JLabel("Genêros:");
        generos.setBounds(380, 16, 200, 50);

        // Lista de generos
        String generosArrays[] = {"Pop", "Rock", "Indie"};
        listaGeneros = new JList<String>(generosArrays);
        listaGeneros.setBounds(400, 29, 100, 100);
        listaGeneros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaGeneros.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        listaGeneros.setVisibleRowCount(4);

        JScrollPane listaGenerosScroll = new JScrollPane(listaGeneros);
        listaGenerosScroll.setBounds(450, 29, 60, 22);

        acessadas = new JLabel("Músicas mais Acessadas:");
        acessadas.setBounds(260, 60, 200, 50);

        // Lista de musicas
        String musicas[] = {"Blue Jeans", "Video Games", "Summertime Sadness", "Born to Die", "Young and Beautiful"};
        listaMusicas = new JList<String>(musicas);
        listaMusicas.setBounds(260, 100, 200, 200);
        listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaMusicas.setLayoutOrientation(JList.VERTICAL);
        listaMusicas.setVisibleRowCount(-1);
        listaMusicas.setForeground( new Color(255, 0, 110) );
        
        JScrollPane listaMusicasScroll = new JScrollPane(listaMusicas);
        listaMusicasScroll.setBounds(260, 100, 200, 100);

        // Lista de albuns
        albuns = new JLabel("Albuns:");
        albuns.setBounds(260, 230, 200, 50);

        String albunsNomes[] = {"Born to Die", "Paradise", "Ultraviolence"};
        listaAlbuns = new JList<String>(albunsNomes);
        listaAlbuns.setBounds(260, 300, 200, 200);
        listaAlbuns.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaAlbuns.setLayoutOrientation(JList.VERTICAL);
        listaAlbuns.setVisibleRowCount(-1);
        listaAlbuns.setForeground( new Color(255, 0, 110) );

        JScrollPane listaAlbunsScroll = new JScrollPane(listaAlbuns);
        listaAlbunsScroll.setBounds(260, 270, 200, 70);

        artista.add(nomeArtista);
        artista.add(classificacao);
        artista.add(generos);
        artista.add(listaGenerosScroll);
        artista.add(listaMusicasScroll);
        artista.add(acessadas);
        artista.add(albuns);
        artista.add(listaAlbunsScroll);
        artista.setVisible(true);
    }

    public static void main(String[] args) {
        TelaArtista exemplo = new TelaArtista();
    }
}
