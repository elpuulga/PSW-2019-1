package br.edu.udc.aula02;

public class Aula02 {
	
	public static void main(String[] args) {
		int valor = 34;
		String frase = "Um programa em Java!";
		String frase_2 = "um programa java";
			
		System.out.printf("Estruturando sa�da com:\nTexto: %s\nValor Inteiro: %d\n",frase,valor);
		
		System.out.printf("Caracter�sticas da String:\nComprimento: %d" 
				+ "\nConcatena��o: %s\nCompara��o: \"%s\" = \"%s\" -> %b",
				frase.length(), frase + "Aumentando a frase...",
				frase, frase_2, frase.compareTo(frase_2));
		System.out.printf("\nCompara��o2: \"%s\" = \"%s\" -> %b\n", frase, frase_2, frase.equals(frase_2));
		
		Aula02 obj = new Aula02();
		obj.repetirFrase(frase , 3);
	
		AulaClasse02.mostrarAoContrario(frase);
		
	}
	
	void repetirFrase(String frase, int vezes) {
		for(int i = 0; i<vezes; i++) {
			System.out.println(frase);
		}
	}
	
}





























