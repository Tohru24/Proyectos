package com.example.turistiando.actividades.ui.main.ui.main;

import android.app.AlertDialog;
import android.os.Bundle;

import com.example.turistiando.R;
import com.example.turistiando.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import com.example.turistiando.fragments.CandelariaFragment;
import com.example.turistiando.fragments.ChorroFragment;
import com.example.turistiando.fragments.JaimeFragment;
import com.example.turistiando.fragments.JardinFragment;
import com.example.turistiando.fragments.MonserrateFragment;
import com.example.turistiando.fragments.TequendamaFragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.turistiando.actividades.ui.main.ui.main.ui.main.SectionsPagerAdapter;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ContenedorActivity extends AppCompatActivity implements CandelariaFragment.OnFragmentInteractionListener, ChorroFragment.OnFragmentInteractionListener, JaimeFragment.OnFragmentInteractionListener, JardinFragment.OnFragmentInteractionListener, MonserrateFragment.OnFragmentInteractionListener, TequendamaFragment.OnFragmentInteractionListener {

    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_contenedor);
        mSectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.contenedorFragments);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(ContenedorActivity contenedorActivity, FragmentManager fm) {
            super(fm);
        }
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1);
    }

    public Fragment newInstance(int SectionNumber){
        Fragment fragment = null;

        switch (SectionNumber){
            case 1:fragment=new MonserrateFragment();break;
            case 2:fragment=new JardinFragment();break;
            case 3:fragment=new JaimeFragment();break;
            case 4:fragment=new ChorroFragment();break;
            case 5:fragment=new CandelariaFragment();break;
            case 6:fragment=new TequendamaFragment();break;

        }
        return fragment;
    }

    public int getCount(){
        return 8;
    }


}

}
