package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

public class ReservaMaterial {
	private BigDecimalimal qtd;
	private Material material;
	private Usuario solicitante;
	
	public ReservaMaterial() {	}

	public ReservaMaterial(BigDecimalimal qtd, Material material, Usuario solicitante) {
		this.qtd = qtd;
		this.material = material;
		this.solicitante = solicitante;
	}

	public BigDecimalimal getQtd() {
		return qtd;
	}

	public void setQtd(BigDecimalimal qtd) {
		this.qtd = qtd;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Usuario getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Usuario solicitante) {
		this.solicitante = solicitante;
	}
}
