package br.com.fcoromoto.estudo.solid.dip;

public class InteruptorControle {

  private Controle controle;

  public void adcionar() {

    if (controle.isLigado()) {
      controle.desligar();
    } else {
      controle.ligar();
    }
  }
}
