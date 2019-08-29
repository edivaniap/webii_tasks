package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

public class Estoque {
	private BigDecimal qtdAtual;
	private Almoxarifado almoxarifado;
	private LoteMaterial lote;
	private Material material;
	private BigDecimal qtdMaxima;
	private List<MovimentacaoEstoque> historicoMovimentacoes;
	private TipoEstoque tipoEstoque;
	
	public Estoque() {	}
	
	public Estoque(BigDecimal qtdAtual, Almoxarifado almoxarifado,
			LoteMaterial lote, Material material, BigDecimal qtdMaxima,
			List<MovimentacaoEstoque> historicoMovimentacoes,
			TipoEstoque tipoEstoque) {
		this.qtdAtual = qtdAtual;
		this.almoxarifado = almoxarifado;
		this.lote = lote;
		this.material = material;
		this.qtdMaxima = qtdMaxima;
		this.historicoMovimentacoes = historicoMovimentacoes;
		this.tipoEstoque = tipoEstoque;
	}

	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(BigDecimal qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}

	public List<MovimentacaoEstoque> getHistoricoMovimentacoes() {
		return historicoMovimentacoes;
	}

	public void setHistoricoMovimentacoes(
			List<MovimentacaoEstoque> historicoMovimentacoes) {
		this.historicoMovimentacoes = historicoMovimentacoes;
	}

	public TipoEstoque getTipoEstoque() {
		return tipoEstoque;
	}

	public void setTipoEstoque(TipoEstoque tipoEstoque) {
		this.tipoEstoque = tipoEstoque;
	}

	@Override
	public String toString() {
		return "Estoque [tipoEstoque=" + tipoEstoque + "]";
	}
	
}
