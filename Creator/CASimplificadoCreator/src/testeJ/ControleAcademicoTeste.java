package testeJ;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import com.AuxEntidade.*;
import com.entidades.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControleAcademicoTeste {
	
	static ControleAcademico ca;

    @BeforeEach
    public void setUp() {

    	ControleAcademico ca = new ControleAcademico();
		
		//add alunos e profs no Controle academico CA -> nome, a matricula e depois o curso que faz
		ca.addProfessorCA("Robson Soares", 404);
		ca.addProfessorCA("Luciana Mignonne", 402);
		ca.addProfessorCA("Louise Ennuyeuse", 401);
		ca.addProfessorCA("Janderson JJJ", 409);
		ca.addProfessorCA("Peter Johnson", 405);
		
		ca.addAlunoCA("Jucelio Lima", 400289, "Computação"); 
		ca.addAlunoCA("Isabel Sousa", 22556, "Computação");
		ca.addAlunoCA("Obi-Wan Kenobi", 646464, "Computação");
		ca.addAlunoCA("Mario Sonic", 424242, "Computação");
		ca.addAlunoCA("Klayton Tarzan", 40028922, "Computação");
		
		// add disciplinas
		ca.cadastrarTurma("Metodos Avancados de Programação", "Terca", "11:00");
		ca.cadastrarTurma("Banco de Dados", "Terca", "07:00");
		ca.cadastrarTurma("Estrutura de dados", "Quarta", "11:00");
		ca.cadastrarTurma("Paradigmas de Programação", "Segunda", "11:00");
		ca.cadastrarTurma("Engenharia de Software 1", "Segunda", "09:00");

		ca.definirProfessorNaDisciplina("Robson Soares", "Banco de Dados");
		ca.definirProfessorNaDisciplina("Luciana Mignonne", "Metodos Avancados de Programação");
		ca.definirProfessorNaDisciplina("Louise Ennuyeuse", "Estrutura de dados");
		ca.definirProfessorNaDisciplina("Janderson JJJ", "Paradigmas de Programação");
		ca.definirProfessorNaDisciplina("Peter Johnson", "Engenharia de Software 1");
		
		//add alunos nas disciplinas
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Metodos Avancados de Programação");
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Paradigmas de Programação");
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Estrutura de dados");
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Isabel Sousa", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Isabel Sousa", "Metodos Avancados de Programação");
		ca.cadastrarAlunosNaDisciplina("Isabel Sousa", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Isabel Sousa", "Paradigmas de Programação");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Metodos Avancados de Programação");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Estrutura de dados");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Paradigmas de Programação");
		ca.cadastrarAlunosNaDisciplina("Mario Sonic", "Estrutura de dados");
		ca.cadastrarAlunosNaDisciplina("Mario Sonic", "Engenharia de Software 1");
    }*/

    @Test
    //testa o cadastro de turmas
    public void testGetAllTurmas() {
    	
        List<Turma> caTurmas = new ArrayList<>();
     
        caTurmas.add(new Turma("Redes", "Terca", "11:00"));
        caTurmas.add(new Turma("APS", "Quarta", "7:00"));
        caTurmas.add(new Turma("Calculo 3", "Sexta", "7:00"));

        assertEquals(caTurmas.getClass(), ca.getListaTurmas().getClass());
    }

    @Test
    //verifica a quantidade de turmas
    
    public void testGetTotalTurmas() {
        assertEquals(5, ca.getListaTurmas().size());
    }

    @Test
    public void testGetTurmaPeloNome() {
        assertEquals("Banco de Dados", ca.buscaTurmaPeloNome("Banco de Dados").getDisciplina().getNome());
    }

    @Test
    public void testGetTurmaPorId() {
        assertEquals("Banco de Dados", ca.getListaTurmas().get(1).getDisciplina().getNome());
    }


    @Test
    public void testAddTurma() {
        ca.cadastrarTurma("Paradigmas de software", "Quinta", "18:00");
        assertEquals("Paradigmas de software", ca.buscaTurmaPeloNome("Paradigmas de software").getDisciplina().getNome());               
    }


    @Test
    public void testGetAlunoPorNome() {
        assertEquals("Jucelio Lima", ca.getAluno("Jucelio Lima").getNome());
    }

    @Test
    public void testGetAlunoPorId() {
        assertEquals(646464, ca.getAluno("Obi-Wan Kenobi").getId());
    }

    @Test
    public void testTotalAlunosTurmas() {
    	//verifica quantidade de alunos matriculado na disciplina
        assertEquals(3, ca.buscaTurmaPeloNome("Banco de Dados").quantidadeAlunos());
    }

    @Test
    public void testGetAllAlunos() {

        List<Aluno> caAlunos = new ArrayList<>();

        caAlunos.add(new Aluno("Roberta", 111, "Computacao"));
        caAlunos.add(new Aluno("Josenelle", 222, "Computacao"));
        caAlunos.add(new Aluno("Joy", 333, "Computacao"));
        caAlunos.add(new Aluno("Eva", 444, "Quimica"));
        caAlunos.add(new Aluno("Pedro", 555, "Matematica"));
        caAlunos.add(new Aluno("Henrique", 666, "Fisica"));

        assertEquals(caAlunos.getClass(), ca.getListaAlunos().getClass());
    }

    @Test
    public void testAddAluno() {
        ca.addAlunoCA("Novo Aluno", 1006 , "Filosofia");
        assertEquals("Novo Aluno", ca.getAluno("Novo Aluno").getNome());
    }

     @Test
    public void testGetProfessorPorNome() {
        assertEquals("Peter Johnson", ca.getProfessor("Peter Johnson").getNome());
    }

    @Test
    public void testGetProfessorPorId() {
        assertEquals(402, ca.getProfessor("Louise Ennuyeuse").getId());
    }

    @Test
    public void testGetProfessorPorIndex() {
        assertEquals("Louise Ennuyeuse", ca.getListaProfessores().get(2).getNome());
    }

    @Test
    public void testGetAllProfessor() {

        List<Professor> caProfessores = new ArrayList<>();

        caProfessores.add(new Professor("Fabio Luiz", 456));
        caProfessores.add(new Professor("Chris Hem", 789));
        caProfessores.add(new Professor("Gamora Luz", 1011));

        assertEquals(caProfessores.getClass(), ca.getListaProfessores().getClass());
    }

    @Test
    public void testAddProfessor() {
        ca.addProfessorCA("Novo Professor", 1516);
        assertEquals("Novo Professor", ca.getProfessor("Novo Professor").getNome());
    }

}
