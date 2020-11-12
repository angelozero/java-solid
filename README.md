
# Estudo de SOLID

### SRP - Single Responsibility Principle ( Classes coesas )

```java
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
```
---

### OCP - Open Closed Principle ( Acomplamento e Estabilidade )

### DIP - Dependency Inversion Principle — Princípio da Inversão de Dependência

```java
  public class Principal {

    /**
     * OCP - Open Closed Principle
     * 
     * O OCP diz para escrevermos classes que sejam facilmente extensíveis. Dessa
     * forma, mudar o comportamento da classe atual é fácil, basta passar outras
     * implementações concretas das abstrações que ela depende.
     * 
     * 
     * DIP — Dependency Inversion Principle — Princípio da Inversão de Dependência
     * 
     * O DIP nos diz para sempre dependermos de módulos que sejam mais estáveis que
     * o módulo corrente. Abstrações devem depender de abstrações, e implementação
     * deve depender de abstração.
     * 
     */

    public static void main(String[] args) {

      NotaFiscal nf = new NotaFiscal();

      ServicoNotaFiscal servicoNotaFiscal = new ServicoNotaFiscal(
          Arrays.asList(new SalvaNotaFiscal(), new EnviaEmailNotaFiscal()));

      servicoNotaFiscal.executaProcessosParaNotaFiscal(nf);
    }
  }
```

---

###  Open Closed Principle ( Dependencia Inversa de Principios / Aberto - Fechado )

```java
  /**
	 * 
	 * Note que no exemplo a base, é fechada para
	 * modificação; passando assim ser de responsabilidade das classe herdeiras,
	 * implementarem o comportamento de acordo com um determinado cenário.
	 * Implementando um design de arquitetura, tendo em mente o princípio do
	 * aberto/fechado, o impacto das mudanças reduz drasticamente. Fazendo com que
	 * tenhamos um software flexível, robusto e aceita as mudanças, ao invés de
	 * brigar com elas. O exemplo acima deixa claro isto, e uma vez sendo alterado o
	 * cálculo do salário do analista, como o do gerente, a base se manter imutável
	 * diminuindo a possibilidade de bugs no sistema.
	 * 
	 *
	 */
  public class Principal {

    public static void main(String[] args) {

      List<Compra> compras = Arrays.asList(new Compra(Estado.SP, 2000, "Notebook"), new Compra(Estado.RJ, 1000, "Monitor"), new Compra(Estado.BH, 1000, "Mouse"));

      CalculadoraDeEnvioParaProdutos calculadoraEnvioViaTransportadora = new CalculadoraDeEnvioParaProdutos(new FretePorTransportadora(), new CalculaValorProdutoPadrao());
      CalculadoraDeEnvioParaProdutos calculadoraEnvioViaCorreio = new CalculadoraDeEnvioParaProdutos(new FretePorCorreio(), new CalculaValorProdutoPadrao());

      for (Compra compra : compras) {

        System.out.println("Produto: " + compra.getItem() + " Estado: " + compra.getEstado().name() + " Transpportadora - R$: " + calculadoraEnvioViaTransportadora.calcula(compra));
        System.out.println("Produto: " + compra.getItem() + " Estado: " + compra.getEstado().name() + " Correio --------- R$: " + calculadoraEnvioViaCorreio.calcula(compra));
        System.out.println("\n");
      }
    }
  }
```

---

### - Encapsulamento

```java
```
