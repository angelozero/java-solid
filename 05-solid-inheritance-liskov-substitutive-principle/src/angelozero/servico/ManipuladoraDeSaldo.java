package angelozero.servico;

public class ManipuladoraDeSaldo {

	protected double saldo;

	public ManipuladoraDeSaldo() {
		this.saldo = 0;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void rende(double taxa) {
		this.saldo *= taxa;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
