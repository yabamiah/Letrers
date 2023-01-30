package modelo;

import java.util.ArrayList;

/**
 * Classe Dados simula o comportamento de um banco de dados
 * 
 * @author Maria Alice Bernardo da Costa Silva
 * @author Vinicius Mendes Martins
 */

public class Dados {
	private ArrayList<Artista> artistas = new ArrayList<Artista>();
	private int qtdArtistas = 10;
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private int qtdUsuarios = 0;
	private ArrayList<Musica> musicas = new ArrayList<Musica>();
	private int qtdMusicas = 0;
	private ArrayList<LetraDeMusica> letras = new ArrayList<LetraDeMusica>();
	private int qtdLetras = 0;
	private ArrayList<Playlist> playlists = new ArrayList<Playlist>();
	private int qtdPlaylists = 0;

	/**
	 * Preenche as classes Artista, Usuario, Musica, LetraDeMusica e Playlist com
	 * valores iniciais, para a apresentação do trabalho
	 */

	public void EncherDados() {
		
		for (int i = 0; i < 5; i++) {
			Usuario usuario = new Usuario("Usuario " + i);
			LetraDeMusica letra = new LetraDeMusica("CorpoOriginal " + i, "CorpoTraduzido " + i);
			Musica musica = new Musica("Musica " + i, letra);
			Playlist playlist = new Playlist("Playlist " + i, i, new ArrayList<Musica>());

			usuarios.add(usuario);
			musicas.add(musica);
			letras.add(letra);
			playlists.add(playlist);
		}
		
		for (int i = 0; i < 5; i++) {
			Artista artista = new Artista("Artista " + i, musicas);
			artistas.add(artista);
		}
	}

	/**
	 * Gets, sets e adicionar Artista
	 * 
	 * @return artistas
	 */

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

	/**
	 * Gets, sets quantidade de Artistas.
	 * 
	 * @return qtdArtistas
	 */

	public int getQtdArtistas() {
		qtdArtistas = this.artistas.size();
		return qtdArtistas;
	}

	public void setQtdArtistas(int qtdArtistas) {
		this.qtdArtistas = qtdArtistas;
	}

	/**
	 * Gets, sets e adicionar Usuario.
	 * 
	 * @return usuarios
	 */

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void adicionarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	/**
	 * Gets, sets quantidade de Usuarios.
	 * 
	 * @return qtdUsuarios
	 */

	public int getQtdUsuarios() {
		this.qtdUsuarios = usuarios.size();
		return qtdUsuarios;
	}

	public void setQtdUsuarios(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}

	/**
	 * Gets, sets e adicionar Musica.
	 * 
	 * @return musicas
	 */

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}

	/*public void adicionarMusica(Musica musica) {
		this.musicas.add(musica);
		qtdMusicas++;
	}*/

	/**
	 * Gets, sets quantidade de Musicas.
	 * 
	 * @return qtdMusicas
	 */

	public int getQtdMusicas() {
		this.qtdMusicas = musicas.size();
		return qtdMusicas;
	}

	public void setQtdMusicas(int qtdMusicas) {
		this.qtdMusicas = qtdMusicas;
	}

	/**
	 * Gets, sets e adicionar LetraDeMusica.
	 * 
	 * @return letras
	 */

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

	/**
	 * Gets, sets quantidade de letras.
	 * 
	 * @return qtdLetras
	 */

	public int getQtdLetras() {
		qtdLetras = letras.size();
		return qtdLetras;
	}

	public void setQtdLetras(int qtdLetras) {
		this.qtdLetras = qtdLetras;
	}

	/**
	 * Gets, sets e adicionar Playlist.
	 * 
	 * @return playlists
	 */

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

	/**
	 * Gets, sets quantidade de playlists.
	 * 
	 * @return qtdPlaylists
	 */

	public int getQtdPlaylists() {
		this.qtdPlaylists = playlists.size();
		return qtdPlaylists;
	}

	public void setQtdPlaylists(int qtdPlaylists) {
		this.qtdPlaylists = qtdPlaylists;
	}
}
