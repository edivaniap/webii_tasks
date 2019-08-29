package br.ufrn.imd.almoxarifado.dominio;

public class NaturezaOperacao {
	private String nome;
	private String descricao;
	private String codigo;

	public NaturezaOperacao() {
	}
	
	public NaturezaOperacao(String nome, String descricao, String codigo) {
		this.nome = nome;
		this.descricao = descricao;
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
