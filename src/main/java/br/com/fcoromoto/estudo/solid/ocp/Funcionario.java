package br.com.fcoromoto.estudo.solid.ocp;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;

@Getter
public class Funcionario {

  private String nome;
  private BigDecimal salario;
  private LocalDate ultimaAlteracaoSalario;

  public void reajustarSalario(BigDecimal aumento) {
    this.salario = aumento;
    this.ultimaAlteracaoSalario = LocalDate.now();
  }
}
