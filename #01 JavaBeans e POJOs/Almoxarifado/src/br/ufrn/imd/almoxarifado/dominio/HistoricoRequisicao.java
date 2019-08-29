package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;

public class HistoricoRequisicao {
	private Date dataRegistro;
	private StatusRequisicao status;
	private Usuario usuario;
	private String observacoes;
	private SaidaRequisicaoInterna saidaRequisicaoInterna;
	public HistoricoRequisicao(Date dataRegistro, StatusRequisicao status,
			Usuario usuario, String observacoes,
			SaidaRequisicaoInterna saidaRequisicaoInterna) {
		super();
		this.dataRegistro = dataRegistro;
		this.status = status;
		this.usuario = usuario;
		this.observacoes = observacoes;
		this.saidaRequisicaoInterna = saidaRequisicaoInterna;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public StatusRequisicao getStatus() {
		return status;
	}
	public void setStatus(StatusRequisicao status) {
		this.status = status;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public SaidaRequisicaoInterna getSaidaRequisicaoInterna() {
		return saidaRequisicaoInterna;
	}
	public void setSaidaRequisicaoInterna(
			SaidaRequisicaoInterna saidaRequisicaoInterna) {
		this.saidaRequisicaoInterna = saidaRequisicaoInterna;
	}
}
