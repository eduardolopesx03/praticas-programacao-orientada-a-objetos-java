package estudo1;

import java.util.Random;

public class Personagem {
	String nome;
	int nivel;
	int forca;
	
	// void -> significa que não está retornando
	void mostrarStatus() {
		System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
	}
	
	int caucularDano() {
		Random gerador = new Random();
		// 1...20
		//nextInt(): 0...19
		//nextInt(): 0 -> 20
		int dado20Faces = 1 + gerador.nextInt(19);
		int dano = forca + dado20Faces;
		return dano;
	}
	
	String gerarNome() {
		String nome = "Lucas";
		return nome;
	}
	
	void atacar(String alvo, String habilidade) {
		int danoCausado = caucularDano();
		if (habilidade.length() == 0) {
			System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
		}
		else {
			System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);
		}
	}
}
