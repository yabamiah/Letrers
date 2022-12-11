
import modelo.*;
import java.util.*;

public class App {
	
	public static void main(String[] args) throws Exception {
		
		Usuario Selena = new Usuario(1, "Selena");
		Musica ForaDaCasinha = new Musica("ForaDaCasinha", "Selena",
				"Pop", 1, 1, 1, 1);
		
		Playlist Catarina = Selena.criarPlaylist("catarina");
		LetraDeMusica ForaDaCasinhaLetra = new LetraDeMusica(1, "Fora da Casinha, fora da casinha", "Out of the little house", "Fora da Casinha", "Selena");
		
		ArrayList<Musica> manoelGomes = new ArrayList<Musica>();
		Album ManoelGomes = new Album(1, "Olha se você ainda me ama", 5, manoelGomes, "Manoel Gomes");
		
		ArrayList<String> pop = new ArrayList<String>();
		Artista Justin = new Artista(1, "Justin", 1, pop, manoelGomes);
		
		
		//Prints
		System.out.println(ForaDaCasinha.getNome()); //teste de Musica
		System.out.println(Selena.getNome()); //teste de Usuário
		System.out.println(Catarina.getNome()); //teste de Playlist
		System.out.println(ForaDaCasinhaLetra.getMusicaNome()); //teste de Letra de Musica
		System.out.println(ManoelGomes.getNome()); //teste de Album
		System.out.println(Justin.getNome()); //teste de Artista
    }
}
