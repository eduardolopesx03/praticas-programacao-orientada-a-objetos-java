package praticas;

//Classe que faria parte de um dos atributos da classe aluno mas que por ter tambem suas caracterís
//ticas foi necessário criar uma classe sseparada.
public class Disciplina {

	private String sigla;
	private String descricao;
	private Integer cargahoraria;
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(Integer cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	
	
	
	
	
	
}
