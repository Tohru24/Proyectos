package com.example.turistiando.actividades;

import android.os.Bundle;

import com.example.turistiando.databinding.ActivityContenedorBinding;
import com.example.turistiando.fragments.CandelariaFragment;
import com.example.turistiando.fragments.ChorroFragment;
import com.example.turistiando.fragments.JaimeFragment;
import com.example.turistiando.fragments.JardinFragment;
import com.example.turistiando.fragments.MonserrateFragment;
import com.example.turistiando.fragments.TequendamaFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.turistiando.actividades.ui.main.SectionsPagerAdapter;


public class ContenedorActivity extends AppCompatActivity implements CandelariaFragment.OnFragmentInteractionListener, ChorroFragment.OnFragmentInteractionListener, JaimeFragment.OnFragmentInteractionListener, JardinFragment.OnFragmentInteractionListener, MonserrateFragment.OnFragmentInteractionListener, TequendamaFragment.OnFragmentInteractionListener {

    private ActivityContenedorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityContenedorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);

    }
}