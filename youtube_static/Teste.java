package pacote1;

public class Teste {
	
	//Para executar métodos e atributos não-estáticos dentro do método main 
	//precisamos instanciar um objeto a partir de uma classe para assim podemos 
	//acessá-los.
	
	static String nome = "Bruce";
	
	public static void main(String[] args) {
		
		System.out.println(nome);
		ola();

	}
	
	static void ola() {
		System.out.println("Olá " + nome);
	}
	
	//a palavra reservada "static" em java significa que o atributo/método agora 
	//pertence a classe e não a instancia, e não vai ser mais preciso instanciar o 
	//objeto para se ter acesso a eles.

}
