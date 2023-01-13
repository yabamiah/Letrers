package view;

import javax.swing.*;

public class TelaArtista {
//exibir albuns e músicas
    private JFrame artista;
    private JLabel nomeArtista;
    private JLabel classificacao;
    private JLabel albuns;
	private JList<String> listaMusicas;
    private JList<String> listaAlbuns;
    
    public TelaArtista() {

        artista = new JFrame("Artista");
        artista.setSize(800,500);
        artista.setLayout(null);

        nomeArtista = new JLabel("Lana Del Rey");
        nomeArtista.setBounds(100, 50, 200, 50);

        classificacao = new JLabel("# 4.5");
        classificacao.setBounds(200, 50, 200, 50);

        String musicas[] = {"Blue Jeans", "Video Games", "Summertime Sadness", "Born to Die", "Young and Beautiful"};
        listaMusicas = new JList<String>(musicas);
        listaMusicas.setBounds(100, 100, 200, 200);
        listaMusicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaMusicas.setLayoutOrientation(JList.VERTICAL);
        listaMusicas.setVisibleRowCount(-1);
        
        JScrollPane listaMusicasScroll = new JScrollPane(listaMusicas);
        listaMusicasScroll.setBounds(100, 100, 200, 100);

        albuns = new JLabel("Albuns");
        albuns.setBounds(400, 50, 200, 50);

        String albunsNomes[] = {"Born to Die", "Paradise", "Ultraviolence"};
        listaAlbuns = new JList<String>(albunsNomes);
        listaAlbuns.setBounds(100, 400, 200, 200);
        listaAlbuns.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaAlbuns.setLayoutOrientation(JList.VERTICAL);
        listaAlbuns.setVisibleRowCount(-1);

        JScrollPane listaAlbunsScroll = new JScrollPane(listaAlbuns);
        listaAlbunsScroll.setBounds(400, 100, 200, 100);

        artista.add(nomeArtista);
        artista.add(classificacao);
        artista.add(listaMusicasScroll);
        artista.add(albuns);
        artista.add(listaAlbunsScroll);
        artista.setVisible(true);
    }

    public static void main(String[] args) {
        TelaArtista exemplo = new TelaArtista();
    }
}
