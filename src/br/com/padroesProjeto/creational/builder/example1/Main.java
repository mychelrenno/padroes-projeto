package br.com.padroesProjeto.creational.builder.example1;

public class Main {

	public static void main(String[] args) {
		Cozinha cozinha = new Cozinha();
		
		//Builders
		SanduicheBuilder b1 = new HamburguerBuilder();
		SanduicheBuilder b2 = new FishBuilder();
		
		cozinha.fazSanduiche(b2);
		b2.getSanduiche();
	}

}
