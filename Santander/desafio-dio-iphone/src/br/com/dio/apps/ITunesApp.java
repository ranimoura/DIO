package br.com.dio.apps;

import java.util.ArrayList;
import java.util.List;

import br.com.dio.domain.Music;
import br.com.dio.utils.MusicPlayer;

public class ITunesApp implements MusicPlayer {

	private List<Music> musics = new ArrayList<>();
	private Music currentMusic = null;
	
	public ITunesApp() {
		
	}

	public ITunesApp(List<Music> musics) {
		this.musics = musics;
	}
	
	public List<Music> getMusics() {
		return musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	

	public void addMusic(Music music) {
		musics.add(music);
	}

	public boolean deleteContatc(String name) {
		return musics.removeIf(music -> music.getName().equals(name));
	}

	public List<Music> getAllMusics() {
		return new ArrayList<>(musics); // RETORNA UMA CÓPIA DA LISTA DE MÚSICAS PRINCIPAL
	}

	
	
	// MÉTODOS DA INTERFACE MUSIC PLAYER:

	@Override
	public void toPlay(Music music) {
		System.out.println("Tocando: " + music.getName() + "\nBanda: " + music.getMusicalGroup() + "\nGênero musical: "
				+ music.getMusicalGenre());
		this.currentMusic = music;

	}

	@Override
	public void toPause(boolean paused) {
		if (paused) {
			System.out.println("Música " + this.currentMusic.getName() + " foi pausada!");
		}
	}

	@Override
	public Music selectMusic(String name) {

		for (Music music : musics) {
			if (music.getName().equals(name)) {
				return music;
			}
		}
		System.out.println("Música não encontrada!");
		return null;

	}

}
