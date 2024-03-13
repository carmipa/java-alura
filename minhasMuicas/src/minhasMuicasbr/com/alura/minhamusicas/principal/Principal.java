package minhasMuicasbr.com.alura.minhamusicas.principal;

import java.util.Iterator;

import minhasMuicasbr.com.alura.minhamusicas.modelo.MinhasPreferidas;
import minhasMuicasbr.com.alura.minhamusicas.modelo.Musica;
import minhasMuicasbr.com.alura.minhamusicas.modelo.Podcast;

public class Principal {

	public static void main(String[] args) {
		
		Musica minhaMusica = new Musica();
		
		minhaMusica.setTitulo("Forever");
		minhaMusica.setCantor("Kiss");
		
		for(int i = 0; i < 1000; i++) {
			
			minhaMusica.reproduz();
		}
		
		for(int i = 0; i < 50; i++) {
			
			minhaMusica.curtir();
		}
		
		Podcast meuPodcast = new Podcast();
		
		meuPodcast.setTitulo("BolhaDev");
		meuPodcast.setApresentador("Marcos Mendes");
		
		for(int i = 0; i < 500; i++) {
			
			meuPodcast.reproduz();
		}
		
		for(int i = 0; i < 50; i++) {
			
			meuPodcast.curtir();
		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		
		preferidas.inclui(meuPodcast);
		preferidas.inclui(minhaMusica);
		
		

	}

}
