package praticas;

//Classe Aluno
public class Aluno {
	
	//Atributos (Cacaterísticas)
	private String matricula;
	private String nome;
	//O atributo disciplina vai ser do tipo Disciplina, já que vamos ter que criar uma classe espe
	//cífica para esse atributo, ou seja, teremos um objeto Disciplina que utilizaremos como tipo
	//desse atributo
	private Disciplina disciplina;
	
	//Métodos Getters e Setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	//Encapsulamento, blindagem sobre alguma coisa.
	//Herança
	//Polimorfismo

}
