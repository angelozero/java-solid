package angelozero.servico;

import java.util.List;

import angelozero.modelo.NotaFiscal;

public class ServicoNotaFiscal {

	private List<AcaoParaNotaFiscal> acoesParaNotaFiscal;

	public ServicoNotaFiscal(List<AcaoParaNotaFiscal> acoesParaNotaFiscal) {
		this.acoesParaNotaFiscal = acoesParaNotaFiscal;
	}

	public void executaProcessosParaNotaFiscal(NotaFiscal nf) {

		for (AcaoParaNotaFiscal acaoNF : acoesParaNotaFiscal) {
			acaoNF.executa(nf);
		}

	}

}
