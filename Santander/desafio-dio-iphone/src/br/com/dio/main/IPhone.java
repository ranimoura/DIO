package br.com.dio.main;

import br.com.dio.apps.ITunesApp;
import br.com.dio.apps.PhoneApp;
import br.com.dio.apps.SafariApp;
import br.com.dio.domain.Contact;
import br.com.dio.domain.Music;
import br.com.dio.utils.Browser;
import br.com.dio.utils.MusicPlayer;
import br.com.dio.utils.Phone;

public class IPhone {

	public static void main(String[] args) {

		MusicPlayer iTunes = new ITunesApp();
		Phone phone = new PhoneApp();
		Browser safari = new SafariApp();

		System.out.println("---------- TESTS PHONE ----------");
		phone.toCall(new Contact("Raniere", "84-9999-9999"));
		phone.toAtend(false);
		System.out.println("");

		System.out.println("---------- TESTS SAFARI ----------");
		safari.displayPage("google.com.br", "Site oficial da Google");
		safari.reloadPage();
		safari.addNewTab();
		System.out.println("");

		System.out.println("---------- TESTS ITUNES ----------");
		iTunes.toPlay(new Music("O show tem que continuar", "Samba", "Fundo de Quintal"));
		iTunes.toPause(true);

	}

}
