package com.zt.dano.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarr);
      //  miActionBar.
        setSupportActionBar(miActionBar);


        listaMascotas =  (RecyclerView) findViewById(R.id.rcmascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarMascotas();
        inicializarAdaptador();




    }

    public void irSegundaActividad(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);


    }



    public void inicializarMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("perro", "buffy", R.drawable.dog1));
        mascotas.add(new Mascota("perro", "bolo", R.drawable.dog2));
        mascotas.add(new Mascota("perro", "sanson", R.drawable.dog3));
        mascotas.add(new Mascota("perro", "manchas", R.drawable.dog4));
        mascotas.add(new Mascota("perro", "greñas", R.drawable.dog6));
        mascotas.add(new Mascota("perro", "bigotes", R.drawable.dog7));




    }


    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);


    }

}
