package br.com.gft.exercicio2;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Caique Rossetto");
		pessoa.setEndereco("Rua 23 de maio, S�o Paulo");
		pessoa.setTelefone("99987-1254");
		
		System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endere�o: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
		
		
		
	}

}
