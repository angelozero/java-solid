package angelozero.servico;

import angelozero.modelo.Funcionario;

public class CalcQuinzeVinteCincoPorcento implements RegraCalculoSalario {

	@Override
	public double calculaSalario(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		} else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}

}
