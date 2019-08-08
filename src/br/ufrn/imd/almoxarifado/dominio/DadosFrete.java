package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;

public class DadosFrete {
	private Date dataSaida;
	private String nomeTransportador;
	private String placaVeiculo;
	private String municipio;
	private String uf;
	private boolean fretePagoporEmitente;
	
	public DadosFrete() {
		this.dataSaida = null;
		this.nomeTransportador = "";
		this.placaVeiculo = "";
		this.municipio = "";
		this.uf = "";
		this.fretePagoporEmitente = false;
	}
	
	public DadosFrete(Date dataSaida, String nomeTransportador, String placaVeiculo, String municipio, String uf,
			boolean fretePagoporEmitente) {
		this.dataSaida = dataSaida;
		this.nomeTransportador = nomeTransportador;
		this.placaVeiculo = placaVeiculo;
		this.municipio = municipio;
		this.uf = uf;
		this.fretePagoporEmitente = fretePagoporEmitente;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getNomeTransportador() {
		return nomeTransportador;
	}

	public void setNomeTransportador(String nomeTransportador) {
		this.nomeTransportador = nomeTransportador;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public boolean isFretePagoporEmitente() {
		return fretePagoporEmitente;
	}

	public void setFretePagoporEmitente(boolean fretePagoporEmitente) {
		this.fretePagoporEmitente = fretePagoporEmitente;
	}

}
