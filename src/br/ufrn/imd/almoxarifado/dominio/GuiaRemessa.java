package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;

public class GuiaRemessa {
	private int numeroGuiaRemessa;
	private Date dataEmissao;
	private ViaTransporte viaTransporte;
	private String especieEmbalagem;
	private NaturezaOperacao naturezaOperacao;
	private int remessa;
	private DadosEntrega dadosEntrega;
	private DadosPagamento dadosPagamento;
	private DadosFrete dadosFrete;
	
	public GuiaRemessa() {}
	
	public GuiaRemessa(int numeroGuiaRemessa, Date dataEmissao, ViaTransporte viaTransporte, String especieEmbalagem,
			NaturezaOperacao naturezaOperacao, int remessa, DadosEntrega dadosEntrega, DadosPagamento dadosPagamento,
			DadosFrete dadosFrete) {
		this.numeroGuiaRemessa = numeroGuiaRemessa;
		this.dataEmissao = dataEmissao;
		this.viaTransporte = viaTransporte;
		this.especieEmbalagem = especieEmbalagem;
		this.naturezaOperacao = naturezaOperacao;
		this.remessa = remessa;
		this.dadosEntrega = dadosEntrega;
		this.dadosPagamento = dadosPagamento;
		this.dadosFrete = dadosFrete;
	}

	public int getNumeroGuiaRemessa() {
		return numeroGuiaRemessa;
	}

	public void setNumeroGuiaRemessa(int numeroGuiaRemessa) {
		this.numeroGuiaRemessa = numeroGuiaRemessa;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public ViaTransporte getViaTransporte() {
		return viaTransporte;
	}

	public void setViaTransporte(ViaTransporte viaTransporte) {
		this.viaTransporte = viaTransporte;
	}

	public String getEspecieEmbalagem() {
		return especieEmbalagem;
	}

	public void setEspecieEmbalagem(String especieEmbalagem) {
		this.especieEmbalagem = especieEmbalagem;
	}

	public NaturezaOperacao getNaturezaOperacao() {
		return naturezaOperacao;
	}

	public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}

	public int getRemessa() {
		return remessa;
	}

	public void setRemessa(int remessa) {
		this.remessa = remessa;
	}

	public DadosEntrega getDadosEntrega() {
		return dadosEntrega;
	}

	public void setDadosEntrega(DadosEntrega dadosEntrega) {
		this.dadosEntrega = dadosEntrega;
	}

	public DadosPagamento getDadosPagamento() {
		return dadosPagamento;
	}

	public void setDadosPagamento(DadosPagamento dadosPagamento) {
		this.dadosPagamento = dadosPagamento;
	}

	public DadosFrete getDadosFrete() {
		return dadosFrete;
	}

	public void setDadosFrete(DadosFrete dadosFrete) {
		this.dadosFrete = dadosFrete;
	}
}
