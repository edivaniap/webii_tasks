package br.ufrn.imd.almoxarifado.dominio;

public class Usuario {
	private String codigo;
	private String nome;
	private String nomeUsuario;
	private String senha;
	
	public Usuario() { }

	public Usuario(String codigo, String nome, String nomeUsuario, String senha) {
		this.codigo = codigo;
		this.nome = nome;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
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

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
