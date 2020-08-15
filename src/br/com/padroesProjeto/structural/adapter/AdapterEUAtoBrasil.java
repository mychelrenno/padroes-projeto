package br.com.padroesProjeto.structural.adapter;

//Adapter
public class AdapterEUAtoBrasil extends TomadaBrasileira {
	
	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
}
