import heranca2.Serie;

public class App {

	public static void main(String[] args) {
		Serie serieQualquer = new Serie("The Last of US", 1, 2023);
		/* System.out.println(serieQualquer.pegarInformacoes()); */
		
		
		// NomeDaClasse@
		System.out.println(serieQualquer.toString());
		System.out.println(serieQualquer); // implicita
	}

}
