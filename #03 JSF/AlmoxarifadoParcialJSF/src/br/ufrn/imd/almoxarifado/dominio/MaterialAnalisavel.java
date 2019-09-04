package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

public class MaterialAnalisavel {
	
	private int id;
	private BigDecimal teorConcentracao;
	private int prazoEntraga;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	private long registroAnvisa;
	private BigDecimal qdtAmostraAnalise;
	private int tempoLimiteAnalise;
	private int testeMaquina;
	private Material material;
	private MetodoEspecificoAnalise mea;

	public MaterialAnalisavel() { }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getTeorConcentracao() {
		return teorConcentracao;
	}

	public void setTeorConcentracao(BigDecimal teorConcentracao) {
		this.teorConcentracao = teorConcentracao;
	}

	public int getPrazoEntraga() {
		return prazoEntraga;
	}

	public void setPrazoEntraga(int prazoEntraga) {
		this.prazoEntraga = prazoEntraga;
	}

	public String getApresentacaoFarmaceutica() {
		return apresentacaoFarmaceutica;
	}

	public void setApresentacaoFarmaceutica(String apresentacaoFarmaceutica) {
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
	}

	public BigDecimal getVolumeMinimo() {
		return volumeMinimo;
	}

	public void setVolumeMinimo(BigDecimal volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}

	public long getRegistroAnvisa() {
		return registroAnvisa;
	}

	public void setRegistroAnvisa(long registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}

	public BigDecimal getQdtAmostraAnalise() {
		return qdtAmostraAnalise;
	}

	public void setQdtAmostraAnalise(BigDecimal qdtAmostraAnalise) {
		this.qdtAmostraAnalise = qdtAmostraAnalise;
	}

	public int getTempoLimiteAnalise() {
		return tempoLimiteAnalise;
	}

	public void setTempoLimiteAnalise(int tempoLimiteAnalise) {
		this.tempoLimiteAnalise = tempoLimiteAnalise;
	}

	public int getTesteMaquina() {
		return testeMaquina;
	}

	public void setTesteMaquina(int testeMaquina) {
		this.testeMaquina = testeMaquina;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public MetodoEspecificoAnalise getMea() {
		return mea;
	}

	public void setMea(MetodoEspecificoAnalise mea) {
		this.mea = mea;
	}
}
