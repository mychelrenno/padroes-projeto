package br.com.padroesProjeto.creation.singleton;

public class MainSingleton {

	public static void main(String[] args) {
		Janela j = Janela.getInstance();
		j.pack();
		j.setVisible(true);
	}
}
