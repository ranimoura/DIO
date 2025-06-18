package br.com.dio.utils;

import br.com.dio.domain.Music;

public interface MusicPlayer {

	public void toPlay(Music music);

	public void toPause(boolean paused);

	public Music selectMusic(String name);

}
