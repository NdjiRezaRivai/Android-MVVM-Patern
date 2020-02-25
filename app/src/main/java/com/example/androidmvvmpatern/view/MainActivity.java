package com.example.androidmvvmpatern.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.androidmvvmpatern.R;
import com.example.androidmvvmpatern.databinding.ActivityMainBinding;
import com.example.androidmvvmpatern.viewModel.ViewModelData;

public class MainActivity extends AppCompatActivity {

    private ViewModelData viewModelData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
    }

    private void initDataBinding(){
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModelData = ViewModelProviders.of(this).get(ViewModelData.class);
        binding.setDataModel(viewModelData);

    }
}
