package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

public class DimensaoUnidade {
	private BigDecimal altura;
	private BigDecimal largura;
	private BigDecimal profundidade;
	
	public DimensaoUnidade() {	}

	public DimensaoUnidade(BigDecimal altura, BigDecimal largura,
			BigDecimal profundidade) {
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getLargura() {
		return largura;
	}

	public void setLargura(BigDecimal largura) {
		this.largura = largura;
	}

	public BigDecimal getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(BigDecimal profundidade) {
		this.profundidade = profundidade;
	}

	@Override
	public String toString() {
		return "DimensaoUnidade [altura=" + altura + ", largura=" + largura + ", profundidade=" + profundidade + "]";
	}
}
