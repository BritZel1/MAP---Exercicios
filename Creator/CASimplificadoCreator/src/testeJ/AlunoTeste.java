package testeJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.entidades.*;
import com.AuxEntidade.*;


class AlunoTeste {
	
	 static ControleAcademico ca;

	@BeforeEach
	void setUp(){
		
		ControleAcademico ca = new ControleAcademico();
		
		//add alunos e profs no Controle academico CA -> nome, a matricula e depois o curso que faz
		ca.addProfessorCA("Robson Soares", 404);
		ca.addProfessorCA("Luciana Mignonne", 401);
		ca.addProfessorCA("Louise Ennuyeuse", 401);
		ca.addProfessorCA("Janderson JJJ", 409);
		ca.addProfessorCA("Peter Johnson", 405);
		
		ca.addAlunoCA("Jucelio Lima", 400289, "Computa��o"); 
		ca.addAlunoCA("Isabel Sousa", 22556, "Computa��o");
		ca.addAlunoCA("Obi-Wan Kenobi", 646464, "Computa��o");
		ca.addAlunoCA("Mario Sonic", 424242, "Computa��o");
		ca.addAlunoCA("Klayton Tarzan", 40028922, "Computa��o");
		
		// add disciplinas
		ca.cadastrarTurma("Metodos Avancados de Programa��o", "Terca", "11:00");
		ca.cadastrarTurma("Banco de Dados", "Terca", "07:00");
		ca.cadastrarTurma("Estrutura de dados", "Quarta", "11:00");
		ca.cadastrarTurma("Paradigmas de Programa��o", "Segunda", "11:00");
		ca.cadastrarTurma("Engenharia de Software 1", "Segunda", "09:00");

		ca.definirProfessorNaDisciplina("Robson Soares", "Banco de Dados");
		ca.definirProfessorNaDisciplina("Luciana Mignonne", "Metodos Avancados de Programa��o");
		ca.definirProfessorNaDisciplina("Louise Ennuyeuse", "Estrutura de dados");
		ca.definirProfessorNaDisciplina("Janderson JJJ", "Paradigmas de Programa��o");
		ca.definirProfessorNaDisciplina("Peter Johnson", "Engenharia de Software 1");
		
		//add alunos nas disciplinas
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Metodos Avancados de Programa��o");
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Paradigmas de Programa��o");
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Estrutura de dados");
		ca.cadastrarAlunosNaDisciplina("Jucelio Lima", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Isabel Sousa", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Isabel Sousa", "Metodos Avancados de Programa��o");
		ca.cadastrarAlunosNaDisciplina("Isabel Sousa", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Isabel Sousa", "Paradigmas de Programa��o");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Banco de Dados");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Metodos Avancados de Programa��o");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Estrutura de dados");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Paradigmas de Programa��o");
		ca.cadastrarAlunosNaDisciplina("Mario Sonic", "Estrutura de dados");
		ca.cadastrarAlunosNaDisciplina("Mario Sonic", "Engenharia de Software 1");
    }
	
	
	 //Faz a verifica��o se a lista de discplina do aluno est� vazia
	@Test
    public void listaVaziaAlunos(){
        assertNotNull(ca.getAluno("Klayton Tarzan").getRdm().mostrarDisciplinas());
    }
	
	 //testa se alunos s�o diferentes
	 @Test
	 public void testeAlunosDiferentes(){
		 assertNotEquals(ca.getAluno("Isabel Sousa"), ca.getAluno("Obi-Wan Kenobi"));
	 }
	  
	 @Test
	 //teste de cadastro aluno em disciplina que ele nao ta matriculado
	  public void contaisAll(){
	     assertFalse(ca.getAluno("Isabel Sousa").getRdm().mostrarDisciplinas().containsAll(ca.getListaTurmas()));
	     ca.cadastrarAlunosNaDisciplina("Isabel Sousa", "Estrutura de dados");
	     assertTrue(ca.getAluno("Isabel Sousa").getRdm().mostrarDisciplinas().containsAll(ca.getListaTurmas()));
	  }

	@Test
	//Faz a verifica��o  se as disciplinas de Teste aluno e o "Mario Sonic" estao iguais
    public void testDisciplinasIguais(){
        ca.addAlunoCA("Aluno Teste", 1006, "Computacao");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Engenharia de Software 1");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Metodos Avancados de Programacao");
		ca.cadastrarAlunosNaDisciplina("Aluno Teste", "Estrutura de dados");
        assertEquals(ca.getAluno("Aluno Teste").getRdm().getListaTurmas(), ca.getAluno("Mario Sonic").getRdm().getListaTurmas());

    }
	
	@Test
	//se aluno nao tiver cadastrado na disciplina ele retorna true, aqui vai retornar false quando tentar colocar aluno na msm disciplina.
    public void testeAlunoAddDisciplina() {
        assertTrue(ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Banco de Dados"));
        assertFalse(ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Metodos Avancados de Programa��"));
        assertFalse(ca.cadastrarAlunosNaDisciplina("Obi-Wan Kenobi", "Estrutura de dados")); 

    }
	
	@Test
    //testar numero de disciplina matriculadas por aluno
    public void testNumDisciplinas(){
        assertEquals(2, ca.getAluno("Mario Sonic").getRdm().getListaTurmas().size());
        assertTrue(ca.cadastrarAlunosNaDisciplina("Mario Sonic", "Paradigmas de Programa��o"));
        assertEquals(3, ca.getAluno("Mario Sonic").getRdm().getListaTurmas().size());
    }
	
	@Test
    public void testAlunoDados(){
    	//verifica informa��es do aluno
        Aluno alunoTeste = new Aluno("Obi-Wan Kenobi", 646464, "Computa��o");
        assertEquals(alunoTeste.getCurso(), ca.getAluno("Obi-Wan Kenobi").getCurso());
        assertEquals(alunoTeste.getId(), ca.getAluno("Obi-Wan Kenobi").getId());
        assertEquals(alunoTeste.getNome(), ca.getAluno("Obi-Wan Kenobi").getNome());
        assertEquals(alunoTeste.getRdm().getClass(), ca.getAluno("Obi-Wan Kenobi").getRdm().getClass());
    }
	
	
}
