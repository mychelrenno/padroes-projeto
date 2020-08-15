package br.com.padroesProjeto.structural.bridge;

public abstract class Professor{
	
	protected Implementador imp = new ProfessorImplGraduacao();
	
	protected Professor(Implementador imp){
		this.imp = imp;
	}
	
	public abstract void op();
}
