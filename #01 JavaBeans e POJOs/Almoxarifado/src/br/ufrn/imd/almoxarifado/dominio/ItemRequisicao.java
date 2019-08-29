package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

public class ItemRequisicao {
	private Material material;
	private BigDecimal qtdRequisitada;
	private BigDecimal qtdAtendida;
	private UnidadeMedida unidadeMedida;
	private SaidaRequisicaoInterna saidaRequisicaoInterna;
	
	public ItemRequisicao() { }
	
	public ItemRequisicao(Material material, BigDecimal qtdRequisitada,
			BigDecimal qtdAtendida, UnidadeMedida unidadeMedida) {
		this.material = material;
		this.qtdRequisitada = qtdRequisitada;
		this.qtdAtendida = qtdAtendida;
		this.unidadeMedida = unidadeMedida;
	}
	
	public ItemRequisicao(Material material, BigDecimal qtdRequisitada,
			BigDecimal qtdAtendida, UnidadeMedida unidadeMedida,
			SaidaRequisicaoInterna saidaRequisicaoInterna) {
		super();
		this.material = material;
		this.qtdRequisitada = qtdRequisitada;
		this.qtdAtendida = qtdAtendida;
		this.unidadeMedida = unidadeMedida;
		this.saidaRequisicaoInterna = saidaRequisicaoInterna;
	}

	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public BigDecimal getQtdRequisitada() {
		return qtdRequisitada;
	}
	public void setQtdRequisitada(BigDecimal qtdRequisitada) {
		this.qtdRequisitada = qtdRequisitada;
	}
	public BigDecimal getQtdAtendida() {
		return qtdAtendida;
	}
	public void setQtdAtendida(BigDecimal qtdAtendida) {
		this.qtdAtendida = qtdAtendida;
	}
	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public SaidaRequisicaoInterna getSaidaRequisicaoInterna() {
		return saidaRequisicaoInterna;
	}

	public void setSaidaRequisicaoInterna(
			SaidaRequisicaoInterna saidaRequisicaoInterna) {
		this.saidaRequisicaoInterna = saidaRequisicaoInterna;
	}
}
