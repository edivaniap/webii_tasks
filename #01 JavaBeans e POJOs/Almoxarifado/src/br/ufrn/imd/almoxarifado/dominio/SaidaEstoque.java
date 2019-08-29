package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.almoxarifado.dominio.rh.PessoaJuridica;

public class SaidaEstoque {
	private Usuario usuario;
	private Date dataEnvio;
	private Date dataCriacao;
	private List<MovimentacaoSaida> movimentacoesSaida;
	private StatusMovimentacao statusMovimentacao;
	private String observacoes;
	private PessoaJuridica transportadora;
	private List<Documento> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestinatario;
	private String justificativa;
	private TipoSaida tipoSaida;
	private SaidaRequisicaoInterna saidaRequisicaoInterna;
	
	public SaidaEstoque() {}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<MovimentacaoSaida> getMovimentacoesSaida() {
		return movimentacoesSaida;
	}

	public void setMovimentacoesSaida(List<MovimentacaoSaida> movimentacoesSaida) {
		this.movimentacoesSaida = movimentacoesSaida;
	}

	public StatusMovimentacao getStatusMovimentacao() {
		return statusMovimentacao;
	}

	public void setStatusMovimentacao(StatusMovimentacao statusMovimentacao) {
		this.statusMovimentacao = statusMovimentacao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public PessoaJuridica getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}

	public List<Documento> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}

	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}

	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}

	public PessoaJuridica getPjDestinatario() {
		return pjDestinatario;
	}

	public void setPjDestinatario(PessoaJuridica pjDestinatario) {
		this.pjDestinatario = pjDestinatario;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public TipoSaida getTipoSaida() {
		return tipoSaida;
	}

	public void setTipoSaida(TipoSaida tipoSaida) {
		this.tipoSaida = tipoSaida;
	}

	public SaidaRequisicaoInterna getSaidaRequisicaoInterna() {
		return saidaRequisicaoInterna;
	}

	public void setSaidaRequisicaoInterna(
			SaidaRequisicaoInterna saidaRequisicaoInterna) {
		this.saidaRequisicaoInterna = saidaRequisicaoInterna;
	}
		
}
