package excecoes;

public class Excecao {

	public static void main(String[] args) {
		//Estrutura (Sintaxe) de tratamento de exceções
		try {
			//Bloco que é monitorado para erros
			//Criação de um vetor com 4 posições (posição 0 até o 3)
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			//Atribuindo um valor na posição 4 do vetor (inexistente)
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso");
		}
		//TipoDaException exception
		catch (ArrayIndexOutOfBoundsException exception) {
			//Tratamento do erro
			System.out.println("Exceção ao acessar um índice do vetor que não existe");
		}
		
		System.out.println("Esse texto será impresso após a exception");
		
		//Basicamente o que ocorrerá neste programa vai ser: utilizamos a estrutura
		//(Sintaxe) try/catch para tratamento de exceções. No caso usamos o try para
		//monitorar erros, caso tenha algum erro dentro do try o programa irá pular
		//direto para o catch. E dentro do catch é aonde ocorrerá o tratamento do erro,
		//mas antes temos que indicar o "TipoDaException exception".
	}

}
