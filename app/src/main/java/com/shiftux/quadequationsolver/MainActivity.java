package com.shiftux.quadequationsolver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.shiftux.quadequationsolver.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bind= DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        MyEquation equation=  new MyEquation(bind);

        bind.setSolution(equation);
    }
}