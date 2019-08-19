package br.ufrn.imd.almoxarifado.dominio;

import java.io.File;
import java.util.Date;
import java.util.List;

public class EntradaEstoque {
	private String coodigo;
	private List<MovimentacaoEstoque> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private Usuario responsavel;
	private Date dataCriacao;
	private Date dataEntrada;
	private List<File> anexos;
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
	
	
	public EntradaEstoque(String coodigo, List<MovimentacaoEstoque> itens, StatusMovimentacao status, String observacoes,
			Usuario responsavel, Date dataCriacao, Date dataEntrada, List<File> anexos,
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

	public List<MovimentacaoEstoque> getItens() {
		return itens;
	}

	public void setItens(List<MovimentacaoEstoque> itens) {
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

	public List<File> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<File> anexos) {
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


	@Override
	public String toString() {
		return "EntradaEstoque [coodigo=" + coodigo + ", itens=" + itens + ", status=" + status + ", observacoes="
				+ observacoes + ", responsavel=" + responsavel + ", dataCriacao=" + dataCriacao + ", dataEntrada="
				+ dataEntrada + ", anexos=" + anexos + ", precisaConferenciaEstado=" + precisaConferenciaEstado
				+ ", precisaPassagem=" + precisaPassagem + ", precisaAnalise=" + precisaAnalise + ", notaFiscal="
				+ notaFiscal + ", checklistRecebimentoComum=" + checklistRecebimentoComum + ", conferenciaPesagem="
				+ conferenciaPesagem + ", checklistTransferencia=" + checklistTransferencia + ", justificativa="
				+ justificativa + ", tipoEntrada=" + tipoEntrada + "]";
	}
}
