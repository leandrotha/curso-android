package com.example.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.agenda.R;
import com.example.agenda.dao.AlunoDAO;
import com.example.agenda.model.Aluno;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupView();
    }

    @Override
    protected void onResume() {
        super.onResume();

        ListView listView = findViewById(R.id.activity_lista_alunos);
        AlunoDAO dao = new AlunoDAO();

        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));
    }

    void setupView() {
        setContentView(R.layout.activity_lista_alunos);

        setTitle("Lista de alunos");

        FloatingActionButton fab = findViewById(R.id.activity_lista_alunos_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaAlunosActivity.this, FormularioAlunoActivity.class));
            }
        });

    }
}
