package testExamples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import academicSystem.*;


class AcademicEntityTest {
	
// teste dos métodos das entidades
	
	 @Test 
	    public void testValidAluno() throws Exception { 
	        Aluno student = new Aluno(1234, "Marie", "Quimica"); 
	        
	        assertTrue(student.isValidAluno()); 
	    }
	 
	 @Test 
	    public void testValidProfessor() throws Exception { 
		 Professor prof = new Professor("Marcia", "Quimica", 12345);
	        
	        assertTrue(prof.isValidProf()); 
	    }
	 
	@Test
	public void testConstructNomeAlunoInvalido() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
                    Aluno student = new Aluno(1234, "", "biologia");
                }, "invalid, should throw"
        );
    }
	
	@Test
	public void testConstructNomeCursoInvalido() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
                    Aluno student = new Aluno(1234, "Mario", "");
                }, "invalid, should throw"
        );
    }
	
	@Test
    public void testConstructMatAlunoInvalida() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
                    Aluno student = new Aluno(-123, "José", "biologia");
                }, "invalid, should throw"
        );
    }
	
	//verificando se é valido ao adicionar as info sem construtor
	@Test
    public void testtMatAlunoInvalida() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
                    Aluno student = new Aluno();
                    student.setNome("Maria");
                    student.setMatAluno(-123);
                    student.setCurso("computação");
                    student.isValidAluno();
                }, "invalid, should throw"
        );
    }
	
	@Test
	public void testListaDeDisciplinasAluno() throws Exception {
		// Armazenando dados do professor
		Professor p1 = new Professor("Paulo", "computação", 51432);
		p1.setDisciplinas(new ArrayList<Disciplina>());
		Disciplina RC = new Disciplina("Ter 09:00 & Qua 11:00", "Redes de Computadores", 10, "B101");
		Disciplina TAL = new Disciplina("Qua 18:00 & Sex 20:00", "Técnicas de Análise de Algoritmos", 02, "B104");

		p1.getDisciplinas().add(RC);
		p1.getDisciplinas().add(TAL);

		assertEquals("Redes de Computadores", p1.getDisciplinas().get(0).getNome());
		assertEquals("Técnicas de Análise de Algoritmos", p1.getDisciplinas().get(1).getNome());		
	}
	
	@Test
    public void testConstructMatProfInvalida() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
                    Professor prof = new Professor("Paulo", "biologia", -123);
                }, "invalid, should throw"
        );
    }
	public void testConstructNomeProfInvalido() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
                    Professor prof = new Professor("", "biologia", 1234);
                }, "invalid, should throw"
        );
    }
	
	public void testConstructNomeDEPInvalido() {
        Assertions.assertThrows(ControleAcademicoException.class, () -> {
                    Professor prof = new Professor("Alice", "", 400289);
                }, "invalid, should throw"
        );
    }
	
	@Test
	public void testListaDeDisciplinas() throws Exception {
		// Armazenando dados do professor
		Professor p1 = new Professor("Paulo", "computação", 51432);
		p1.setDisciplinas(new ArrayList<Disciplina>());
		Disciplina RC = new Disciplina("Ter 09:00 & Qua 11:00", "Redes de Computadores", 10, "B101");
		Disciplina TAL = new Disciplina("Qua 18:00 & Sex 20:00", "Técnicas de Análise de Algoritmos", 02, "B104");

		p1.getDisciplinas().add(RC);
		p1.getDisciplinas().add(TAL);

		assertEquals("Redes de Computadores", p1.getDisciplinas().get(0).getNome());
		assertEquals("Técnicas de Análise de Algoritmos", p1.getDisciplinas().get(1).getNome());		
	}

}
