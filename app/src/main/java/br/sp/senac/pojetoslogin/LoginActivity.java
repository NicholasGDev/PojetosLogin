package br.sp.senac.pojetoslogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void abrirCad(View view) {
        Intent intent = new Intent(getApplicationContext(),CadastroActivity.class);
        startActivity(intent);
    }
}
