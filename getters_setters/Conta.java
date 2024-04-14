package classes;

public class Conta {
	private double saldo;
	
	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Não pode depositar número negativo");
		}
		else {
			saldo = saldo + valor;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	/*
	 * public void setSaldo(double saldo) { if (saldo < 0) {
	 * System.out.println("Não pode depositar número negativo"); } else { this.saldo
	 * = this.saldo + saldo; } }
	 */
}
