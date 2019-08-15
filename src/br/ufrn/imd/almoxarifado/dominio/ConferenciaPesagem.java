package br.ufrn.imd.almoxarifado.dominio;

public class ConferenciaPesagem {
	private Date data;
	private LoteMaterial lote;
	private int numeroVolumes;
	private double taraKg;
	private int pesoVolumes;
	private boolean executado;
	private boolean conferido;

	public ConferenciaPesagem() {	}
	
	public ConferenciaPesagem(Date data, LoteMaterial lote, int numeroVolumes,
			double taraKg, int pesoVolumes, boolean executado, boolean conferido) {
		this.data = data;
		this.lote = lote;
		this.numeroVolumes = numeroVolumes;
		this.taraKg = taraKg;
		this.pesoVolumes = pesoVolumes;
		this.executado = executado;
		this.conferido = conferido;
	}

}
