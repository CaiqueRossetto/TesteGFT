package br.com.gft.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro intervalo: ");
		int valor1 = entrada.nextInt();
		System.out.println("Digite o valor do segundo intervalo: ");
		int valor2 = entrada.nextInt();

		for (int i = valor1; i <= valor2; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

}
