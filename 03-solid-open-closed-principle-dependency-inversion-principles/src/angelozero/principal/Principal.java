package angelozero.principal;

import java.util.Arrays;
import java.util.List;

import angelozero.enums.Estado;
import angelozero.modelos.Compra;
import angelozero.servico.CalculaValorProdutoPadrao;
import angelozero.servico.CalculadoraDeEnvioParaProdutos;
import angelozero.servico.FretePorCorreio;
import angelozero.servico.FretePorTransportadora;

public class Principal {

	/**
	 * 
	 * Note que no exemplo a base, é fechada para
	 * modificação; passando assim ser de responsabilidade das classe herdeiras,
	 * implementarem o comportamento de acordo com um determinado cenário.
	 * Implementando um design de arquitetura, tendo em mente o princípio do
	 * aberto/fechado, o impacto das mudanças reduz drasticamente. Fazendo com que
	 * tenhamos um software flexível, robusto e aceita as mudanças, ao invés de
	 * brigar com elas. O exemplo acima deixa claro isto, e uma vez sendo alterado o
	 * cálculo do salário do analista, como o do gerente, a base se manter imutável
	 * diminuindo a possibilidade de bugs no sistema.
	 * 
	 *
	 */

	public static void main(String[] args) {

		List<Compra> compras = Arrays.asList(new Compra(Estado.SP, 2000, "Notebook"),
				new Compra(Estado.RJ, 1000, "Monitor"), new Compra(Estado.BH, 1000, "Mouse"));

		CalculadoraDeEnvioParaProdutos calculadoraEnvioViaTransportadora = new CalculadoraDeEnvioParaProdutos(
				new FretePorTransportadora(), new CalculaValorProdutoPadrao());
		CalculadoraDeEnvioParaProdutos calculadoraEnvioViaCorreio = new CalculadoraDeEnvioParaProdutos(
				new FretePorCorreio(), new CalculaValorProdutoPadrao());

		for (Compra compra : compras) {

			System.out.println("Produto: " + compra.getItem() + " Estado: " + compra.getEstado().name()
					+ " Transpportadora - R$: " + calculadoraEnvioViaTransportadora.calcula(compra));
			System.out.println("Produto: " + compra.getItem() + " Estado: " + compra.getEstado().name()
					+ " Correio --------- R$: " + calculadoraEnvioViaCorreio.calcula(compra));
			System.out.println("\n");
		}
	}
}
