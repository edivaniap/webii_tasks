package br.ufrn.imd.almoxarifado.dominio;

import br.ufrn.imd.almoxarifado.dominio.rh.Contato;
import br.ufrn.imd.almoxarifado.dominio.rh.Endereco;

public class DadosEntrega {
	private Endereco endereco;
	private String local;
	private Contato contato;
	
	public DadosEntrega() {
		this.endereco = null;
		this.local = null;
		this.contato = null;
	}

	public DadosEntrega(Endereco endereco, String local, Contato contato) {
		this.endereco = endereco;
		this.local = local;
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "DadosEntrega [endereco=" + endereco + ", local=" + local + ", contato=" + contato + "]";
	}
}
