package com.example.exercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TrataMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trata_mensagem);

        Intent i = getIntent();
        CharSequence msg = i.getExtras().getString("msg");
        TextView v = findViewById(R.id.textView);
        v.setText(msg);

    }
}