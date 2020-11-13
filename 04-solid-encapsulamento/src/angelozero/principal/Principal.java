package angelozero.principal;

import java.util.Arrays;
import java.util.List;

import angelozero.modelo.Boleto;
import angelozero.modelo.Fatura;
import angelozero.servico.ProcessadorDeBoletos;

public class Principal {

	public static void main(String[] args) {

		/**
		 * Encapsulamento é esconder como a classe implementa as suas tarefas. Como que
		 * eu sei que as minhas classes e métodos estão encapsulados? Basta eu olhar pra
		 * ele, ver o nome dele – pega uma classe que o está usando – e tenta responder
		 * as duas perguntas: O quê? E como?
		 * 
		 * O “O quê?” você tem que ser capaz de responder, porque o nome do método tem
		 * que te dizer isso. O “Como?” você não tem que conseguir responder. O proprio
		 * nome do metodo da classe deve ser auto explicativo para isso
		 */
		
		ProcessadorDeBoletos processaBoleto = new ProcessadorDeBoletos();
		List<Boleto> boletos = Arrays.asList(new Boleto(1000.00));
		Fatura fatura = new Fatura("Angelo", 10000.00);
		
		processaBoleto.processa(boletos, fatura);

		System.out.println("\nFatura calculada com sucesso");
	}
}
