package testExamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import academicSystem.*;

class ControleAcademicoTest {

	//não utilizado before pra instanciar todos objetos
	
	ControleAcademico ca = new ControleAcademico();
	
	 @Test 
	    public void testAddAlunoNoSistema() throws Exception { 
	        Aluno student = new Aluno(1234, "Olsen", "matematica"); 
	        ca.realizaMatricula(student);
	        assertTrue(ca.isMatriculado(student)); 
	    }
	 
	 @Test
	 	public void testAddAlunoNoSistemaInvalid() throws Exception { 
	 	Assertions.assertThrows(ControleAcademicoException.class, () -> {
	 		Aluno student = new Aluno(-1234, "Olsen", "matematica"); 
	        ca.realizaMatricula(student);
	        assertTrue(ca.isMatriculado(student)); 
                }, "invalid, should throw"
        );
	        
	    }
	 
	 
	 @Test 
	    public void testAddProfNoSistema() throws Exception { 
	        Professor prof = new Professor("Paulo", "computação", 51432);
	        ca.defineProfessor(prof);
	        assertTrue(ca.isMatriculadoProf(prof));
	    }
	 
	 @Test 
	    public void testAddDisciplinaNoSistema() throws Exception { 
	        Disciplina materia = new Disciplina("Seg 11:00 & Qua 09:00", "Matematica", 12, "B103"); 
	        ca.cadastraDisciplina(materia);
	        assertTrue(ca.existDisciplina(materia)); 
	    }
	 
	 @Test 
	    public void testImprimeDados() throws Exception { 
	        ca.mostraInformacoes();
	    }
	 
	 
}
