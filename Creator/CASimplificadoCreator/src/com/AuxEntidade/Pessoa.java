package com.AuxEntidade;

import java.util.List;

import com.entidades.RDM;

public class Pessoa {
    
    private String nome;
    private int id;
    private RDM rdm;

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.rdm = new RDM(); //agreg rdm
    }

    public String getNome() {
        return nome;
    }

    public RDM getRdm() {
        return rdm;
    }

    public int getId() {
        return id;
    }
    
    public boolean adicionarDisciplina(Turma e) {
        return rdm.adicionarDisciplinaRDM(e);
    }

    public List<Turma> mostrarDisciplinasRDM() {
        return rdm.mostrarDisciplinas();
    }
 
    public String toString(){
        return "Nome: " + getNome() + "\nMatricula: " + getId() + "RDM: " + getRdm();
    }
}