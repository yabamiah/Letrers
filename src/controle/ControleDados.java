package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleDados {
    private Dados dados = new Dados();

    public ControleDados() {
        dados.EncherDados();
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

    public ArrayList<Usuario> getUsuarios() {
        return dados.getUsuarios();
    }

    public int getQtdUsuarios() {
        return dados.getQtdUsuarios();
    }

    public ArrayList<Musica> getMusicas() {
        return dados.getMusicas();
    }

    public int getQtdMusicas() {
        return dados.getQtdMusicas();
    }

    public ArrayList<LetraDeMusica> getLetras() {
        return dados.getLetras();
    }

    public int getQtdLetras() {
        return dados.getQtdLetras();
    }

    public ArrayList<Playlist> getPlaylists() {
        return dados.getPlaylists();
    }

    public int getQtdPlaylists() {
        return dados.getQtdPlaylists();
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

    public int buscarArtista(String nome) {
        for(int i = 0; i < dados.getQtdArtistas(); i++) {
            if(dados.getArtistas().get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    /*
     * CRUD de Uusario
     */
    public boolean adicionarUsuario(String nome, ArrayList<Playlist> playlist) {
        int count = 0;

        for(int i = 0; i < dados.getQtdUsuarios(); i++) {
            boolean verif = dados.getUsuarios().get(i).getNome().equals(nome);

            if(verif) {
                count++;
            }
        }

        if(count >= 1) {
            System.out.println("Usuário já cadastrado!");
            return false;
        } else {
            System.out.println("Usuário cadastrado com sucesso!");
            Usuario a = new Usuario(nome, playlist);
            dados.adicionarUsuario(a);
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

    public int BuscarUsuario(String nome) {
        for(int i = 0; i < dados.getQtdUsuarios(); i++) {
            if(dados.getUsuarios().get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    /*
     * CRUD de Músicas
     */
    public boolean adicionarMusica(String nome, String genero, LetraDeMusica letras) {
        int count = 0;

        for(int i = 0; i < dados.getQtdMusicas(); i++) {
            boolean verif = dados.getMusicas().get(i).getNome().equals(nome);

            if(verif) {
                count++;
            }
        }

        if(count >= 1) {
            System.out.println("Música já cadastrada!");
            return false;
        } else {
            System.out.println("Música cadastrada com sucesso!");
            Musica m = new Musica(nome, genero, letras);
            dados.adicionarMusica(m);
            return true;
        }
    }

    public Boolean removerMusica(int idx) {
        String nome = dados.getMusicas().get(idx).getNome();

        for(int i = 0; i < dados.getQtdMusicas(); i++) {
            if(dados.getMusicas().get(i).getNome().equals(nome)) {
                dados.getMusicas().remove(i);
                dados.setQtdMusicas(dados.getQtdMusicas() - 1);
                return true;
            }
        }

        return false;
    }

    public Boolean editarMusica(int idx, String nomeNovo, String genero) {
        String nomeAntigo = dados.getMusicas().get(idx).getNome();

        for(int i = 0; i < dados.getQtdMusicas(); i++) {
            if(dados.getMusicas().get(i).getNome().equals(nomeAntigo)) {
                dados.getMusicas().get(i).setNome(nomeNovo);
                dados.getMusicas().get(i).setGenero(genero);
                return true;
            }
        }

        return false;
    }

    public int buscarMusica(String nome) {
        for(int i = 0; i < dados.getQtdMusicas(); i++) {
            if(dados.getMusicas().get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    /*
     * CRUD de Letras
     */
    public boolean adicionarLetra(String corpoOriginal, String corpoTraduzido) {
        int count = 0;

        for(int i = 0; i < dados.getQtdLetras(); i++) {
            boolean verif = dados.getLetras().get(i).getCorpoOriginal().equals(corpoOriginal);

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
        String nome = dados.getLetras().get(idx).getCorpoOriginal();

        for(int i = 0; i < dados.getQtdLetras(); i++) {
            if(dados.getLetras().get(i).getCorpoOriginal().equals(nome)) {
                dados.getLetras().remove(i);
                dados.setQtdLetras(dados.getQtdLetras() - 1);
                return true;
            }
        }

        return false;
    }

    public Boolean editarLetra(int idx, String corpoOriginalNovo, String corpoTraduzidoNovo) {
        String corpoOriginalAntigo = dados.getLetras().get(idx).getCorpoOriginal();

        for(int i = 0; i < dados.getQtdLetras(); i++) {
            if(dados.getLetras().get(i).getCorpoOriginal().equals(corpoOriginalAntigo)) {
                dados.getLetras().get(i).setCorpoOriginal(corpoOriginalNovo);
                dados.getLetras().get(i).setCorpoTraduzido(corpoTraduzidoNovo);
                return true;
            }
        }
        
        return false;
    }

    public int buscarLetra(String corpoOriginal) {
        for(int i = 0; i < dados.getQtdLetras(); i++) {
            if(dados.getLetras().get(i).getCorpoOriginal().equals(corpoOriginal)) {
                return i;
            }
        }

        return -1;
    }

    /*
     * CRUD de Playlist
     */

    public boolean adicionarPlaylist(String nome, ArrayList<Musica> musicas) {
        int count = 0;

        for(int i = 0; i < dados.getQtdPlaylists(); i++) {
            boolean verif = dados.getPlaylists().get(i).getNome().equals(nome);

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
        dados.getPlaylists().remove(idx);
        dados.setQtdPlaylists(dados.getQtdPlaylists() - 1);

        return true;
    }

    public boolean editarPlaylist(int idx, String nomeNovo, ArrayList<Musica> musicas) {
        String nomeAntigo = dados.getPlaylists().get(idx).getNome();

        for(int i = 0; i < dados.getQtdPlaylists(); i++) {
            if(dados.getPlaylists().get(i).getNome().equals(nomeAntigo)) {
                dados.getPlaylists().get(i).setNome(nomeNovo);
                dados.getPlaylists().get(i).setMusicas(musicas);
                dados.getPlaylists().get(i).setQtdMusica(musicas.size());
                return true;
            }
        }

        return false;
    }

    public int buscarPlaylist(String nome) {
        for(int i = 0; i < dados.getQtdPlaylists(); i++) {
            if(dados.getPlaylists().get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }
}