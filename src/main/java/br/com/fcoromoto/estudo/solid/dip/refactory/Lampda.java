package br.com.fcoromoto.estudo.solid.dip.refactory;

public class Lampda implements Dispositivo {

  @Override
  public boolean isLigado() {
    return false;
  }

  @Override
  public void desligar() {}

  @Override
  public void ligar() {}
}
