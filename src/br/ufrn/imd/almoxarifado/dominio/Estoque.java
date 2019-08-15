package br.ufrn.imd.almoxarifado.dominio;

public class Estoque {
  private BigDecimal qtdAtual;
  private Almoxarifado almoxarifado;
  private LoteMaterial lote;
  private Material material;
  private BigDecimal qtdMaxima;
  private List<MovimentacaoEstoque> historicoMovimentacoes;
  private TipoEstoque tipoEstoque;
  
}
