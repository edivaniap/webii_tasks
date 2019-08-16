package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;

public class EntradaEstoque {
	private String coodigo;
	private List<MovimentacaoEntada> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private Usuario responsavel;
	private Date dataCriacao;
	private Date dataEntrada;
	private List<Documento> anexos;
	private boolean precisaConferenciaEstado;
	private boolean precisaPassagem;
	private boolean precisaAnalise;
	private NotaFiscal notaFiscal;
	private ChecklistRecebimentoComum checklistRecebimentoComum;
	private ConferenciaPesagem conferenciaPesagem;
	private ChecklistTransferencia checklistTransferencia;
	private String justificativa;
	private TipoEntrada tipoEntrada;
	
	public EntradaEstoque() { }
	
	
	public EntradaEstoque(String coodigo, List<MovimentacaoEntada> itens, StatusMovimentacao status, String observacoes,
			Usuario responsavel, Date dataCriacao, Date dataEntrada, List<Documento> anexos,
			boolean precisaConferenciaEstado, boolean precisaPassagem, boolean precisaAnalise, NotaFiscal notaFiscal,
			ChecklistRecebimentoComum checklistRecebimentoComum, ConferenciaPesagem conferenciaPesagem,
			ChecklistTransferencia checklistTransferencia, String justificativa, TipoEntrada tipoEntrada) {
		this.coodigo = coodigo;
		this.itens = itens;
		this.status = status;
		this.observacoes = observacoes;
		this.responsavel = responsavel;
		this.dataCriacao = dataCriacao;
		this.dataEntrada = dataEntrada;
		this.anexos = anexos;
		this.precisaConferenciaEstado = precisaConferenciaEstado;
		this.precisaPassagem = precisaPassagem;
		this.precisaAnalise = precisaAnalise;
		this.notaFiscal = notaFiscal;
		this.checklistRecebimentoComum = checklistRecebimentoComum;
		this.conferenciaPesagem = conferenciaPesagem;
		this.checklistTransferencia = checklistTransferencia;
		this.justificativa = justificativa;
		this.tipoEntrada = tipoEntrada;
	}

	public ConferenciaPesagem getConferenciaPesagem() {
		return conferenciaPesagem;
	}


	public void setConferenciaPesagem(ConferenciaPesagem conferenciaPesagem) {
		this.conferenciaPesagem = conferenciaPesagem;
	}

	public String getCoodigo() {
		return coodigo;
	}

	public void setCoodigo(String coodigo) {
		this.coodigo = coodigo;
	}

	public List<MovimentacaoEntada> getItens() {
		return itens;
	}

	public void setItens(List<MovimentacaoEntada> itens) {
		this.itens = itens;
	}

	public StatusMovimentacao getStatus() {
		return status;
	}

	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public List<Documento> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}

	public boolean isPrecisaConferenciaEstado() {
		return precisaConferenciaEstado;
	}

	public void setPrecisaConferenciaEstado(boolean precisaConferenciaEstado) {
		this.precisaConferenciaEstado = precisaConferenciaEstado;
	}

	public boolean isPrecisaPassagem() {
		return precisaPassagem;
	}

	public void setPrecisaPassagem(boolean precisaPassagem) {
		this.precisaPassagem = precisaPassagem;
	}

	public boolean isPrecisaAnalise() {
		return precisaAnalise;
	}

	public void setPrecisaAnalise(boolean precisaAnalise) {
		this.precisaAnalise = precisaAnalise;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public ChecklistRecebimentoComum getChecklistRecebimentoComum() {
		return checklistRecebimentoComum;
	}

	public void setChecklistRecebimentoComum(ChecklistRecebimentoComum checklistRecebimentoComum) {
		this.checklistRecebimentoComum = checklistRecebimentoComum;
	}

	public ChecklistTransferencia getChecklistTransferencia() {
		return checklistTransferencia;
	}

	public void setChecklistTransferencia(ChecklistTransferencia checklistTransferencia) {
		this.checklistTransferencia = checklistTransferencia;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
}
