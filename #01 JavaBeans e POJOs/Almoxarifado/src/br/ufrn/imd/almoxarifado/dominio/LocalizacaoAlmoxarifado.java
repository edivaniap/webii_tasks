package br.ufrn.imd.almoxarifado.dominio;

public class LocalizacaoAlmoxarifado {
	private String localizacao;
	
	public LocalizacaoAlmoxarifado() { }

	public LocalizacaoAlmoxarifado(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
