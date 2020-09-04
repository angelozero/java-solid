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
	
	public static void main(String[] args) {
		
		
		List<Compra> compras = Arrays.asList(new Compra(Estado.SP, 2000, "Notebook"), new Compra(Estado.RJ, 1000, "Monitor"), new Compra(Estado.BH, 1000, "Mouse"));
		
		
		CalculadoraDeEnvioParaProdutos calculadoraEnvioViaTransportadora = new CalculadoraDeEnvioParaProdutos(new FretePorTransportadora(), new CalculaValorProdutoPadrao());
		CalculadoraDeEnvioParaProdutos calculadoraEnvioViaCorreio = new CalculadoraDeEnvioParaProdutos(new FretePorCorreio(), new CalculaValorProdutoPadrao());
		
		
		for (Compra compra : compras) {
			
			System.out.println("Produto: " + compra.getItem() + " Estado: " + compra.getEstado().name() + " Transpportadora - R$: " + calculadoraEnvioViaTransportadora.calcula(compra));
			System.out.println("Produto: " + compra.getItem() + " Estado: " + compra.getEstado().name() + " Correio --------- R$: " + calculadoraEnvioViaCorreio.calcula(compra));
			System.out.println("\n");
			
		}

	}

}
