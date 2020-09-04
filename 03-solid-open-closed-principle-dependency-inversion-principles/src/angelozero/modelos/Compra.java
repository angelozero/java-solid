package angelozero.modelos;

import angelozero.enums.Estado;

public class Compra {

	private Estado estado;
	private double valor;
	private String item;

	public Compra(Estado estado, double valor, String item) {
		super();
		this.estado = estado;
		this.valor = valor;
		this.item = item;
	}

	public Estado getEstado() {
		return estado;
	}

	public double getValor() {
		return valor;
	}

	public String getItem() {
		return item;
	}

}
