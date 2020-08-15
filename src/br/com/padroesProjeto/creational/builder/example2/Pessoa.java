package br.com.padroesProjeto.creational.builder.example2;

public class Pessoa {

	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	
	public Pessoa(Builder builder) {
		this.nome = builder.nome;
		this.telefone = builder.telefone;
		this.endereco = builder.endereco;
		this.cpf = builder.cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static class Builder {
		
		//Obrigatório
		private String nome;
		
		//Opcional
		private String telefone;
		private String endereco;
		private String cpf;
		
		Builder(String nome) {
			this.nome = nome;
		}
		
		public Builder setTelefone(String telefone) {
			this.telefone = telefone;
			return this;
		}

		public Builder setEndereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public Builder setCpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public Pessoa build() {
			return new Pessoa(this);
		}
	}
}
