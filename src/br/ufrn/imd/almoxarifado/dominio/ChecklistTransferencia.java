package br.ufrn.imd.almoxarifado.dominio;

import java.util.Date;

import br.ufrn.imd.almoxarifado.dominio.rh.Endereco;

public class ChecklistTransferencia {
  private Material material;
  private BigDecimal qtd;
  private Endereco local;
  private Date dataConferencia;
  private String observacoes;
  private List<Documento> anexoFotos;
  private boolean aprovado;
}
