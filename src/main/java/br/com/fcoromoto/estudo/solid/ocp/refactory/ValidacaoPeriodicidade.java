package br.com.fcoromoto.estudo.solid.ocp.refactory;

import br.com.fcoromoto.estudo.solid.ocp.Funcionario;
import br.com.fcoromoto.estudo.solid.ocp.ReajusteException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidade implements Validacao {

  @Override
  public void validar(Funcionario funcionario, BigDecimal aumento) {
    LocalDate hoje = LocalDate.now();
    LocalDate ultimaAlteracaoSalario = funcionario.getUltimaAlteracaoSalario();
    long diferencaMeses = ChronoUnit.MONTHS.between(hoje, ultimaAlteracaoSalario);

    if (diferencaMeses > 6L) {
      throw new ReajusteException("O reajuse de salário deve ter um interválo de 6 meses");
    }
  }
}
