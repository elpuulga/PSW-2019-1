package br.edu.udc.aula03;

import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
	//	pessoa.setNome("Fulano de Tal");
	//	pessoa.setRG(1234);
	//	pessoa.setCPF(-56789);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa");
		String nome = sc.nextLine(); //pegar caracteres até que a pessoa pressione enter
		System.out.println("Digite o RG da pessoa");
		int rg = sc.nextInt();
		System.out.println("Digite o CPF da pessoa");
		int cpf = sc.nextInt();
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome(nome);
		pessoa2.setRG(rg);
		pessoa2.setCPF(cpf);
		System.out.println(pessoa2);
	}

}
