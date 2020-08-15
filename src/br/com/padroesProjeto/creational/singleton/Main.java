package br.com.padroesProjeto.creational.singleton;

public class Main {

	public static void main(String[] args) {
		Janela j = Janela.getInstance();
		j.pack();
		j.setVisible(true);
	}
}
