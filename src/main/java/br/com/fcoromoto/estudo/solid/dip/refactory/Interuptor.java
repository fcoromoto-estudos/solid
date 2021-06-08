package br.com.fcoromoto.estudo.solid.dip.refactory;

public class Interuptor {

  private Dispositivo dispositivo;

  public void adcionar() {

    if (dispositivo.isLigado()) {
      dispositivo.desligar();
    } else {
      dispositivo.ligar();
    }
  }
}
