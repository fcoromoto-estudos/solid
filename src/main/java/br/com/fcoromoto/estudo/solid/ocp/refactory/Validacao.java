package br.com.fcoromoto.estudo.solid.ocp.refactory;

import br.com.fcoromoto.estudo.solid.ocp.Funcionario;
import java.math.BigDecimal;

public interface Validacao {

  void validar(Funcionario funcionario, BigDecimal aumento);
}
