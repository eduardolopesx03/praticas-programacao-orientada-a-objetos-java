package teste;

//Classe Livro
public class Livro {
	
	//Atributos
	private int Id;
	private String Titulo;
	private String Subtitulo;
	private int VetorDeAutores[] = new int[2];
	private String Edicao;
	private String LocalDePublicacao;
	private String Editora;
	private int AnoDePublicacao;
	
	//Métodos getters e setters
	public int getId () {
		return Id;
	}
	
	public void setId (int Id) {
		this.Id = Id;
	}
	
	public String getTitulo () {
		return Titulo;
	}
	
	public void setTitulo (String Titulo) {
		this.Titulo = Titulo;
	}
	
	public String getSubtitulo () {
		return Subtitulo;
	}
	
	public void setSubtitulo (String Subtitulo) {
		this.Subtitulo = Subtitulo;
	}
	
	public int[] getVetorDeAutores () {
		return VetorDeAutores;
	}
	
	public void setVetorDeAutores (int[] VetorDeAutores) {
		this.VetorDeAutores = VetorDeAutores;
	}
	
	public String getEdicao () {
		return Edicao;
	}
	
	public void setEdicao (String Edicao) {
		this.Edicao = Edicao;
	}
	
	public String getLocalDePublicacao () {
		return LocalDePublicacao;
	}
	
	public void setLocalDePublicacao (String LocalDePublicacao) {
		this.LocalDePublicacao = LocalDePublicacao;
	}
	
	public String getEditora () {
		return Editora;
	}
	
	public void setEditora (String Editora) {
		this.Editora = Editora;
	}
	
	public int getAnoDePublicacao () {
		return AnoDePublicacao;
	}
	
	public void setAnoDePublicacao (int AnoDePublicacao) {
		this.AnoDePublicacao = AnoDePublicacao;
	}
}
