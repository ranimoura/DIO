package br.com.dio.utils;

import br.com.dio.domain.Contact;

public interface Phone {

	public void toCall(Contact contact);

	public void toAtend(boolean atended);

	public void startVoicemail();

}
