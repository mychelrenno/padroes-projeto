package br.com.padroesProjeto.structural.adapter;

public class TomadaBrasileira extends Tomada<PlugBrasileiro> {
	
	public String conecta(PlugBrasileiro plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
	
	public String getNomeRede() {
		return "tomada brasileira";
	}
}
