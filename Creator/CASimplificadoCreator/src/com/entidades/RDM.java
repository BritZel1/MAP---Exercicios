package com.entidades;

import java.util.ArrayList;
import java.util.List;

import com.AuxEntidade.*;

public class RDM {

    private List<Turma> listaTurmas = new ArrayList<Turma>(); //inst lista de turma

    public boolean adicionarDisciplinaRDM(Turma turma) {

        if (listaTurmas.contains(turma)) {
            return false; //não add retorna o falso
        }
        listaTurmas.add(turma); // disciplina add retorna true
        return true;
    }
    //Mostrar as discplinas
    public List<Turma> mostrarDisciplinas() {
        System.out.println("Lista de Disciplinas: ");
        if (listaTurmas.isEmpty()) {
            return null;
        }
        return getListaTurmas();
    }
    
    //getters e setters
    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    
}
