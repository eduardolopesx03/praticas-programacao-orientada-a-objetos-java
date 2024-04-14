package teste;

//Classe Biblioteca
public class Biblioteca {

	//instanciamento de um objeto em uma classe
	public static void main(String[] args) {
		Autor Autor = new Autor();
		Autor.setNomeCompleto("Lázaro Ramos");
		Autor.setId(12345678);
		
		//Teste
		System.out.println(Autor.getNomeCompleto() + " tem o identificador " + Autor.getId());
	}

}
