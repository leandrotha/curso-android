package com.example.agenda.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.agenda.R;
import com.example.agenda.dao.AlunoDAO;
import com.example.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupView();
    }

    void setupView() {
        setContentView(R.layout.activity_formulario_aluno);

        setTitle("Cadastrar novo aluno");

        Button btnSalvar = findViewById(R.id.activity_formulario_aluno_button_salvar);

        final AlunoDAO dao = new AlunoDAO();

        final EditText tfNome       = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText tfTelefone   = findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText tfEmail      = findViewById(R.id.activity_formulario_aluno_email);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome     = tfNome.getText().toString();
                String telefone = tfTelefone.getText().toString();
                String email    = tfEmail.getText().toString();

                Aluno aluno = new Aluno(nome, telefone, email);
                dao.salva(aluno);

                finish();
            }
        });
    }
}
