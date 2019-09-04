package br.ufrn.imd.almoxarifado.dominio;

public class ReservaMaterial {
	
	private int id;
	private int qtd;
	private Material material;
	private Usuario solicitante;
	
	public ReservaMaterial() {	}

	public ReservaMaterial(int qtd, Material material, Usuario solicitante) {
		this.qtd = qtd;
		this.material = material;
		this.solicitante = solicitante;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
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
