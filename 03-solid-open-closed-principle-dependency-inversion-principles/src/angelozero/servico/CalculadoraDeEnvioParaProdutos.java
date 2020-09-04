package angelozero.servico;

import angelozero.modelos.Compra;

public class CalculadoraDeEnvioParaProdutos {

	private TabelaDePrecoParaFrete entrega;
	private TabelaDePrecoParaProduto precoParaProduto;

	public CalculadoraDeEnvioParaProdutos(TabelaDePrecoParaFrete tabelaDePrecoParaFrete,
			TabelaDePrecoParaProduto tabelaDePrecoParaProduto) {

		this.entrega = tabelaDePrecoParaFrete;
		this.precoParaProduto = tabelaDePrecoParaProduto;
	}

	public double calcula(Compra compra) {

		double precoEnvio = precoParaProduto.calculaPrecoProduto(compra.getValor());
		double frete = entrega.calculaPrecoFrete(compra.getValor(), compra.getEstado());

		return compra.getValor() * (precoEnvio - 2) + frete;
	}

}
