package getters_setters;

import classes.Conta;
import classes.Pessoa;

public class App {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		// modificador -> setNomeVariavel
		// pegar -> getNomeVariavel
		
		
		pessoa.setNome("Bob Esponja");
		pessoa.setAltura(1.9);
		pessoa.setIdade(20);
		
		/*
		 * System.out.println(pessoa.getNome()); System.out.println(pessoa.getIdade());
		 * System.out.println(pessoa.getAltura());
		 */
		
		
		Conta conta = new Conta();
		System.out.println(conta.getSaldo());
		conta.depositar(100);
		System.out.println(conta.getSaldo());
	}

}
