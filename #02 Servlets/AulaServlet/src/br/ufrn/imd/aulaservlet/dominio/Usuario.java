package br.ufrn.imd.aulaservlet.dominio;

public class Usuario {
	private String nome;
	private String nomeUsuario;
	private String senha;
	
	public Usuario() {}
	
	public Usuario(String nome, String nomeUsuario, String senha) {
		this.nome = nome;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
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

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", nomeUsuario=" + nomeUsuario + ", senha=" + senha + "]";
	}
}
