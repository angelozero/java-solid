package angelozero.servico;

import angelozero.enums.Estado;

public interface TabelaDePrecoParaFrete {
	
	public double calculaPrecoFrete(double valor, Estado estado);

}
