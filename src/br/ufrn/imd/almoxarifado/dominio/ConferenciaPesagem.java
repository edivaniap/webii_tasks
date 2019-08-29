package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;

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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public int getNumeroVolumes() {
		return numeroVolumes;
	}

	public void setNumeroVolumes(int numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}

	public double getTaraKg() {
		return taraKg;
	}

	public void setTaraKg(double taraKg) {
		this.taraKg = taraKg;
	}

	public int getPesoVolumes() {
		return pesoVolumes;
	}

	public void setPesoVolumes(int pesoVolumes) {
		this.pesoVolumes = pesoVolumes;
	}

	public boolean isExecutado() {
		return executado;
	}

	public void setExecutado(boolean executado) {
		this.executado = executado;
	}

	public boolean isConferido() {
		return conferido;
	}

	public void setConferido(boolean conferido) {
		this.conferido = conferido;
	}

	@Override
	public String toString() {
		return "ConferenciaPesagem [data=" + data + ", lote=" + lote + ", numeroVolumes=" + numeroVolumes + ", taraKg="
				+ taraKg + ", pesoVolumes=" + pesoVolumes + ", executado=" + executado + ", conferido=" + conferido
				+ "]";
	}
}
