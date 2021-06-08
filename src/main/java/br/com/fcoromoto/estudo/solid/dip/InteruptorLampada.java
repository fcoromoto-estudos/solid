package br.com.fcoromoto.estudo.solid.dip;

public class InteruptorLampada {

  private Lampada lampada;

  public void adcionar() {

    if (lampada.isLigado()) {
      lampada.desligar();
    } else {
      lampada.ligar();
    }
  }
}
