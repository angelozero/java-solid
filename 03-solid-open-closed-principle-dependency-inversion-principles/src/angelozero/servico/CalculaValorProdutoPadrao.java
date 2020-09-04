package angelozero.servico;

public class CalculaValorProdutoPadrao implements TabelaDePrecoParaProduto {

	@Override
	public double calculaPrecoProduto(double valor) {
		return valor * 2.5;
	}

}
