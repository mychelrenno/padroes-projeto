package br.com.padroesProjeto.creational.builder.example2;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa.Builder("Mychel").setEndereco("Endere�o teste n�mero 123").build();
		
		System.out.println(p.getNome());
		System.out.println(p.getEndereco());

	}

}
