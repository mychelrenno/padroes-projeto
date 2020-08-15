package br.com.padroesProjeto.structural.adapter;

public class TomadaAmericana extends Tomada<PlugAmericano> {

	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
	
	public String getNomeRede() {
		return "tomada americana";
	}
}
