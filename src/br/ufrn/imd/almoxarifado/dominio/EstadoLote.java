package br.ufrn.imd.almoxarifado.dominio;

public enum EstadoLote {
  QUARENTENA("Quarentena"),
  APROVADO("Aprovado"),
  REPROVADO("Reprovado"),
  PENDENTE("Pendente");

  public final String label;

  private EstadoLote(String label) {
    this.label = label;
  }
}
