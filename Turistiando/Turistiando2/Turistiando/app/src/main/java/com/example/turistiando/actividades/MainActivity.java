package com.example.turistiando.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.example.turistiando.R;
import com.example.turistiando.fragments.IFragmentos;
import com.example.turistiando.fragments.InicioFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IFragmentos,InicioFragment.OnFragmentInteractionListener {

    Fragment fragmentInicio;
    GridView grid;
    List<String> lugares;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio=new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,fragmentInicio).commit();

        };

    @Override
    public void iniciarMonserrate() {
        Toast.makeText(getApplicationContext(),"Iniciar Monserrate el activity",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarJardin() {
        Toast.makeText(getApplicationContext(),"Iniciar Jardin el activity",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarJaime() {
        Toast.makeText(getApplicationContext(),"Iniciar Jaime el activity",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarChorro() {
        Toast.makeText(getApplicationContext(),"Iniciar Chorro el activity",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarCandelaria() {
        Toast.makeText(getApplicationContext(),"Iniciar Candelaria el activity",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarTequendama() {
        Toast.makeText(getApplicationContext(),"Iniciar Tequendama el activity",Toast.LENGTH_SHORT).show();
    }


}
