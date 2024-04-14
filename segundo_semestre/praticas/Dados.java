package praticas;

//Classe Construtora (Informar os determinados dados dos atributos do objeto criado na classe Aluno)
public class Dados {

	public static void main(String[] args) {
		//Para informar os dados dos atributos utilizaremos o nosso objeto através da classe Aluno
		//e para os determinado atributo utilizaremos somente o método set.
		Aluno aluno1 = new Aluno();
		
		aluno1.setMatricula("12345678");
		aluno1.setNome("Aluno 1");
		
		
		Disciplina poo = new Disciplina();
		poo.setSigla("POO");
		poo.setDescricao("Programação Orientada a Objetos");
		poo.setCargahoraria(60);
		
		aluno1.setDisciplina(poo);
		
		//Depois de passar os dados desejadas para os atributos, se quisermos imprimir essas in
		//formações utilizaremos os métodos get.
		System.out.println("Matrícula do" + " aluno1: " + aluno1.getMatricula());
		System.out.println("A disciplina associada " + "ao aluno1 é " + aluno1.getDisciplina().getSigla());
	}
	
}
