package br.com.padroesProjeto.structural.flyweight;

public class Main {

	public static void main(String[] args) {
		
		Figura f = FiguraFactory.getFigura("linha");
		f.desenha("amarela");
		
		f = FiguraFactory.getFigura("oval n�o preenchida");
		f.desenha("vermelha");
		

	}

}
