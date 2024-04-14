package biblioteca;

public class Livro {
	
	private int identificador;
	private String titulo;
	private String subtitulo;
	private Autor[] vetorDeAutores;
	private int edicao;
	private String localDePublicacao;
	private String editora;
	private int anoDePublicacao;
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public Autor[] getVetorDeAutores() {
		return vetorDeAutores;
	}
	public void setVetorDeAutores(Autor[] vetorDeAutores) {
		this.vetorDeAutores = vetorDeAutores;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getLocalDePublicacao() {
		return localDePublicacao;
	}
	public void setLocalDePublicacao(String localDePublicacao) {
		this.localDePublicacao = localDePublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	

}
