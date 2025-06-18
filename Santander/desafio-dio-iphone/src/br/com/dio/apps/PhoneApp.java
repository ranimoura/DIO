package br.com.dio.apps;

import java.util.ArrayList;
import java.util.List;

import br.com.dio.domain.Contact;
import br.com.dio.utils.Phone;

public class PhoneApp implements Phone {

	private List<Contact> contacts = new ArrayList<>();
	
	public PhoneApp() {
		
	}
	
	public PhoneApp(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}



	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	public Contact getContactByName(String name) {
		for (Contact contact : contacts) {
			if (contact.getName().equals(name)) {
				return contact;
			}
		}
		return null; // CONTATO NÃO ENCONTRADO!
	}

	public List<Contact> getAllContacts() {
		return new ArrayList<>(contacts); // RETORNA UMA CÓPIA DA LISTA DE CONTATOS PRINCIPAL
	}

	public boolean updateContact(Contact contact) {
		for (int i = 0; i < contacts.size(); i++) {
			Contact current = contacts.get(i);
			if (current.getName().equals(contact.getName())) {
				contacts.set(i, contact);
				return true;
			}
		}
		return false; // CONTATO NÃO ENCONTRADO!
	}

	public boolean deleteContatc(String name) {
		return contacts.removeIf(contact -> contact.getName().equals(name));
	}

	
	
	// MÉTODOS DA INTERFACE PHONE:

	@Override
	public void toCall(Contact contact) {
		System.out.println("Ligando para: " + contact.getName() + "\nNúmero: " + contact.getPhoneNumber());

	}

	@Override
	public void toAtend(boolean atended) {

		if (atended) {
			System.out.println("Ligação atendida.");
		} else {
			System.out.println("Ligação não atendida.");

			startVoicemail();
		}

	}

	@Override
	public void startVoicemail() {
		System.out.println("Iniciando correio de voz");

	}

}
