package com.example.crud_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText cpf;
    private EditText telefone;
    private AlunoDAO dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editNome);
        cpf = findViewById(R.id.editCpf);
        telefone = findViewById(R.id.editTelefone);
        dao = new AlunoDAO(this);

    }

    public void salvar(View view) {
        Aluno aluno = new Aluno();
        aluno.setNome(nome.getText().toString());
        aluno.setCpf(cpf.getText().toString());
        aluno.setTelefone(telefone.getText().toString());
        long id = dao.inserir(aluno);
        Toast.makeText(this, "id" + id, Toast.LENGTH_SHORT).show();
    }
}