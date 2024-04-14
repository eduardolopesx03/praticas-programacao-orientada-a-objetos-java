import devflix.Filme;
import devflix.Serie;
import devflix.Video;

public class App {

	public static void main(String[] args) {
		// Polimorfismo 
		// Poli -> muitas
		// morfo -> múltiplas formas
		
		
		// Permite que o mesmo nome, represente vários comportamentos diferentes
		
		//Sobreescrita -> um unico nome -> pode ter comportamentos diferentes
		
		Filme filme = new Filme("Lagoa Azul");
		filme.play();
		filme.play("japonês");
		filme.play("inglês", "árabe");
		
		Serie serie = new Serie("The Last Of US", 2, 10);
		serie.play(2, 8);
	}

}
