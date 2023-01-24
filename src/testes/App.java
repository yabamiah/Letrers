package testes; //coloquei na package testes porque o eclipse tava exigindo um package

import modelo.*;
import java.util.*;

public class App {
	
	public static void main(String[] args) throws Exception {
		
		Usuario Selena = new Usuario("Selena");
		// Acho que para criar uma música, será necessário criar um artista primeiro
		//Musica ForaDaCasinha = new Musica("ForaDaCasinha", "Pop", 1);
		//Musica cachorroPrego = new Musica("tomaLheCachorro", "rock paulera", 0 );
		
		Playlist Catarina = Selena.criarPlaylist("catarina");
		// Acho que para criar uma letra de música, será necessário criar uma música primeiro
		//LetraDeMusica foraDaCasinhaLetra = new LetraDeMusica("Fora da Casinha, fora da casinha", "Out of the little house");
		
		ArrayList<Musica> manoelGomes = new ArrayList<Musica>();
		Catarina.setMusicas(manoelGomes); 
		//Catarina.adicionarEmPlaylist(cachorroPrego); // Um problema, so consigo usar se passar algum ArrayList

		ArrayList<String> artistas = new ArrayList<String>();
		artistas.add("Manoel Gomes");
		//Catarina.adicionarEmPlaylist(ForaDaCasinha);

		Album ManoelGomes = new Album("Olha se você ainda me ama", 5, manoelGomes, artistas);
		
		ArrayList<String> generos = new ArrayList<String>();
		Artista Justin = new Artista("Justin", generos, manoelGomes);

		LetraDeMusica seMeAma = new LetraDeMusica("Se você não me ama, não me ligue, não fique me fazendo queixa", "If you dont love me, dont call me, dont stay with me");
		System.out.println(seMeAma.toString());
		
		//Prints
		//System.out.println(ForaDaCasinha.getNome()); //teste de Musica
		//System.out.println(Selena.getNome()); //teste de Usuário
		//System.out.println(Catarina.getNome()); //teste de Playlist
		//System.out.println(ForaDaCasinhaLetra.getCorpoOriginal()); //teste de Letra de Musica
		//System.out.println(ManoelGomes.getNome()); //teste de Album
		//System.out.println(Justin.getNome()); //teste de Artista
		System.out.println(Justin.toString());
		//System.out.println(ForaDaCasinha.toString());
		System.out.println(Catarina.toString());
		System.out.println(ManoelGomes.toString());
    }
}
