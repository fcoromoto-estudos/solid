package br.com.fcoromoto.estudo.solid.isp;

public class TelefoneFixo implements Telefone {

  @Override
  public void fazLigacao() {}

  @Override
  public void recebeLigacao() {}

  // Quebra de contratro
  @Override
  public void tiraFoto() {
    throw new IllegalStateException("Telefone fixo não possui camera");
  }

  // Quebra de contratro
  @Override
  public void usaGPS() {
    throw new IllegalStateException("Telefone fixo não possui GPS");
  }
}
