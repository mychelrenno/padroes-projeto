package br.com.padroesProjeto.creational.builder.example1;

public class Cozinha{
	
	public void fazSanduiche(SanduicheBuilder builder){
		builder.abrePao();
		builder.insereIngredientes();
		builder.fechaPao();
	}
}
