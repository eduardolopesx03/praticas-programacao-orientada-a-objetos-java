package abstrato;

//Classe Abstrata
//Basciamente uma classe abstrata serve como uma classe modelo para as subclasses 
//herdarem as suas características (não é possível instanciar uma classe abstrata).

//Para definir que a classe (método) vai ser abstrata basta colocar a palavra 
//"abstract" logo após o modificador de acesso.

public abstract class Conta {
	
	private double saldo;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValorSaldo() {
		return saldo;
	}
	
	//Método Abstrato
	//Método abstrato são métodos de uma classe abstrata que não possui implementação 
	//(A implementação desses métodos são feitas nas subclasses). Quando criamos 
	//métodos abstratos na superclasse ele deve ser implementado obrigatoriamente nas 
	//subclasses (cada uma subclasse tratando este método com suas particularidades). 
	//Para se ter um método abstrato a classe deve ser abstrata.

	public abstract double getSaldo();
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saque(double valor) {
		if(valor <= this.saldo) {
			this.saldo =  this.saldo - valor;
		}
	}
	
	
}
