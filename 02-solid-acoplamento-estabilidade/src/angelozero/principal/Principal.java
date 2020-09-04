package angelozero.principal;

import java.util.Arrays;

import angelozero.modelo.NotaFiscal;
import angelozero.servico.EnviaEmailNotaFiscal;
import angelozero.servico.SalvaNotaFiscal;
import angelozero.servico.ServicoNotaFiscal;

public class Principal {

	/**
	 * OCP - Open Closed Principle
	 * 
	 * O OCP diz para escrevermos classes que sejam facilmente extensíveis. Dessa
	 * forma, mudar o comportamento da classe atual é fácil, basta passar outras
	 * implementações concretas das abstrações que ela depende.
	 * 
	 * 
	 * DIP — Dependency Inversion Principle — Princípio da Inversão de Dependência
	 * 
	 * O DIP nos diz para sempre dependermos de módulos que sejam mais estáveis que
	 * o módulo corrente. Abstrações devem depender de abstrações, e implementação
	 * deve depender de abstração.
	 * 
	 */

	public static void main(String[] args) {

		NotaFiscal nf = new NotaFiscal();

		ServicoNotaFiscal servicoNotaFiscal = new ServicoNotaFiscal(
				Arrays.asList(new SalvaNotaFiscal(), new EnviaEmailNotaFiscal()));

		servicoNotaFiscal.executaProcessosParaNotaFiscal(nf);

	}

}
