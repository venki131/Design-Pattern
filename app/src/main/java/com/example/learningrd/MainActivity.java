package com.example.learningrd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.learningrd.MVC.view.PersonNameMVC;
import com.example.learningrd.MVP.view.PersonNameMVP;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMvc;
    private Button btnMvp;
    private Button btnMvvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
    }

    private void initUi() {
        btnMvc = findViewById(R.id.btn_mvc);
        btnMvp = findViewById(R.id.btn_mvp);
        btnMvvm = findViewById(R.id.btn_mvvm);

        initClickListener();
    }

    private void initClickListener() {
        btnMvc.setOnClickListener(this);
        btnMvp.setOnClickListener(this);
        btnMvvm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_mvc:
                intent = new Intent(this, PersonNameMVC.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            case R.id.btn_mvp:
                intent = new Intent(this, PersonNameMVP.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            case R.id.btn_mvvm:
                break;
        }
    }
}
