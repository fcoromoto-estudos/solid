package br.com.fcoromoto.estudo.solid.ocp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReajusteService {

  public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {

    LocalDate hoje = LocalDate.now();
    LocalDate ultimaAlteracaoSalario = funcionario.getUltimaAlteracaoSalario();
    long diferencaMeses = ChronoUnit.MONTHS.between(hoje, ultimaAlteracaoSalario);

    if (diferencaMeses > 6L) {
      throw new ReajusteException("O reajuse de salário deve ter um interválo de 6 meses");
    }

    BigDecimal salario = funcionario.getSalario();
    BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
    if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
      throw new ReajusteException("Reajuste nao pode ser superior a 40% do salario!");
    }

    funcionario.reajustarSalario(aumento);
  }
}
