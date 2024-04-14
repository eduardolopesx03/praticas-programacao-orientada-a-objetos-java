import classes.Pessoa;

public class App {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("João II", 97, 1.76f, 88);
		
		pessoa.imprimirDados();
		
		/*
		 * System.out.format("Nome: %s, idade = %d e %.2fm", pessoa.getNome(),
		 * pessoa.getIdade(), pessoa.getAltura());
		 */
	}

}
