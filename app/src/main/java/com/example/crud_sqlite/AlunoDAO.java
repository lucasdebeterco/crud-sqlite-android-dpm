package com.example.crud_sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class AlunoDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public AlunoDAO(Context context) {
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Aluno aluno) {
        ContentValues values = new ContentValues();
        values.put("nome", aluno.getNome());
        values.put("cpf", aluno.getCpf());
        values.put("telefone", aluno.getTelefone());
        return banco.insert("aluno", null, values);
    }
}

