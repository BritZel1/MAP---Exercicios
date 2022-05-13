package academicSystem;

import java.util.ArrayList;

public class RunControleAcademico {

	public static void main(String[] args) throws Exception {
		String str;

		// Armazenando dados do professor
		Professor p1 = new Professor("Paulo", "computação", 51432);
		p1.setDisciplinas(new ArrayList<Disciplina>());
		Disciplina RC = new Disciplina("Ter 09:00 & Qua 11:00", "Redes de Computadores", 10, "B101");
		Disciplina TAL = new Disciplina("Qua 18:00 & Sex 20:00", "Técnicas de Análise de Algoritmos", 02, "B104");

		p1.getDisciplinas().add(RC);
		p1.getDisciplinas().add(TAL);

		// Armazenando dados dos alunos
		Aluno a1 = new Aluno(123456, "Carlos", "computação");
		a1.setDisciplinas(new ArrayList<Disciplina>());

		Disciplina MAP = new Disciplina("Ter 11:00 & Sex 11:00", "Metodos Avançados em Programação", 07, "B101");
		Disciplina ESWI = new Disciplina("Seg 09:00 & Qui 11:00", "Engenharia de Softwares I", 05, "B101");
		Disciplina PLC = new Disciplina("Seg 11:00 & Qua 09:00", "Paradigmas de Linguagem Computacional", 03, "B103");

		a1.getDisciplinas().add(MAP);
		a1.getDisciplinas().add(ESWI);
		a1.getDisciplinas().add(PLC);

		Aluno a2 = new Aluno(123456, "Matheus", "computação");
		a2.setDisciplinas(new ArrayList<Disciplina>());
		a2.getDisciplinas().add(MAP);
		a2.getDisciplinas().add(ESWI);
		a2.getDisciplinas().add(PLC);

		Aluno a3 = new Aluno(123456, "Mariana", "computação");
		a3.setDisciplinas(new ArrayList<Disciplina>());
		a3.getDisciplinas().add(MAP);
		a3.getDisciplinas().add(ESWI);
		a3.getDisciplinas().add(PLC);

		Aluno a4 = new Aluno(123456, "Rafaela", "computação");
		a4.setDisciplinas(new ArrayList<Disciplina>());
		a4.getDisciplinas().add(MAP);
		a4.getDisciplinas().add(ESWI);
		a4.getDisciplinas().add(PLC);

		Aluno a5 = new Aluno(123456, "Renan", "computação");
		a5.setDisciplinas(new ArrayList<Disciplina>());
		a5.getDisciplinas().add(MAP);
		a5.getDisciplinas().add(ESWI);
		a5.getDisciplinas().add(PLC);

		// Armazenando os alunos que fazem parte de uma disciplina
		MAP.setAlunos(new ArrayList<Aluno>());

		MAP.getAlunos().add(a1);
		MAP.getAlunos().add(a2);
		MAP.getAlunos().add(a3);
		MAP.getAlunos().add(a4);
		MAP.getAlunos().add(a5);

		ControleAcademico ca = new ControleAcademico();

		ca.realizaMatricula(a1); // Realiza matricula com os dados e disciplinas escolhidas pelo aluno

		ca.defineProfessor(p1); // Define as disciplinas que um professor vai ensinar horário e sala

		ca.cadastraDisciplina(MAP);

		str = ca.mostraInformacoes(); /*
										 * Armazena as informacoes sobre a matricula dos alunos, definicao de professor
										 * e disciplinas ofertadas
										 */

		System.out.println(str);

	}

}
