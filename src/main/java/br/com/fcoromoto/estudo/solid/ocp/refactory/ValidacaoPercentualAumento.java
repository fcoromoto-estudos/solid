package br.com.fcoromoto.estudo.solid.ocp.refactory;

import br.com.fcoromoto.estudo.solid.ocp.Funcionario;
import br.com.fcoromoto.estudo.solid.ocp.ReajusteException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualAumento implements Validacao {

  @Override
  public void validar(Funcionario funcionario, BigDecimal aumento) {
    BigDecimal salario = funcionario.getSalario();
    BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
    if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
      throw new ReajusteException("Reajuste nao pode ser superior a 40% do salario!");
    }
  }
}
