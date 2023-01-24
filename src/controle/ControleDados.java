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


    /*
     * CRUD de Artista
     */
    public boolean adicionarArtista(String nome, ArrayList<String> generos, ArrayList<Musica> musicas) {
        int count = 0;

        for(int i = 0; i < dados.getQtdArtistas(); i++) {
            boolean verif = dados.getArtistas().get(i).getNome().equals(nome);

            if(verif) {
                count++;
            }
        }
        if(count >= 1) {
            System.out.println("Artista já cadastrado!");
            return false;
        } else {
            System.out.println("Artista cadastrado com sucesso!");
            Artista a = new Artista(nome, generos, musicas);
            dados.adicionarArtista(a);
            return true;
        }
    }

    public Boolean removerArtista(int idx) {
        String nome = dados.getArtistas().get(idx).getNome();

        for(int i = 0; i < dados.getQtdArtistas(); i++) {
            if(dados.getArtistas().get(i).getNome().equals(nome)) {
                dados.getArtistas().remove(i);
                dados.setQtdArtistas(dados.getQtdArtistas() - 1);
                return true;
            }
        }

        return false;
    }

    public Boolean editarArtista(int idx, String nomeNovo, ArrayList<String> generos, ArrayList<Musica> musicas) {
        String nomeAntigo = dados.getArtistas().get(idx).getNome();

        for(int i = 0; i < dados.getQtdArtistas(); i++) {
            if(dados.getArtistas().get(i).getNome().equals(nomeAntigo)) {

                dados.getArtistas().get(i).setNome(nomeNovo);
                dados.getArtistas().get(i).setGeneros(generos);
                dados.getArtistas().get(i).setMusicas(musicas);
                return true;
            }
        }

        return false;
    }

    /*
     * CRUD de Uusario
     */
    public boolean adicionarUsuario(String nome, ArrayList<String> generos, ArrayList<Musica> musicas) {
        int count = 0;

        for(int i = 0; i < dados.getQtdArtistas(); i++) {
            boolean verif = dados.getArtistas().get(i).getNome().equals(nome);

            if(verif) {
                count++;
            }
        }

        if(count >= 1) {
            System.out.println("Artista já cadastrado!");
            return false;
        } else {
            System.out.println("Artista cadastrado com sucesso!");
            Artista a = new Artista(nome, generos, musicas);
            dados.adicionarArtista(a);
            return true;
        }
    }

    public Boolean removerUsuario(int idx) {
        String nome = dados.getArtistas().get(idx).getNome();

        for(int i = 0; i < dados.getQtdArtistas(); i++) {
            if(dados.getArtistas().get(i).getNome().equals(nome)) {
                dados.getArtistas().remove(i);
                dados.setQtdArtistas(dados.getQtdArtistas() - 1);
                return true;
            }
        }

        return false;
    }

    public Boolean editarUsuario(int idx, String nomeNovo, ArrayList<String> generos, ArrayList<Musica> musicas) {
        String nomeAntigo = dados.getArtistas().get(idx).getNome();

        for(int i = 0; i < dados.getQtdArtistas(); i++) {
            if(dados.getArtistas().get(i).getNome().equals(nomeAntigo)) {

                dados.getArtistas().get(i).setNome(nomeNovo);
                dados.getArtistas().get(i).setGeneros(generos);
                dados.getArtistas().get(i).setMusicas(musicas);
                return true;
            }
        }

        return false;
    }

    /*
     * CRUD de Músicas
     */
    public boolean adicionarMusica(String nome, String genero) {
        int count = 0;

        for(int i = 0; i < dados.getQtdMusicas(); i++) {
            boolean verif = dados.getMusicas()[i].getNome().equals(nome);

            if(verif) {
                count++;
            }
        }

        if(count >= 1) {
            System.out.println("Música já cadastrada!");
            return false;
        } else {
            System.out.println("Música cadastrada com sucesso!");
            Musica m = new Musica(nome, genero);
            dados.adicionarMusica(m);
            return true;
        }
    }

    public Boolean removerMusica(int idx) {
        String nome = dados.getMusicas()[idx].getNome();

        for(int i = 0; i < dados.getQtdMusicas(); i++) {
            if(dados.getMusicas()[i].getNome().equals(nome)) {
                dados.getMusicas()[i] = null;
                dados.setQtdMusicas(dados.getQtdMusicas() - 1);
                return true;
            }
        }

        return false;
    }

    public Boolean editarMusica(int idx, String nomeNovo, String genero) {
        String nomeAntigo = dados.getMusicas()[idx].getNome();

        for(int i = 0; i < dados.getQtdMusicas(); i++) {
            if(dados.getMusicas()[i].getNome().equals(nomeAntigo)) {
                dados.getMusicas()[i].setNome(nomeNovo);
                dados.getMusicas()[i].setGenero(genero);
                return true;
            }
        }

        return false;
    }

    /*
     * CRUD de Letras
     */
    public boolean adicionarLetra(String corpoOriginal, String corpoTraduzido) {
        int count = 0;

        for(int i = 0; i < dados.getQtdLetras(); i++) {
            boolean verif = dados.getLetras()[i].getCorpoOriginal().equals(corpoOriginal);

            if(verif) {
                count++;
            }
        }

        if(count >= 1) {
            System.out.println("Letra já cadastrada!");
            return false;
        } else {
            System.out.println("Letra cadastrada com sucesso!");
            LetraDeMusica l = new LetraDeMusica(corpoOriginal, corpoTraduzido);
            dados.adicionarLetra(l);
            return true;
        }
    }

    public Boolean removerLetra(int idx) {
        String nome = dados.getLetras()[idx].getCorpoOriginal();

        for(int i = 0; i < dados.getQtdLetras(); i++) {
            if(dados.getLetras()[i].getCorpoOriginal().equals(nome)) {
                dados.getLetras()[i] = null;
                dados.setQtdLetras(dados.getQtdLetras() - 1);
                return true;
            }
        }

        return false;
    }

    public Boolean editarLetra(int idx, String corpoOriginalNovo, String corpoTraduzidoNovo) {
        String corpoOriginalAntigo = dados.getLetras()[idx].getCorpoOriginal();

        for(int i = 0; i < dados.getQtdLetras(); i++) {
            if(dados.getLetras()[i].getCorpoOriginal().equals(corpoOriginalAntigo)) {
                dados.getLetras()[i].setCorpoOriginal(corpoOriginalNovo);
                dados.getLetras()[i].setCorpoTraduzido(corpoTraduzidoNovo);
                return true;
            }
        }
        
        return false;
    }

    /*
     * CRUD de Album
     */

    public boolean adicionarAlbum(String nome, ArrayList<Musica> musicas, ArrayList<String> artistas) {
        int count = 0;

        for(int i = 0; i < dados.getQtdAlbuns(); i++) {
            boolean verif = dados.getAlbuns()[i].getNome().equals(nome);

            if(verif) {
                count++;
            }
        }

        if(count >= 1) {
            System.out.println("Album já cadastrado!");
            return false;
        } else {
            System.out.println("Album cadastrado com sucesso!");
            Album a = new Album(nome, musicas.size(), musicas, artistas);
            dados.adicionarAlbum(a);
            return true;
        }
    }

    public boolean removarAlbum(int idx) {
        String nome = dados.getAlbuns()[idx].getNome();

        for(int i = 0; i < dados.getQtdAlbuns(); i++) {
            if(dados.getAlbuns()[i].getNome().equals(nome)) {
                dados.getAlbuns()[i] = null;
                dados.setQtdAlbuns(dados.getQtdAlbuns() - 1);
                return true;
            }
        }

        return false;
    }

    public boolean editarAlbum(int idx, String nomeNovo, ArrayList<Musica> musicas, ArrayList<String> artistas) {
        String nomeAntigo = dados.getAlbuns()[idx].getNome();

        for(int i = 0; i < dados.getQtdAlbuns(); i++) {
            if(dados.getAlbuns()[i].getNome().equals(nomeAntigo)) {
                dados.getAlbuns()[i].setNome(nomeNovo);
                dados.getAlbuns()[i].setMusicas(musicas);
                dados.getAlbuns()[i].setQtdMusica(musicas.size());
                dados.getAlbuns()[i].setArtistaNome(artistas);
                return true;
            }
        }

        return false;
    }

    /*
     * CRUD de Playlist
     */

    public boolean adicionarPlaylist(String nome, ArrayList<Musica> musicas) {
        int count = 0;

        for(int i = 0; i < dados.getQtdPlaylists(); i++) {
            boolean verif = dados.getPlaylists()[i].getNome().equals(nome);

            if(verif) { count++; } 
        }

        if(count >= 1) {
            System.out.println("Playlist já cadastrada!");
            return false;
        } else {
            System.out.println("Playlist cadastrada com sucesso!");
            Playlist p = new Playlist(nome, musicas.size(), musicas);
            dados.adicionarPlaylist(p);
            return true;
        }
    }

    public boolean removerPlaylist(int idx) {
        String nome = dados.getPlaylists()[idx].getNome();

        for(int i = 0; i < dados.getQtdPlaylists(); i++) {
            if(dados.getPlaylists()[i].getNome().equals(nome)) {
                dados.getPlaylists()[i] = null;
                dados.setQtdPlaylists(dados.getQtdPlaylists() - 1);
                return true;
            }
        }

        return false;
    }

    public boolean editarPlaylist(int idx, String nomeNovo, ArrayList<Musica> musicas) {
        String nomeAntigo = dados.getPlaylists()[idx].getNome();

        for(int i = 0; i < dados.getQtdPlaylists(); i++) {
            if(dados.getPlaylists()[i].getNome().equals(nomeAntigo)) {
                dados.getPlaylists()[i].setNome(nomeNovo);
                dados.getPlaylists()[i].setMusicas(musicas);
                dados.getPlaylists()[i].setQtdMusica(musicas.size());
                return true;
            }
        }

        return false;
    }


    /*
     * Teste
     */
    public static void main(String[] args) {
        ControleDados cd = new ControleDados();
        ArrayList<String> generos = new ArrayList<String>();
        ArrayList<Musica> musicas = new ArrayList<Musica>();

        cd.dados.EncherDados();

        ArrayList<Artista> artistas = new ArrayList<Artista>();
        artistas.add(new Artista("Artista 1", generos, musicas));

        Artista artista = new Artista("!1##!2", generos, musicas);
        Artista artista2 = new Artista("!@#$2", generos, musicas);

        cd.adicionarArtista("Artista 0", generos, musicas);
        cd.adicionarArtista("!@#$@!", generos, musicas);

        cd.editarArtista(4, "Artista 37", generos, musicas);


        var ca = new ControleArtista(cd).getNomeArtista();
        System.out.println("--------------------");
        System.out.println(ca);
        
        cd.removerArtista(5);

        ca = new ControleArtista(cd).getNomeArtista();
        System.out.println("--------------------");
        System.out.println(ca);

        //cd.adicionarArtista("Artista 34", generos, musicas);
        cd.editarArtista(4, "Artista 87", generos, musicas);
        //System.out.println(cd.getArtistas());
    }

}