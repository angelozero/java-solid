package angelozero.servico;

import java.util.List;

import angelozero.modelo.Boleto;
import angelozero.modelo.Fatura;
import angelozero.modelo.Pagamento;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {
		
		System.out.println("\nProcessando boletos e fatura");

		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);

			fatura.adicionaPagamento(pagamento);
		}

	}
}
