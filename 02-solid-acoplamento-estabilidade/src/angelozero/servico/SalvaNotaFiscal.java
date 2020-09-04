package angelozero.servico;

import angelozero.modelo.NotaFiscal;

public class SalvaNotaFiscal implements AcaoParaNotaFiscal{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota fiscal salva com sucesso");	
	}
}
