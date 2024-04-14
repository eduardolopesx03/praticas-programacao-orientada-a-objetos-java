package classes;

public class Pessoa {
	// Atributos da classe
	private String nome;
	private int idade;
	private float altura;
	private float peso;
	
	// Método Construtor
	// <tipo de visibilidade> <nomeDaClasse>()
	// IMPORTANTE: USAR ATÉ 3 A 4 PARÂMETROS NOS MÉTODOS
	public Pessoa(String nome, int idade, float altura, float peso) {
		System.out.println("Uma pessoa acaba de nascer! Parabéns!");
		this.nome  = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public void imprimirDados() {
		System.out.format("Nome: %s, idade = %d e %.2fm", nome, idade, altura);
	}
	
	// Métodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
