package com.example.ligadajusticapam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MulherMaravilhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulher_maravilha);

        String id = getString(R.string.idheroi) + " " + getString(R.string.idmulhermaravilha);
        String especie = getString(R.string.especieheroi) + " " + getString(R.string.especiemulhermaravilha);
        String habilidade = getString(R.string.habilidadesheroi) + " " + getString(R.string.habilidademulhermaravilha);
        String vulnerabilidade = getString(R.string.vulnerabilidadesheroi) + " " + getString(R.string.vulnerabilidademulhermaravilha);
        String nivelacesso = getString(R.string.nivelacessoheroi) + " " + getString(R.string.nivelacesso02);

        TextView txtvwidheroi = findViewById(R.id.txtvwidheroi);
        TextView txtvwespecieheroi = findViewById(R.id.txtvwespecieheroi);
        TextView txtvwhabilidadeheroi = findViewById(R.id.txtvwhabilidadeheroi);
        TextView txtvwvulneheroi = findViewById(R.id.txtvwvulnerabilidadeheroi);
        TextView txtvwnvlacessoheroi = findViewById(R.id.txtvwnivelacessoheroi);

        txtvwidheroi.setText(id);
        txtvwespecieheroi.setText(especie);
        txtvwhabilidadeheroi.setText(habilidade);
        txtvwvulneheroi.setText(vulnerabilidade);
        txtvwnvlacessoheroi.setText(nivelacesso);
    }

    public void Direcionar(android.view.View btnmaisinfo)
    {
        Uri batman = Uri.parse("https://www.dccomics.com/characters/wonder-woman");
        Intent direcionarmulhermaravilha = new Intent(Intent.ACTION_VIEW, batman);
        startActivity(direcionarmulhermaravilha);
    }

}

