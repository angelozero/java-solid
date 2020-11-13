package angelozero.modelo;

public interface Conta {

	public void deposita(double valor);
	public void saca(double valor);
	public void rende(double taxa);
	public double saldo();
}
