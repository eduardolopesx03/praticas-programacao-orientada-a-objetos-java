package abstrato;

public class Heranca {

	public static void main(String[] args) {
		//Não é possível instanciar uma classe abstrata
		/* Conta a = new Conta(); */
		
		//ContaCorrente está herdando as características de conta
		ContaCorrente a = new ContaCorrente();
	}

}
