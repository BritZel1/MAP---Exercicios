package academicSystem;

import java.util.ArrayList;

public class ControleAcademico {
	
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	//checar se já existe 
	public boolean isMatriculado(Aluno student) {
		return this.alunos.contains(student);
	}
	
	public boolean isMatriculadoProf(Professor prof) {
		return this.professores.contains(prof);
	}
	
	public boolean existDisciplina(Disciplina materia) {
		return this.disciplinas.contains(materia);
	}
	
	public void realizaMatricula(Aluno aluno) throws Exception{
		alunos.add(aluno);
	}
		

	public void defineProfessor(Professor professor) {
		professores.add(professor);
		
	}
	
	

	public void cadastraDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	public String mostraInformacoes() {
		String str = "";
		int count = 0;
		// Informa sobre os professores
		while (count < professores.size()) {
			// Escreve nome do professor
			str += "Professor: " + professores.get(count).getNome() + "\n";

			// Escreve disciplinas ministradas pelo professor e horario
			for (int i = 0; i < professores.get(count).getDisciplinas().size(); i++) {
				str += "Disciplina: " + professores.get(count).getDisciplinas().get(i).getNome();
				str += "\tHorario: " + professores.get(count).getDisciplinas().get(i).getHorario() + "\n";
			}

			count++;
		}
		// Informa sobre as disciplinas
		count = 0;

		while (count < disciplinas.size()) {
			str += "\nDisciplina: " + disciplinas.get(count).getNome() + "\n";
			for (int i = 0; i < disciplinas.get(count).getAlunos().size(); i++) {
				str += "Aluno(a): " + disciplinas.get(count).getAlunos().get(i).getNome() + "\n";
			}
			str += "Numero de alunos:" + disciplinas.get(count).getAlunos().size() + "\n";
			count++;
		}

// Informa sobre os alunos
		count = 0;

		while (count < alunos.size()) {
			str += "\nAluno: " + alunos.get(count).getNome() + "\n";
			for (int i = 0; i < alunos.get(count).getDisciplinas().size(); i++) {
				str += "Disciplina: " + alunos.get(count).getDisciplinas().get(i).getNome();
				str += "\tHorario: " + alunos.get(count).getDisciplinas().get(i).getHorario() + "\n";
			}
			count++;
		}

		if (alunos.size() == 0) {
			str += "Nenhum aluno matriculado!\n";
		}

		return str;
	}

	
	
}
