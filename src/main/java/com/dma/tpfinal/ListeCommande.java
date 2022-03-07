package com.dma.tpfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.dma.tpfinal.databinding.ActivityListeCommandeBinding;
import com.dma.tpfinal.databinding.ActivityMainBinding;

public class ListeCommande extends AppCompatActivity {
    ActivityListeCommandeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListeCommandeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        /*CountViewModel model= new ViewModelProvider(this).get(CountViewModel.class);
        model.getCount().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText(integer+"");
            }
        });
        */
        Intent intent=getIntent();
        int count=intent.getIntExtra("count",0);
        binding.etNumCommande.setText(""+count);
    }
}