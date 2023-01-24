package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleDados {
    private Dados dados = new Dados();

    public ControleDados() {
        this.dados = new Dados();
    }

    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public ArrayList<Artista> getArtistas() {
        return dados.getArtistas();
    }

    public int getQtdArtistas() {
        return dados.getQtdArtistas();
    }

    public Usuario[] getUsuarios() {
        return dados.getUsuarios();
    }

    public int getQtdUsuarios() {
        return dados.getQtdUsuarios();
    }

    public Musica[] getMusicas() {
        return dados.getMusicas();
    }

    public int getQtdMusicas() {
        return dados.getQtdMusicas();
    }

    public LetraDeMusica[] getLetras() {
        return dados.getLetras();
    }

    public int getQtdLetras() {
        return dados.getQtdLetras();
    }

    public Playlist[] getPlaylists() {
        return dados.getPlaylists();
    }

    public int getQtdPlaylists() {
        return dados.getQtdPlaylists();
    }

    public Album[] getAlbuns() {
        return dados.getAlbuns();
    }

    public int getQtdAlbuns() {
        return dados.getQtdAlbuns();
    }

    public void adicionarArtista(Artista artista, String nome, ArrayList<String> generos, ArrayList<Musica> musicas) {
        for(int i = 0; i < dados.getQtdArtistas(); i++) {
            if(dados.getArtistas().get(i).getNome().equals(artista.getNome())) {
                System.out.println("Artista já cadastrado!");
                return;
            } else {
                System.out.println("Artista cadastrado com sucesso!");
                Artista a = new Artista(nome, generos, musicas);
                dados.adicionarArtista(a);
                return;
            }
        }
        return;
    }

    public Boolean removerArtista(Artista artista) {
        for (int i = 0; i < this.dados.getQtdArtistas(); i++) {
            if (this.dados.getArtistas().get(i).getNome().equals(artista.getNome())) {
                this.dados.setQtdArtistas(this.dados.getQtdArtistas() - 1);
                return true;
            }
        }
        return false;
    }

    public Boolean editarArtista(Artista artista, String nome, ArrayList<String> generos, ArrayList<Musica> musicas) {
        for (int i = 0; i < this.dados.getQtdArtistas(); i++) {
            if (this.dados.getArtistas().get(i).getNome().equals(artista.getNome())) {
                this.dados.getArtistas().get(i).setNome(nome);
                this.dados.getArtistas().get(i).setGeneros(generos);
                this.dados.getArtistas().get(i).setMusicas(musicas);
                return true;
            }
        }
        return false;
    }

    public void adicionarMusica(Musica musica, String nome, String genero) {
        for(int i = 0; i < this.dados.getQtdMusicas(); i++) {
            if(this.dados.getMusicas()[i].getNome().equals(musica.getNome())) {
                System.out.println("Música já cadastrada!");
                return;
            } else {
                Musica m = new Musica(nome, genero);
                this.dados.getMusicas()[this.dados.getQtdMusicas()] = m;
            }
        }
    }

    public Boolean removerMusica(Musica musica) {
        for (int i = 0; i < this.dados.getQtdMusicas(); i++) {
            if (this.dados.getMusicas()[i].getNome().equals(musica.getNome())) {
                this.dados.getMusicas()[i] = null;
                this.dados.setQtdMusicas(this.dados.getQtdMusicas() - 1);
                return true;
            }
        }
        return false;
    }

    public Boolean editarMusica(Musica musica, String nome, String genero) {
        for (int i = 0; i < this.dados.getQtdMusicas(); i++) {
            if (this.dados.getMusicas()[i].getNome().equals(musica.getNome())) {
                this.dados.getMusicas()[i].setNome(nome);
                this.dados.getMusicas()[i].setGenero(genero);
                return true;
            }
        }
        return false;
    }

    public void adicionarLetra(LetraDeMusica letra, String corpoOriginal, String corpoTraduzido) {
        for(int i = 0; i < this.dados.getQtdLetras(); i++) {
            if(this.dados.getLetras()[i].getCorpoOriginal().equals(letra.getCorpoOriginal())) {
                System.out.println("Letra já cadastrada!");
                return;
            } else {
                LetraDeMusica l = new LetraDeMusica(corpoOriginal, corpoTraduzido);
                this.dados.getLetras()[this.dados.getQtdLetras()] = l;
            }
        }
    }

    public Boolean removerLetra(LetraDeMusica letra) {
        for (int i = 0; i < this.dados.getQtdLetras(); i++) {
            if (this.dados.getLetras()[i].getCorpoOriginal().equals(letra.getCorpoOriginal())) {
                this.dados.getLetras()[i] = null;
                this.dados.setQtdLetras(this.dados.getQtdLetras() - 1);
                return true;
            }
        }
        return false;
    }

    public Boolean editarLetra(LetraDeMusica letra, String corpoOriginal, String corpoTraduzido) {
        for (int i = 0; i < this.dados.getQtdLetras(); i++) {
            if (this.dados.getLetras()[i].getCorpoOriginal().equals(letra.getCorpoOriginal())) {
                this.dados.getLetras()[i].setCorpoOriginal(corpoOriginal);
                this.dados.getLetras()[i].setCorpoTraduzido(corpoTraduzido);
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ControleDados cd = new ControleDados();
        ArrayList<String> generos = new ArrayList<String>();

        cd.dados.EncherDados();

        generos.add("Rock");
        generos.add("Pop");
        ArrayList<Musica> musicas = new ArrayList<Musica>();
        ArrayList<Artista> artistas = new ArrayList<Artista>();
        artistas.add(new Artista("Artista 1", generos, musicas));

        musicas.add(new Musica("Musica 1", "Rock"));
        musicas.add(new Musica("Musica 2", "Pop"));
        Artista artista = new Artista("!1##!2", generos, musicas);
        Artista artista2 = new Artista("!@#$2", generos, musicas);

        cd.adicionarArtista(artista, "!@#$@!", generos, musicas);
        cd.adicionarArtista(artista, "@!#$2", generos, musicas);

        System.out.println(cd.dados.getQtdArtistas());
        System.out.println(cd.dados.getArtistas());

        cd.editarArtista(artista, "Artista 3", generos, musicas);
        cd.adicionarMusica(new Musica("Musica 1", "Rock"), "Musica 2", "Pop");
        cd.removerMusica(new Musica("Musica 1", "Rock"));
        cd.editarMusica(new Musica("Musica 1", "Rock"), "Musica 2", "Pop");

        var ca = new ControleArtista(cd).getNomeArtista();
        System.out.println("--------------------");
        System.out.println(ca);
    }
}