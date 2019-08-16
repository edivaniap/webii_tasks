package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.ufrn.imd.almoxarifado.dominio.controle_qualidade.SolicitacaoAnalise;
import br.ufrn.imd.almoxarifado.dominio.producao.OrdemProducao;
import br.ufrn.imd.almoxarifado.dominio.rh.PessoaJuridica;

public class LoteMaterial {
	private Material material;
	private Date dataValidade;
	private Date dataFabricacao;
	private EstadoLote estado;
	private String numeroLoteFabricante; 
	private String numeroLoteInterno;
	private String numeroLoteFornecedor;
	private int volumes;
	private OrdemProducao ordemProducao;
	private PessoaJuridica fornecedor;
	private PessoaJuridica fabricante;
	private int qtdCaixaEmbarque;
	private BigDecimal pesoBrutoTotal;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private double valorUnitario;
	private List<SolicitacaoAnalise> solicitacaoAnalises;
	
	public LoteMaterial() {	}

	public LoteMaterial(Material material, Date dataValidade, Date dataFabricacao, EstadoLote estado,
			String numeroLoteFabricante, String numeroLoteInterno, String numeroLoteFornecedor, int volumes,
			OrdemProducao ordemProducao, PessoaJuridica fornecedor, PessoaJuridica fabricante, int qtdCaixaEmbarque,
			BigDecimal pesoBrutoTotal, BigDecimal pesoLiquidoTotal, BigDecimal tara, double valorUnitario,
			List<SolicitacaoAnalise> solicitacaoAnalises) {
		this.material = material;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.estado = estado;
		this.numeroLoteFabricante = numeroLoteFabricante;
		this.numeroLoteInterno = numeroLoteInterno;
		this.numeroLoteFornecedor = numeroLoteFornecedor;
		this.volumes = volumes;
		this.ordemProducao = ordemProducao;
		this.fornecedor = fornecedor;
		this.fabricante = fabricante;
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
		this.pesoBrutoTotal = pesoBrutoTotal;
		this.pesoLiquidoTotal = pesoLiquidoTotal;
		this.tara = tara;
		this.valorUnitario = valorUnitario;
		this.solicitacaoAnalises = solicitacaoAnalises;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public EstadoLote getEstado() {
		return estado;
	}

	public void setEstado(EstadoLote estado) {
		this.estado = estado;
	}

	public String getNumeroLoteFabricante() {
		return numeroLoteFabricante;
	}

	public void setNumeroLoteFabricante(String numeroLoteFabricante) {
		this.numeroLoteFabricante = numeroLoteFabricante;
	}

	public String getNumeroLoteInterno() {
		return numeroLoteInterno;
	}

	public void setNumeroLoteInterno(String numeroLoteInterno) {
		this.numeroLoteInterno = numeroLoteInterno;
	}

	public String getNumeroLoteFornecedor() {
		return numeroLoteFornecedor;
	}

	public void setNumeroLoteFornecedor(String numeroLoteFornecedor) {
		this.numeroLoteFornecedor = numeroLoteFornecedor;
	}

	public int getVolumes() {
		return volumes;
	}

	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}

	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}

	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}

	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}

	public PessoaJuridica getFabricante() {
		return fabricante;
	}

	public void setFabricante(PessoaJuridica fabricante) {
		this.fabricante = fabricante;
	}

	public int getQtdCaixaEmbarque() {
		return qtdCaixaEmbarque;
	}

	public void setQtdCaixaEmbarque(int qtdCaixaEmbarque) {
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
	}

	public BigDecimal getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}

	public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}

	public BigDecimal getPesoLiquidoTotal() {
		return pesoLiquidoTotal;
	}

	public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
		this.pesoLiquidoTotal = pesoLiquidoTotal;
	}

	public BigDecimal getTara() {
		return tara;
	}

	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public List<SolicitacaoAnalise> getSolicitacaoAnalises() {
		return solicitacaoAnalises;
	}

	public void setSolicitacaoAnalises(List<SolicitacaoAnalise> solicitacaoAnalises) {
		this.solicitacaoAnalises = solicitacaoAnalises;
	}
}
