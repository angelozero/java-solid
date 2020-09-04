package angelozero.principal;

import angelozero.enums.Cargo;
import angelozero.modelo.Funcionario;
import angelozero.servico.CalculaSalario;

public class Principal {

	/**
	 * 
	 * Uma classe coesa é aquela que contém apenas uma única responsabilidade.
	 * Classes coesas sao menore e mais fáceis de serem lidas e mantidas.
	 * 
	 * SRP - Single Responsibility Principle.
	 * Ter uma única responsabilidade por classe.
	 * 
	 */

	public static void main(String[] args) {
		Funcionario angelo = new Funcionario("Angelo", Cargo.DESENVOLVEDOR, 8000);

		System.out.println(new CalculaSalario().calcula(angelo));
	}
}
