package br.ufrn.imd.almoxarifado.dominio;

import java.util.List;

import br.ufrn.imd.almoxarifado.dominio.rh.Setor;

public class SaidaRequisicaoInterna {
	private String codigo;
	private Usuario requisitante;
	private Setor setorRequisitante;
	private Usuario responsavelSetor;
	private StatusRequisicao statusRequisicao;
	private List<ItemRequisicao> itensRequisicao;
	private List<HistoricoRequisicao> historicosRequisicao;
	private SaidaEstoque saidaEstoque;
	
	public SaidaRequisicaoInterna() { }
	
	public SaidaRequisicaoInterna(String codigo, Usuario requisitante,
			Setor setorRequisitante, Usuario responsavelSetor,
			StatusRequisicao statusRequisicao,
			List<ItemRequisicao> itensRequisicao,
			List<HistoricoRequisicao> historicosRequisicao,
			SaidaEstoque saidaEstoque) {
		this.codigo = codigo;
		this.requisitante = requisitante;
		this.setorRequisitante = setorRequisitante;
		this.responsavelSetor = responsavelSetor;
		this.statusRequisicao = statusRequisicao;
		this.itensRequisicao = itensRequisicao;
		this.historicosRequisicao = historicosRequisicao;
		this.saidaEstoque = saidaEstoque;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Usuario getRequisitante() {
		return requisitante;
	}
	public void setRequisitante(Usuario requisitante) {
		this.requisitante = requisitante;
	}
	public Setor getSetorRequisitante() {
		return setorRequisitante;
	}
	public void setSetorRequisitante(Setor setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}
	public Usuario getResponsavelSetor() {
		return responsavelSetor;
	}
	public void setResponsavelSetor(Usuario responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}
	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}
	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}
	public List<ItemRequisicao> getItensRequisicao() {
		return itensRequisicao;
	}
	public void setItensRequisicao(List<ItemRequisicao> itensRequisicao) {
		this.itensRequisicao = itensRequisicao;
	}
	public List<HistoricoRequisicao> getHistoricosRequisicao() {
		return historicosRequisicao;
	}
	public void setHistoricosRequisicao(
			List<HistoricoRequisicao> historicosRequisicao) {
		this.historicosRequisicao = historicosRequisicao;
	}
	public SaidaEstoque getSaidaEstoque() {
		return saidaEstoque;
	}
	public void setSaidaEstoque(SaidaEstoque saidaEstoque) {
		this.saidaEstoque = saidaEstoque;
	}

}
