package com.mainApp;

import com.AuxEntidade.*;
import com.entidades.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		
		//printando tudo, qual disciplina o prof d� aula
		System.out.println("===============================================================");
		System.out.println("RDM dos professores                                           |");
		System.out.println("===============================================================");
		System.out.println(ca.getProfessor("Luciana Mignonne").toString());
		System.out.println(ca.getProfessor("Luciana Mignonne"));
		System.out.println("===============================================================\n");
        
        //Alunos matriculados em determinada disciplina
		System.out.println("===============================================================");
		System.out.println("Alunos na Disciplina                                          |");
		System.out.println("===============================================================");
		System.out.println(ca.buscaTurmaPeloNome("Metodos Avancados de Programa��o").toString());
        System.out.println(ca.buscaTurmaPeloNome("Metodos Avancados de Programa��o").mostrarAlunos() + "\n");
		System.out.println("===============================================================\n");

        
        //Quantidade de alunos em cada disciplina
		System.out.println("===============================================================");
		System.out.println("Quantidade de alunos na Disciplina                            |");
		System.out.println("===============================================================");
		System.out.println(ca.buscaTurmaPeloNome("Metodos Avancados de Programa��o").toString());
		System.out.println("Quantidade de Alunos: "+ ca.buscaTurmaPeloNome("Metodos Avancados de Programa��o").quantidadeAlunos());
		System.out.println("===============================================================\n");

        
        //Quais discplinas o aluno esta matriculado
		System.out.println("===============================================================");
		System.out.println("RDM do Aluno                                                  |");
		System.out.println("===============================================================");
		System.out.println(ca.getAluno("Obi-Wan Kenobi").toString());
		System.out.println(ca.getAluno("Obi-Wan Kenobi").getRdm().mostrarDisciplinas());
		System.out.println(ca.getAluno("Obi-Wan Kenobi").toString());
		ca.getHorarioAluno("Obi-Wan Kenobi");
		System.out.println("===============================================================\n");
	}

}
