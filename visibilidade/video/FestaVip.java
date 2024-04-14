package video;

public class FestaVip {
	// <modificador> <tipo> <nome-atributo>
	private int quantidadeCafe = 38;
	private int quantidadeSalgado = 50;
	
	public void entrar() {
		beberCafe();
		comerSalgado();
		beberCafe();
	}
	
	// <modificador> <retorno-método> <nome-método>
	private void beberCafe() {
		quantidadeCafe--;
		System.out.println("Bebeu 1 xícara de café");
	}
	
	private void comerSalgado() {
		quantidadeSalgado--;
		System.out.println("Comeu 6 salgados");
	}
}
