package br.edu.udc.aula02;

public class AulaClasse02 {

	
//n�o tem o main (n�o � executavel)
	
	static void mostrarAoContrario(String frase) {
		for(int i =1; i <= frase.length(); i++ )
			System.out.printf("%c", frase.charAt(frase.length() -i ));
	}
}
