package angelozero.principal;

import java.util.Arrays;
import java.util.List;

import angelozero.modelo.Conta;
import angelozero.modelo.ContaComum;
import angelozero.modelo.ContaDeEstudante;

public class Principal {

	/**
	 * 
	 * Princípio de Liskov, toda classe filho tem que pensar nas pré-condições e
	 * pós-condições do pai, e ela nunca pode quebrar. Na pré-condição, ela nunca
	 * pode apertar. E na pós-condição, ela nunca pode afrouxar. Se não, as
	 * referências que apontam pra classe pai, quando receberem uma classe filho,
	 * não vão funcionar da maneira esperada.
	 */
	public static void main(String[] args) {

		for (Conta conta : contasDoBanco()) {
			conta.rende(0.01);

			System.out.println("Novo saldo: " + conta.saldo());
		}

	}

	private static List<Conta> contasDoBanco() {
		return Arrays.asList(geraContaDeEstudante(100), geraContaComum(200));
	}

	private static ContaDeEstudante geraContaDeEstudante(double valor) {

		ContaDeEstudante contaDeEstudante = new ContaDeEstudante();
		contaDeEstudante.deposita(valor);

		return contaDeEstudante;
	}

	private static Conta geraContaComum(double valor) {

		ContaComum contaComum = new ContaComum();
		contaComum.deposita(valor);

		return contaComum;
	}
}
