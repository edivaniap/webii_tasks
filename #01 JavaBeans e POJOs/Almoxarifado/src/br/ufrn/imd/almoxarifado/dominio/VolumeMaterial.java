package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

public class VolumeMaterial {
	private String codigo;
	private Material material;
	private BigDecimal qtdInicial;
	private BigDecimal qtdAtual;
	private DimensaoUnidade dimensaoUnidade;
	private LocalizacaoAlmoxarifado localizacaoAlmoxarifado;
	private LoteMaterial lote;
	private VolumeMaterial volumeOrigem;
	private UnidadeMedida unidadeMedida;
	
	public VolumeMaterial() { }

	public VolumeMaterial(String codigo, Material material, BigDecimal qtdInicial, BigDecimal qtdAtual,
			DimensaoUnidade dimensaoUnidade, LocalizacaoAlmoxarifado localizacaoAlmoxarifado, LoteMaterial lote,
			VolumeMaterial volumeOrigem, UnidadeMedida unidadeMedida) {
		this.codigo = codigo;
		this.material = material;
		this.qtdInicial = qtdInicial;
		this.qtdAtual = qtdAtual;
		this.dimensaoUnidade = dimensaoUnidade;
		this.localizacaoAlmoxarifado = localizacaoAlmoxarifado;
		this.lote = lote;
		this.volumeOrigem = volumeOrigem;
		this.unidadeMedida = unidadeMedida;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdInicial() {
		return qtdInicial;
	}

	public void setQtdInicial(BigDecimal qtdInicial) {
		this.qtdInicial = qtdInicial;
	}

	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public DimensaoUnidade getDimensaoUnidade() {
		return dimensaoUnidade;
	}

	public void setDimensaoUnidade(DimensaoUnidade dimensaoUnidade) {
		this.dimensaoUnidade = dimensaoUnidade;
	}

	public LocalizacaoAlmoxarifado getLocalizacaoAlmoxarifado() {
		return localizacaoAlmoxarifado;
	}

	public void setLocalizacaoAlmoxarifado(LocalizacaoAlmoxarifado localizacaoAlmoxarifado) {
		this.localizacaoAlmoxarifado = localizacaoAlmoxarifado;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public VolumeMaterial getVolumeOrigem() {
		return volumeOrigem;
	}

	public void setVolumeOrigem(VolumeMaterial volumeOrigem) {
		this.volumeOrigem = volumeOrigem;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
}
