package br.edu.udc.aula03;

public class Pessoa {
	 private String nome;  //so pode usar nessa classe, assim não poderá ser alterado seu valor de outra classe
	 private int rg;		  // obrigando assim a usar o set rg, set cpf
	 private int cpf;
	
	static boolean verificarCpf(int cpf) {
		if(cpf>0)
			return true;
		return false;
	}
	
	public void setNome (String val) {
		nome = val;
	}
	
	public void setRG (int val) {
		rg = val;
	
	}
	
	public void setCPF (int val) {
		if(!verificarCpf(val))
			return;
		cpf = val;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
}
