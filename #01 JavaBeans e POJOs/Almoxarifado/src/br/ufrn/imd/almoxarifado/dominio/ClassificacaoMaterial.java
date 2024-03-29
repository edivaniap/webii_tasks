package br.ufrn.imd.almoxarifado.dominio;

public class ClassificacaoMaterial {
	private String nome;
	private String codigo;
	
	public ClassificacaoMaterial() { }

	public ClassificacaoMaterial(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "ClassificacaoMaterial [nome=" + nome + ", codigo=" + codigo + "]";
	}
}
