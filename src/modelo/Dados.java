package modelo;

import java.util.ArrayList;

public class Dados {
    private ArrayList<Artista> artistas = new ArrayList<Artista>();
    private int qtdArtistas = 0;
    private Usuario[] usuarios = new Usuario[10];
    private int qtdUsuarios = 0;
    private Musica[] musicas = new Musica[10];
    private int qtdMusicas = 0;
    private LetraDeMusica[] letras = new LetraDeMusica[10];
    private int qtdLetras = 0;
    private Album[] albuns = new Album[10];
    private int qtdAlbuns = 0;
    private Playlist[] playlists = new Playlist[10];
    private int qtdPlaylists = 0;

    public void EncherDados() {
        for(int i =0; i < 5; i++) {
            Artista artista = new Artista("Artista " + i, new ArrayList<String>(), new ArrayList<Musica>());
            this.artistas.add(artista);
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
    }

    public int getQtdArtistas() {
        qtdArtistas = this.artistas.size();
        return qtdArtistas;
    }

    public void setQtdArtistas(int qtdArtistas) {
        this.qtdArtistas = qtdArtistas;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios[qtdUsuarios] = usuario;
        qtdUsuarios++;
    }

    public int getQtdUsuarios() {
        this.qtdUsuarios = usuarios.length;
        return qtdUsuarios;
    }

    public void setQtdUsuarios(int qtdUsuarios) {
        this.qtdUsuarios = qtdUsuarios;
    }

    public Musica[] getMusicas() {
        qtdMusicas = musicas.length;
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    public void adicionarMusica(Musica musica) {
        this.musicas[qtdMusicas] = musica;
        qtdMusicas++;
    }

    public int getQtdMusicas() {
        this.qtdMusicas = musicas.length;
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public LetraDeMusica[] getLetras() {
        return letras;
    }

    public void setLetras(LetraDeMusica[] letras) {
        this.letras = letras;
    }

    public void adicionarLetra(LetraDeMusica letra) {
        this.letras[qtdLetras] = letra;
        qtdLetras++;
    }

    public int getQtdLetras() {
        this.qtdLetras = letras.length;
        return qtdLetras;
    }

    public void setQtdLetras(int qtdLetras) {
        this.qtdLetras = qtdLetras;
    }

    public Album[] getAlbuns() {
        return albuns;
    }

    public void setAlbuns(Album[] albuns) {
        this.albuns = albuns;
    }

    public void adicionarAlbum(Album album) {
        this.albuns[qtdAlbuns] = album;
        qtdAlbuns++;
    }

    public int getQtdAlbuns() {
        this.qtdAlbuns = albuns.length;
        return qtdAlbuns;
    }

    public void setQtdAlbuns(int qtdAlbuns) {
        this.qtdAlbuns = qtdAlbuns;
    }

    public Playlist[] getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlist[] playlists) {
        this.playlists = playlists;
    }

    public void adicionarPlaylist(Playlist playlist) {
        this.playlists[qtdPlaylists] = playlist;
        qtdPlaylists++;
    }

    public int getQtdPlaylists() {
        this.qtdPlaylists = playlists.length;
        return qtdPlaylists;
    }

    public void setQtdPlaylists(int qtdPlaylists) {
        this.qtdPlaylists = qtdPlaylists;
    }
}
