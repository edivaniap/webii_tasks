package br.ufrn.imd.almoxarifado.dominio;

public class DadosPagamento {
	private String banco;
	private String agencia;
	private String conta;
	private String codigoIdentificacaoDV;
	
	public DadosPagamento() {
		this.banco = "";
		this.agencia = "";
		this.conta = "";
		this.codigoIdentificacaoDV = "";
	}
	
	public DadosPagamento(String banco, String agencia, String conta, String codigoIdentificacaoDV) {
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.codigoIdentificacaoDV = codigoIdentificacaoDV;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCodigoIdentificacaoDV() {
		return codigoIdentificacaoDV;
	}

	public void setCodigoIdentificacaoDV(String codigoIdentificacaoDV) {
		this.codigoIdentificacaoDV = codigoIdentificacaoDV;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}
}
