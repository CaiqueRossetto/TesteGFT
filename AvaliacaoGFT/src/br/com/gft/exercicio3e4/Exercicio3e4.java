package br.com.gft.exercicio3e4;

public class Exercicio3e4 {
	
	public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Caique", "7777", 2500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Goku", "5555", 3200.00);

        System.out.println("Conta Corrente: ");
        System.out.println(contaCorrente.getTitular());
        System.out.println(contaCorrente.getNumero());
        System.out.println(contaCorrente.getSaldo());
        System.out.println("rendimento: " + contaCorrente.rendimento());
        System.out.println("imposto: " + contaCorrente.calcularImposto());

        System.out.println("");

        System.out.println("Conta Poupança: ");
        System.out.println(contaPoupanca.getTitular());
        System.out.println(contaPoupanca.getNumero());
        System.out.println(contaCorrente.getSaldo());
        System.out.println("rendimento: " + contaPoupanca.rendimento());
		System.out.println("imposto: " + contaPoupanca.calcularImposto());
	}

}
