package br.com.padroesProjeto.structural.bridge;

public abstract class Professor{
	
	protected Implementador imp = null;
	
	private Professor(){
	}
	
	protected Professor(Implementador imp){
		this.imp = imp;
	}
	
	public abstract void op();
}
