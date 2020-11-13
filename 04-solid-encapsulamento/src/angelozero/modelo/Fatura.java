package angelozero.modelo;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean pago;

	public Fatura(String cliente, double valor) {
		super();
		this.cliente = cliente;
		this.valor = valor;
		this.pagamentos = new ArrayList<>();
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public boolean isPago() {
		return valor < 20 ? true : false;
	}

	public double calculaImposto() {
		return this.valor * 2;
	}

	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);

		System.out.println("\nVerificando se fatura foi paga");

		this.pago = valorTotalDosPagamentos(pagamentos) >= this.valor ? true : false;

		System.out.println(this.pago ? "\nFatura paga" : "\nFatura nao foi paga");

	}

	private double valorTotalDosPagamentos(List<Pagamento> pagamentos) {
		return pagamentos.stream().mapToDouble(pagamento -> pagamento.getValor()).sum();
	}
}
