package angelozero.modelo;

import angelozero.servico.MeioDePagamento;

public class Pagamento {

	private double valor;
	private MeioDePagamento meioDePagamento;

	public Pagamento(double valor, MeioDePagamento meioDePagamento) {
		super();
		this.valor = valor;
		this.meioDePagamento = meioDePagamento;
	}

	public double getValor() {
		return valor;
	}

	public MeioDePagamento getMeioDePagamento() {
		return meioDePagamento;
	}

}
