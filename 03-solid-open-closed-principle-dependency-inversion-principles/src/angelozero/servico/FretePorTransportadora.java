package angelozero.servico;

import angelozero.enums.Estado;

public class FretePorTransportadora implements TabelaDePrecoParaFrete {

	@Override
	public double calculaPrecoFrete(double valor, Estado estado) {

		if (estado.name() == Estado.SP.name()) {
			return valor * 5;

		} else {
			return valor * 8;
		}
	}
}
