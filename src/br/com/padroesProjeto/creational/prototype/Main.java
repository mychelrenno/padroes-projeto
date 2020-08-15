package br.com.padroesProjeto.creational.prototype;

public class Main {

	public static void main(String[] args) {
		//Carregar os diferentes tipos de notas musicais
		Partitura.carregaNotas();

		//Compor a canção
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Mi").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Re").desenha();
	}

}
