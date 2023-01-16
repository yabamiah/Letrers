package view;

import javax.swing.*;
import java.awt.*;

public class TelaAlbum {
//exibir musicas de um album
    private JFrame album;
    private JLabel nomeAlbum;
    private JLabel nomeArtista;
    private JList<String> listaMusicas;

    public TelaAlbum() {
        JFrame album = new JFrame("Album"); //Trocar para variavel Nome Album
        album.setSize(800,500);
        album.setLayout(null);
        album.getContentPane().setBackground(Color.PINK);

        nomeAlbum = new JLabel("Born to Die");
        nomeAlbum.setBounds(100, 50, 200, 50);
        nomeAlbum.setFont(new Font("Arial", Font.BOLD, 20));

        nomeArtista = new JLabel("Lana Del Rey");
        nomeArtista.setBounds(100, 80, 200, 50);
        nomeArtista.setFont(new Font("Arial", Font.BOLD, 12));

        String musicas[] = {"Blue Jeans", "Video Games", "Summertime Sadness", "Born to Die", "Young and Beautiful", "Off to the", "Lust for life"};
        listaMusicas = new JList<String>(musicas);
        listaMusicas.setBounds(100, 130, 200, 200);
        listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaMusicas.setLayoutOrientation(JList.VERTICAL);
        listaMusicas.setVisibleRowCount(-1);
        listaMusicas.setForeground( new Color(255, 0, 110) );

        JScrollPane listaMusicasScroll = new JScrollPane(listaMusicas);
        listaMusicasScroll.setBounds(100, 130, 200, 100);

        album.add(nomeAlbum);
        album.add(nomeArtista);
        album.add(listaMusicasScroll);
        album.setVisible(true);
    }

    public static void main(String[] args) {
        TelaAlbum exemplo = new TelaAlbum();
    }
}
