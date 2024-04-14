package estudo;

public class App {
	public static void main(String[] args) {
		// Iphone 12, tela de 6.1", 256gb
		// Glaxy Note 20 Ultra, tela de 6.9", 256gb
		// Xiaomi Mi 11 Pro, tela de 6.81", 128gb
		// <tipoVariavel> nomeVarialvel = valor;
		
		// Declarando um objeto do ripo Celular = Instanciando um objeto
		Celular celularA = new Celular();
		celularA.nome = "Iphone 12";
		celularA.tamanhoTela = 6.1f;
		celularA.espacoArmazenamento = 256;
		celularA.sistemaOperacional = "iOS";
		
		Celular celularB = new Celular(); // objeto celularB
		celularB.nome = "Glaxy Note 20 Ultra"; // com o estado de nome definido para "Galaxy Note 20 Ultra"
		celularB.tamanhoTela = 6.9f;
		celularB.espacoArmazenamento = 256;
		celularB.sistemaOperacional = "Android";
		
		Celular celularC; // Declarando um objeto chamado celularC
		celularC = new Celular(); 
		celularC.nome = "Xiaomi Mi 11 Pro"; 
		celularC.tamanhoTela = 6.81f;
		celularC.espacoArmazenamento = 128;
		celularC.sistemaOperacional = "Android";
		
		//"Celular  " + celularA.nome + " com tela de " + celularA.tamanhoTela
		System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
		System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
		System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);
		
	}
}
