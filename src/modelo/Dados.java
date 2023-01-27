package modelo;

import java.util.ArrayList;

public class Dados {
    private ArrayList<Artista> artistas = new ArrayList<Artista>();
    private int qtdArtistas = 10;
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private int qtdUsuarios = 0;
    private ArrayList<Musica> musicas = new ArrayList<Musica>();
    private int qtdMusicas = 0;
    private ArrayList<LetraDeMusica> letras = new ArrayList<LetraDeMusica>();
    private int qtdLetras = 0;
    private ArrayList<Album> albuns = new ArrayList<Album>();
    private int qtdAlbuns = 0;
    private ArrayList<Playlist> playlists = new ArrayList<Playlist>();
    private int qtdPlaylists = 0;

    public void EncherDados() {
        for(int i =0; i < 5; i++) {
            Artista artista = new Artista("Artista " + i, new ArrayList<String>(), new ArrayList<Musica>());
            Usuario usuario = new Usuario("Usuario " + i);
            Musica musica = new Musica("Musica " + i, "Genero " + i, new LetraDeMusica("", ""));
            LetraDeMusica letra = new LetraDeMusica("CorpoOriginal " + i, "CorpoTraduzido " + i);
            Album album = new Album("Album " + i, i, new ArrayList<Musica>(), new ArrayList<String>());
            Playlist playlist = new Playlist("Playlist " + i, i, new ArrayList<Musica>());            

            artistas.add(artista);
            usuarios.add(usuario);
            musicas.add(musica);
            letras.add(letra);
            albuns.add(album);
            playlists.add(playlist);
        }
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public void adicionarArtista(Artista artista) {
        this.artistas.add(artista);
        qtdArtistas++;
    }

    public int getQtdArtistas() {
        qtdArtistas = this.artistas.size();
        return qtdArtistas;
    }

    public void setQtdArtistas(int qtdArtistas) {
        this.qtdArtistas = qtdArtistas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public int getQtdUsuarios() {
        this.qtdUsuarios = usuarios.size();
        return qtdUsuarios;
    }

    public void setQtdUsuarios(int qtdUsuarios) {
        this.qtdUsuarios = qtdUsuarios;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
        qtdMusicas++;
    }

    public int getQtdMusicas() {
        this.qtdMusicas = musicas.size();
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public ArrayList<LetraDeMusica> getLetras() {
        return letras;
    }

    public void setLetras(ArrayList<LetraDeMusica> letras) {
        this.letras = letras;
    }

    public void adicionarLetra(LetraDeMusica letra) {
        this.letras.add(letra);
        qtdLetras++;
    }

    public int getQtdLetras() {
        qtdLetras = letras.size();
        return qtdLetras;
    }

    public void setQtdLetras(int qtdLetras) {
        this.qtdLetras = qtdLetras;
    }

    public ArrayList<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(ArrayList<Album> albuns) {
        this.albuns = albuns;
    }

    public void adicionarAlbum(Album album) {
        this.albuns.add(album);
        qtdAlbuns++;
    }

    public int getQtdAlbuns() {
        qtdAlbuns = albuns.size();
        return qtdAlbuns;
    }

    public void setQtdAlbuns(int qtdAlbuns) {
        this.qtdAlbuns = qtdAlbuns;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public void adicionarPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
        qtdPlaylists++;
    }

    public int getQtdPlaylists() {
        this.qtdPlaylists = playlists.size();
        return qtdPlaylists;
    }

    public void setQtdPlaylists(int qtdPlaylists) {
        this.qtdPlaylists = qtdPlaylists;
    }
}
