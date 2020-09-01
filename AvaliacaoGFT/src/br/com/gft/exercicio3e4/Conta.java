package br.com.gft.exercicio3e4;

import java.math.BigDecimal;

public abstract class Conta implements Imposto {

	protected String titular;
	protected String numero;
	protected double saldo;

	public Conta(String titular, String numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	abstract double rendimento();

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
