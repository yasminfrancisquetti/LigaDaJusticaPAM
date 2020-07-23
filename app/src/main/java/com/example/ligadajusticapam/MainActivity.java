package com.example.ligadajusticapam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Continuar(android.view.View btncontinuar)
    {
        Spinner spinner = (Spinner) findViewById(R.id.spinopcao);
        String opcaoselecionada = spinner.getSelectedItem().toString();

        if (opcaoselecionada.equals("MULHER-MARAVILHA"))
        {
            Intent mulhermaravilha = new Intent(this, MulherMaravilhaActivity.class);
            startActivity(mulhermaravilha);
        }
        else if (opcaoselecionada.equals("BATMAN"))
        {
            Intent batman = new Intent(this, BatmanActivity.class);
            startActivity(batman);
        }
        else if (opcaoselecionada.equals("FLASH"))
        {
            Intent flash = new Intent(this, FlashActivity.class);
            startActivity(flash);
        }
        else if (opcaoselecionada.equals("SUPERMAN"))
        {
            Intent superman = new Intent(this, SupermanActivity.class);
            startActivity(superman);
        }
        else
        {
            Toast aviso = Toast.makeText(this, "SELECIONE UMA OPÇÃO!", Toast.LENGTH_LONG);
            aviso.show();
        }
    }
}
