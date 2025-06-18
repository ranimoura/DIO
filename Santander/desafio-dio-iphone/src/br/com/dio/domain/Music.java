package br.com.dio.domain;

public class Music {

	private String name;
	private String musicalGenre;
	private String musicalGroup;

	public Music() {

	}

	public Music(String name, String musicalGenre, String musicalGroup) {
		this.name = name;
		this.musicalGenre = musicalGenre;
		this.musicalGroup = musicalGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMusicalGenre() {
		return musicalGenre;
	}

	public void setMusicalGenre(String musicalGenre) {
		this.musicalGenre = musicalGenre;
	}

	public String getMusicalGroup() {
		return musicalGroup;
	}

	public void setMusicalGroup(String musicalGroup) {
		this.musicalGroup = musicalGroup;
	}

}
