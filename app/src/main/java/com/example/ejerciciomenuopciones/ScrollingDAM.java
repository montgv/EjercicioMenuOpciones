package com.example.ejerciciomenuopciones;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.ejerciciomenuopciones.databinding.ActivityScrollingDamBinding;

public class ScrollingDAM extends AppCompatActivity {

    private ActivityScrollingDamBinding binding;

    /*
    Esta actividad se compone de un encabezado con un titulo, un contennido desplazable y un boton
    flotante que al pulsarlo te lleva a la actividad principal
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScrollingDamBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        binding.fab.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
    }
}