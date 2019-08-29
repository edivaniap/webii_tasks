package br.ufrn.imd.almoxarifado.dominio;

public class PesagemVolume {
	private double peso;

	public PesagemVolume() {
		this.peso = 0.0;
	}
	
	public PesagemVolume(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
