package angelozero.modelo;

import angelozero.servico.ManipuladoraDeSaldo;

public class ContaDeEstudante implements Conta {

	private ManipuladoraDeSaldo manipuladoraDeSaldo;

	public ContaDeEstudante() {
		manipuladoraDeSaldo = new ManipuladoraDeSaldo();
	}

	public void deposita(double valor) {
		this.manipuladoraDeSaldo.deposita(valor);
	}

	@Override
	public void saca(double valor) {
		manipuladoraDeSaldo.saca(valor);

	}

	@Override
	public void rende(double taxa) {
		manipuladoraDeSaldo.rende(taxa);

	}

	@Override
	public double saldo() {
		return manipuladoraDeSaldo.getSaldo();
	}
}
