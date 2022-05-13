package academicSystem;

import java.util.List;

public class Aluno {
	
	private String nome;
	private int matAluno;
	private String curso;
	private List<Disciplina> disciplinas;
	
	//getters, setters e construtor
	
	public Aluno(){
		
	}
	
	public Aluno(int matAluno, String nome, String curso) throws ControleAcademicoException{ //exception
		this.setNome(nome);
		this.setMatAluno(matAluno);
		this.setCurso(curso);
		
		if(negativeMat() || nullName() || nullCurso() ) {
			throw new ControleAcademicoException();
		}
	}
	
	public boolean negativeMat() {
		return (this.matAluno <= 0);
	}
	public boolean nullName() {
		return (this.nome.length() == 0);
	}
	public boolean nullCurso() {
		return (this.curso.length() == 0);
	}
	
	public boolean isValidAluno() throws ControleAcademicoException{
		if(negativeMat() || nullName() || nullCurso() ) {
			throw new ControleAcademicoException();
		}
		else{
			return true;
		}
	}
	
	public Aluno(int matAluno, String nome, List<Disciplina> disciplinas) {
		this.setNome(nome);
		this.setMatAluno(matAluno);
		this.setDisciplinas(disciplinas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatAluno() {
		return matAluno;
	}

	public void setMatAluno(int matricula) {
		this.matAluno = matricula;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
