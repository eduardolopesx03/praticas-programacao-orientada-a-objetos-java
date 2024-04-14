package biblioteca;

public class Executor {

	public static void main(String[] args) {
		//Castrando o primeiro autor
		Autor autor1 = new Autor();
		autor1.setIdentificador(1);
		autor1.setNomeCompleto("Lázaro Ramos");


		//Castrando o segundo autor
		Autor autor2 = new Autor();
		autor2.setIdentificador(2);
		autor2.setNomeCompleto("Jorge Amado");


		//Castrando o primeiro livro
		Livro livro1 = new Livro();
		livro1.setIdentificador(1);
		livro1.setTitulo("Na minha pele");
		livro1.setSubtitulo("");
		//Basciamnete a linha de código a baixo está armazenando o autor1 no vetor de autores
		//criado na classe Livro. Autor esse que cadastramos acima, no caso desse livro será o 
		//Jorge Amado.
		livro1.setVetorDeAutores(new Autor[] { autor1 });
		livro1.setEdicao(1);
		livro1.setLocalDePublicacao("Rio de Janeiro");
		livro1.setEditora("objetiva");
		livro1.setAnoDePublicacao(2017);


		//Castrando o segundo livro
		Livro livro2 = new Livro();
		livro2.setIdentificador(1);
		livro2.setTitulo("Tenda dos milagres");
		livro2.setSubtitulo("");
		//Aqui acontece a mesma coisa que no cadastramento do livro1 só que dessa vez com o
		//autor2, que será Jorge Amado.
		livro2.setVetorDeAutores(new Autor[] { autor2 });
		livro2.setEdicao(1);
		livro2.setLocalDePublicacao("São Paulo");
		livro2.setEditora("Companhia das Letras");
		livro2.setAnoDePublicacao(2008);


		//Consultas específica que devem ter retornos possíveis com a solução:
		//a) livros de um autor
		//b) livro pelo título
		//c) autores pelo título
		
		

	}

}
