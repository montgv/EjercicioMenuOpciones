package com.example.ejerciciomenuopciones;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.ejerciciomenuopciones.databinding.ActivityScrollingAsirBinding;

public class ScrollingASIR extends AppCompatActivity {

    private ActivityScrollingAsirBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScrollingAsirBinding.inflate(getLayoutInflater());
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