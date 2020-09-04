package angelozero.servico;

import angelozero.enums.Estado;

public class FretePorCorreio implements TabelaDePrecoParaFrete {

	@Override
	public double calculaPrecoFrete(double valor, Estado estado) {

		if (estado.name() == Estado.SP.name()) {
			return valor * 3;

		} else {
			return valor * 5;
		}
	}
}
