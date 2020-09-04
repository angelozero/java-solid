package angelozero.modelo;

import angelozero.enums.Cargo;

public class Funcionario {

	private int id;
	private String nome;
	private Cargo cargo;
	private double salarioBase;

	public Funcionario(String nome, Cargo cargo, double salarioBase) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getSalarioCalculado() {
		return cargo.getRegraCalculoSalario().calculaSalario(this);
	}

}
