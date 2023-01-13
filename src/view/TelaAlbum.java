package view;

import javax.swing.*;

public class TelaAlbum {
//exibir musicas de um album
    private JFrame album;
    private JLabel nomeAlbum;
    private JLabel nomeArtista;
    private JList<String> listaMusicas;

    public TelaAlbum() {
        JFrame album = new JFrame("Album");
        album.setSize(800,500);
        album.setLayout(null);

        nomeAlbum = new JLabel("Born to Die");
        nomeAlbum.setBounds(100, 50, 200, 50);

        nomeArtista = new JLabel("Lana Del Rey");
        nomeArtista.setBounds(100, 80, 200, 50);

        String musicas[] = {"Blue Jeans", "Video Games", "Summertime Sadness", "Born to Die", "Young and Beautiful"};
        listaMusicas = new JList<String>(musicas);
        listaMusicas.setBounds(100, 130, 200, 200);
        listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaMusicas.setLayoutOrientation(JList.VERTICAL);
        listaMusicas.setVisibleRowCount(-1);

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
