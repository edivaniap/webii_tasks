package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.almoxarifado.dominio.rh.PessoaJuridica;

public class MovimentacaoEstoque {
	private Usuario responsavel;
	private PessoaJuridica pjOrigem;
	private Almoxarifado almoxarifadoOrigem;
	private PessoaJuridica pjDestino;
	private Almoxarifado almoxarifadoDestino;
	private BigDecimal qtdMovimentada;
	private LoteMaterial itemLote;
	private Material itemMaterial;
	private Date dataMovimentacao;
	private TipoMovimentacao tipoMovimentacao;
	private SaidaEstoque saidaEstoque;
	private EntradaEstoque entradaEstoque;
	
	public MovimentacaoEstoque() {}
	
	public MovimentacaoEstoque(Usuario responsavel, PessoaJuridica pjOrigem, Almoxarifado almoxarifadoOrigem,
			PessoaJuridica pjDestino, Almoxarifado almoxarifadoDestino, BigDecimal qtdMovimentada,
			LoteMaterial itemLote, Material itemMaterial, Date dataMovimentacao, TipoMovimentacao tipoMovimentacao,
			SaidaEstoque saidaEstoque, EntradaEstoque entradaEstoque) {
		this.responsavel = responsavel;
		this.pjOrigem = pjOrigem;
		this.almoxarifadoOrigem = almoxarifadoOrigem;
		this.pjDestino = pjDestino;
		this.almoxarifadoDestino = almoxarifadoDestino;
		this.qtdMovimentada = qtdMovimentada;
		this.itemLote = itemLote;
		this.itemMaterial = itemMaterial;
		this.dataMovimentacao = dataMovimentacao;
		this.tipoMovimentacao = tipoMovimentacao;
		this.saidaEstoque = saidaEstoque;
		this.entradaEstoque = entradaEstoque;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public PessoaJuridica getPjOrigem() {
		return pjOrigem;
	}

	public void setPjOrigem(PessoaJuridica pjOrigem) {
		this.pjOrigem = pjOrigem;
	}

	public Almoxarifado getAlmoxarifadoOrigem() {
		return almoxarifadoOrigem;
	}

	public void setAlmoxarifadoOrigem(Almoxarifado almoxarifadoOrigem) {
		this.almoxarifadoOrigem = almoxarifadoOrigem;
	}

	public PessoaJuridica getPjDestino() {
		return pjDestino;
	}

	public void setPjDestino(PessoaJuridica pjDestino) {
		this.pjDestino = pjDestino;
	}

	public Almoxarifado getAlmoxarifadoDestino() {
		return almoxarifadoDestino;
	}

	public void setAlmoxarifadoDestino(Almoxarifado almoxarifadoDestino) {
		this.almoxarifadoDestino = almoxarifadoDestino;
	}

	public BigDecimal getQtdMovimentada() {
		return qtdMovimentada;
	}

	public void setQtdMovimentada(BigDecimal qtdMovimentada) {
		this.qtdMovimentada = qtdMovimentada;
	}

	public LoteMaterial getItemLote() {
		return itemLote;
	}

	public void setItemLote(LoteMaterial itemLote) {
		this.itemLote = itemLote;
	}

	public Material getItemMaterial() {
		return itemMaterial;
	}

	public void setItemMaterial(Material itemMaterial) {
		this.itemMaterial = itemMaterial;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public SaidaEstoque getSaidaEstoque() {
		return saidaEstoque;
	}

	public void setSaidaEstoque(SaidaEstoque saidaEstoque) {
		this.saidaEstoque = saidaEstoque;
	}

	public EntradaEstoque getEntradaEstoque() {
		return entradaEstoque;
	}

	public void setEntradaEstoque(EntradaEstoque entradaEstoque) {
		this.entradaEstoque = entradaEstoque;
	}
}
