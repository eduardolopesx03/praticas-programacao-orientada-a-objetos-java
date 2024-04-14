package pratica1;

//Classe Livro
public class Livro {

	//Atributos
	private int Id;
	private String titulo;
	private String subtitulo;
	private String VetorAutores[] = new String [2];
	private int edicao;
	private String LocalPublicacao;
	private String editora;
	private int AnoPublicacao;
	
	//Métodos getters e setters
	public int getId () {
		return Id;
	}
	
	public void setId (int Id) {
		this.Id = Id;
	}
	
	public String getTitulo () {
		return titulo;
	}
	
	public void setTitulo (String titulo) {
		this.titulo = titulo;
	}
	
	public String getSubtitulo () {
		return subtitulo;
	}
	
	public void setSubtitulo (String subtitulo) {
		this.subtitulo = subtitulo;
	}
	
	public String[] getVetorAutores () {
		return VetorAutores;
	}
	
	public void setVetorAutores (String[] VetorAutores) {
		this.VetorAutores = VetorAutores;
	}
	
	public int getEdicao () {
		return edicao;
	}
	
	public void setEdicao (int edicao) {
		this.edicao = edicao;
	}
	
	public String getLocalPublicacao () {
		return LocalPublicacao;
	}
	
	public void setLocalPublicacao (String LocalPublicacao) {
		this.LocalPublicacao = LocalPublicacao;
	}
	
	public String getEditora () {
		return editora;
	}
	
	public void setEditora (String editora) {
		this.editora = editora;
	}
	
	public int getAnoPublicacao () {
		return AnoPublicacao;
	}
	
	public void setAnoPublicacao (int AnoPublicacao) {
		this.AnoPublicacao = AnoPublicacao;
	}
	
}
