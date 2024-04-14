package abstrato;

public class ContaPoupanca extends Conta {
	
	private float taxadesaque;

	public float getTaxadesaque() {
		return taxadesaque;
	}

	public void setTaxadesaque(float taxadesaque) {
		this.taxadesaque = taxadesaque;
	}
	
	@Override
	public void saque(double valor) {
		super.saque(valor + this.taxadesaque);
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
