package angelozero.servico;

import angelozero.modelo.NotaFiscal;

public class EnviaEmailNotaFiscal implements AcaoParaNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota fiscal enviada por email com sucesso");
	}
}
