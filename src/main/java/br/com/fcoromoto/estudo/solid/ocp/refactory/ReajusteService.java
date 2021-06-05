package br.com.fcoromoto.estudo.solid.ocp.refactory;

import br.com.fcoromoto.estudo.solid.ocp.Funcionario;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReajusteService {

  private final List<Validacao> validacoes;

  public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {

    validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));

    funcionario.reajustarSalario(aumento);
  }
}
