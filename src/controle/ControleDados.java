package controle;

import java.util.ArrayList;

import modelo.*;

/**
 * Classe ControleDados que fornece todos os métodos de 
 * criar, editar, deletar e ler
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinícius Mendes Martins
 * 
 */
public class ControleDados {
    private Dados dados = new Dados();

    /**
     * Construtor padrão que instancia uma objeto ControleDados
     */
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

    /**
     * Método responsável por receber os valores de entrada do usuário através da interface gráfica
     * e instanciar um novo artista e logo em seguida amarzenar ele no arraylist da classe Dados.
     * 
     * @param nome Nome do artista
     * @param musicas Musicas do artista
     */
    public boolean adicionarArtista(String nome, ArrayList<Musica> musicas) {
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
            Artista a = new Artista(nome, musicas);
            dados.adicionarArtista(a);
            return true;
        }
    }

    /**
     * Método responsável por receber a posição do artista na JList da interface gráfica
     * e remover o artista do arraylist da classe Dados
     *
     * @param idx Index do artista na JList
     */
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

    /**
     * Método responsável por buscar o index do artista no arraylist da classe Dados
     * a partir do nome dado na interface gráfica pelo usuário
     * 
     * @param nome Nome do artista
     * @return
     */
    public int buscarArtista(String nome) {
        for(int i = 0; i < dados.getQtdArtistas(); i++) {
            if(dados.getArtistas().get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Método responsável por receber os valores de entrada do usuário através da interface gráfica
     * e instanciar um novo usuário e logo em seguida amarzenar ele no arraylist da classe Dados.
     * 
     * @param nome Nome do Usuário
     * @param playlist Objeto playlist
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

    /**
     * Método responsável por receber a posição do usuário na JList da interface gráfica
     * e remover o usuário do arraylist da classe Dados
     * 
     * @param idx Index do usuário no arraylist da classe Dados
     * @return
     */
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

    /**
     * Método responsável por buscar o index do usuário no arraylist da classe Dados
     * a partir do nome dado na interface gráfica pelo usuário
     * 
     * @param nome Nome do usuário
     * @return
     */
    public int BuscarUsuario(String nome) {
        for(int i = 0; i < dados.getQtdUsuarios(); i++) {
            if(dados.getUsuarios().get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Método responsável por receber os valores de entrada do usuário através da interface gráfica
     * e instanciar uma nova música e logo em seguida amarzenar ela no arraylist da classe Dados.
     * 
     * @param nome Nome da música
     * @param letras Letras da musica
     * @return
     */
    public boolean adicionarMusica(String nome, LetraDeMusica letras) {
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
            Musica m = new Musica(nome,letras);
            dados.adicionarMusica(m);
            return true;
        }
    }

    /**
     * Método responsável por receber a posição da música na JList da interface gráfica
     * e remover a música do arraylist da classe Dados
     * 
     * @param idx Index da música na JList
     */
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

    /**
     * Método responsável por buscar o index da música no arraylist da classe Dados
     * a partir do nome dado na interface gráfica pelo usuário
     * 
     * @param nome Nome da música
     */
    public int buscarMusica(String nome) {
        for(int i = 0; i < dados.getQtdMusicas(); i++) {
            if(dados.getMusicas().get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Método responsável por receber os valores de entrada do usuário através da interface gráfica
     * e instanciar uma nova letra e logo em seguida amarzenar ela no arraylist da classe Dados.
     * 
     * @param corpoOriginal Letra original da música
     * @param corpoTraduzido Letra traduzida 
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

    /**
     * Método responsável por buscar o index da letra no arraylist da classe Dados
     * a partir do nome dado na interface gráfica pelo usuário
     * 
     * @param corpoOriginal Letra original da música
     */
    public int buscarLetra(String corpoOriginal) {
        for(int i = 0; i < dados.getQtdLetras(); i++) {
            if(dados.getLetras().get(i).getCorpoOriginal().equals(corpoOriginal)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Método responsável por receber os valores de entrada do usuário através da interface gráfica
     * e instanciar uma nova playlist e logo em seguida amarzenar ela no arraylist da classe Dados.
     * 
     * @param nome Nome da playlist
     * @param musicas Musicas contidas na playlist
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

    /**
     * Método responsável por receber a posição da playlist da interface gráfica
     * e remover a música do arraylist da classe Dados
     * 
     * @param idx Index da playlist na classe Dados
     */
    public boolean removerPlaylist(int idx) {
        dados.getPlaylists().remove(idx);
        dados.setQtdPlaylists(dados.getQtdPlaylists() - 1);

        return true;
    }

    /**
     * Método responsável por buscar o index da playlist no arraylist da classe Dados
     * a partir do nome dado na interface gráfica pelo usuário
     * 
     * @param nome Nome da playlist
     * @return
     */
    public int buscarPlaylist(String nome) {
        for(int i = 0; i < dados.getQtdPlaylists(); i++) {
            if(dados.getPlaylists().get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }
}