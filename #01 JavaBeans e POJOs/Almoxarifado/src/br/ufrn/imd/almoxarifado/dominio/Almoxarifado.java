package br.ufrn.imd.almoxarifado.dominio;

import java.util.List;

public class Almoxarifado {
	private String nome;
	private Usuario chefe;
	private List<TipoMaterial> tiposMateriais;
	private List<Usuario> usuariosAlmoxarifado;
	private boolean enderecado;
	private List<LocalizacaoAlmoxarifado> localizacoes;
	
	public Almoxarifado() {
	}

	public Almoxarifado(String nome, Usuario chefe, List<TipoMaterial> tiposMateriais,
			List<Usuario> usuariosAlmoxarifado, boolean enderecado, List<LocalizacaoAlmoxarifado> localizacoes) {
		this.nome = nome;
		this.chefe = chefe;
		this.tiposMateriais = tiposMateriais;
		this.usuariosAlmoxarifado = usuariosAlmoxarifado;
		this.enderecado = enderecado;
		this.localizacoes = localizacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getChefe() {
		return chefe;
	}

	public void setChefe(Usuario chefe) {
		this.chefe = chefe;
	}

	public List<TipoMaterial> getTiposMateriais() {
		return tiposMateriais;
	}

	public void setTiposMateriais(List<TipoMaterial> tiposMateriais) {
		this.tiposMateriais = tiposMateriais;
	}

	public List<Usuario> getUsuariosAlmoxarifado() {
		return usuariosAlmoxarifado;
	}

	public void setUsuariosAlmoxarifado(List<Usuario> usuariosAlmoxarifado) {
		this.usuariosAlmoxarifado = usuariosAlmoxarifado;
	}

	public boolean isEnderecado() {
		return enderecado;
	}

	public void setEnderecado(boolean enderecado) {
		this.enderecado = enderecado;
	}

	public List<LocalizacaoAlmoxarifado> getLocalizacoes() {
		return localizacoes;
	}

	public void setLocalizacoes(List<LocalizacaoAlmoxarifado> localizacoes) {
		this.localizacoes = localizacoes;
	}

	@Override
	public String toString() {
		return "Almoxarifado [nome=" + nome + ", chefe=" + chefe + ", tiposMateriais=" + tiposMateriais
				+ ", usuariosAlmoxarifado=" + usuariosAlmoxarifado + ", enderecado=" + enderecado + ", localizacoes="
				+ localizacoes + "]";
	}	
}
