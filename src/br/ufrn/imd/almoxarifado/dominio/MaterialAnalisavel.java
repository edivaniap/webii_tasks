package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

import br.ufrn.imd.almoxarifado.dominio.coq.MetodoEspecificoAnalise;
import br.ufrn.imd.almoxarifado.dominio.producao.DominacaoComumBrasileira;

public class MaterialAnalisavel {
	private BigDecimal teorConcentracao;
	private int prazoEntraga;
	private DominacaoComumBrasileira dcb;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	private Documento fichaSeguranca;
	private long registroAnvisa;
	private BigDecimal qdtAmostraAnalise;
	private int tempoLimiteAnalise;
	private int testeMaquina;
	private Material material;
	private MetodoEspecificoAnalise mea;

	public MaterialAnalisavel() { }

	public MaterialAnalisavel(BigDecimal teorConcentracao, int prazoEntraga, DominacaoComumBrasileira dcb,
			String apresentacaoFarmaceutica, BigDecimal volumeMinimo, Documento fichaSeguranca, long registroAnvisa,
			BigDecimal qdtAmostraAnalise, int tempoLimiteAnalise, int testeMaquina, Material material,
			MetodoEspecificoAnalise mea) {
		this.teorConcentracao = teorConcentracao;
		this.prazoEntraga = prazoEntraga;
		this.dcb = dcb;
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
		this.volumeMinimo = volumeMinimo;
		this.fichaSeguranca = fichaSeguranca;
		this.registroAnvisa = registroAnvisa;
		this.qdtAmostraAnalise = qdtAmostraAnalise;
		this.tempoLimiteAnalise = tempoLimiteAnalise;
		this.testeMaquina = testeMaquina;
		this.material = material;
		this.mea = mea;
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

	public DominacaoComumBrasileira getDcb() {
		return dcb;
	}

	public void setDcb(DominacaoComumBrasileira dcb) {
		this.dcb = dcb;
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

	public Documento getFichaSeguranca() {
		return fichaSeguranca;
	}

	public void setFichaSeguranca(Documento fichaSeguranca) {
		this.fichaSeguranca = fichaSeguranca;
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
