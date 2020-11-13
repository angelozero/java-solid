package angelozero.modelo;

public class Boleto {

	private double valor;
	
	

	public Boleto(double valor) {
		super();
		this.valor = valor;
	}

	public double calculaImposto() {
		return this.valor * 2;
	}

	public double getValor() {
		return valor;
	}

}
