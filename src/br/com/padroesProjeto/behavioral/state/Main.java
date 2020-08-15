package br.com.padroesProjeto.behavioral.state;

public class Main {

	public static void main(String[] args) {
		Pato p = new Pato();
		
		//Altera o comportamento de voar
		p.setComportamentoVoar(new NaoVoar());
		
		p.voar();
		p.grasnar();

	}

}
