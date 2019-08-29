package br.ufrn.imd.almoxarifado.dominio;

import java.math.BigDecimal;

public class Material {
	private int codigo;
	private String nome;
	private String especificacao;
	private GrupoMaterial grupoMaterial;
	private int estoqueMinimo;
	private UnidadeMedida unidaeEstoque;
	private UnidadeMedida unidadeEntrada;
	private UnidadeMedida unidadeMedida;
	private BigDecimal fatorConversaoEntrada;
	private String dadosAdicionais; 
	private ClassificacaoMaterial classificacao;
	private int catmat;
	private String condicaoArmazenagem;
	private StatusMaterial status;
	private VolumeMaterial volume;
	private GrupoMaterial grupo;
	
	public Material() {	}

}
