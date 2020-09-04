package angelozero.enums;

import angelozero.servico.*;

public enum Cargo {

	DESENVOLVEDOR(new CalcDezVintePorcento()), QA(new CalcQuinzeVinteCincoPorcento()), ARQUITETO(new CalcQuinzeVinteCincoPorcento());

	private RegraCalculoSalario regraCalculoSalario;

	Cargo(RegraCalculoSalario regraCalculoSalario) {
		this.regraCalculoSalario = regraCalculoSalario;
	}

	public RegraCalculoSalario getRegraCalculoSalario() {
		return regraCalculoSalario;
	}

}
