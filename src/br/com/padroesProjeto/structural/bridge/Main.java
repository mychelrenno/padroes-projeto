package br.com.padroesProjeto.structural.bridge;

public class Main {

	public static void main(String[] args) {
		
		Professor grad = new ProfessorGraduacao(new ProfessorImplGraduacao());
		grad.op();
	}

}