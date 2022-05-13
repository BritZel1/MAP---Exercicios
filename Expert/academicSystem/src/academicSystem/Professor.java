package academicSystem;

import java.util.List;

public class Professor {
	private String nome;
	private String departamento;
	private int matProfessor;
	private List<Disciplina> disciplinas;

	public Professor() {

	}

	public Professor(String nome, String departamento, int matProfessor) throws ControleAcademicoException { //exception
		this.setNome(nome);
		this.setDepartamento(departamento);
		this.setMatProfessor(matProfessor);
		
		if(negativeMat() || nullName() || nullDep() ) {
			throw new ControleAcademicoException();
		}
	}
	
	public boolean isValidProf() throws ControleAcademicoException{
		if(negativeMat() || nullName() || nullDep() ) {
			throw new ControleAcademicoException();
		} 
		else{
			return true;
		}
	}
	
	public boolean negativeMat() {
		return (this.matProfessor <= 0);
	}
	public boolean nullName() {
		return (this.nome.length() == 0);
	}
	public boolean nullDep() {
		return (this.departamento.length() == 0);
	}

	public Professor(String nome, String departamento, int matProfessor, List<Disciplina> disciplinas) {
		this.setNome(nome);
		this.setDepartamento(departamento);
		this.setMatProfessor(matProfessor);
		this.setDisciplinas(disciplinas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getMatProfessor() {
		return matProfessor;
	}

	public void setMatProfessor(int matProfessor) {
		this.matProfessor = matProfessor;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
