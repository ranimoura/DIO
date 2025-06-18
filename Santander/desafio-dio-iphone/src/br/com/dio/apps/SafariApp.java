package br.com.dio.apps;

import br.com.dio.utils.Browser;

public class SafariApp implements Browser {

	@Override
	public void displayPage(String url, String referenceName) {
		System.out.println("Exibindo página: " + referenceName + "\nURL: " + url);

	}

	@Override
	public void reloadPage() {
		// Apenas para efeito de simulação
		System.out.println("Página atualizada com sucesso!");

	}

	@Override
	public void addNewTab() {
		// Apenas para efeito de simulação
		System.out.println("Nova aba adicionada!");

	}

}
