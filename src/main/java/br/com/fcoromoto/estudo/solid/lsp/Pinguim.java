package br.com.fcoromoto.estudo.solid.lsp;

public class Pinguim extends Ave {

  // Não faz nada
  @Override
  public void voar() {
    throw new IllegalStateException("Pinguim não voa");
  }
}
