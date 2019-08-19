package com.example.agenda.dao;

import com.example.agenda.model.Aluno;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private final static List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<Aluno>(alunos);
    }
}
