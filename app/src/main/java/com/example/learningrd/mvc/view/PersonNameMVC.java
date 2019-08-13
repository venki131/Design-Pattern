package com.example.learningrd.mvc.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.learningrd.mvc.controller.ControllerMVC;
import com.example.learningrd.R;

public class PersonNameMVC extends AppCompatActivity implements View.OnClickListener {

    //UI properties
    private TextView mMessageView;
    private EditText mFirstNameEditText;
    private EditText mLastNameEditText;
    private ControllerMVC controllerMVC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_name_mvc);
        initUi();
    }

    private void initUi() {
        mMessageView = findViewById(R.id.txt_message_view);
        mFirstNameEditText = findViewById(R.id.et_first_name);
        mLastNameEditText = findViewById(R.id.et_last_name);

        findViewById(R.id.btn_show_name).setOnClickListener(this);
        this.controllerMVC = new ControllerMVC();
    }

    @Override
    public void onClick(View v) {
        updateName();
    }

    private void updateName() {
        this.controllerMVC.setName(mFirstNameEditText.getText().toString(), mLastNameEditText.getText().toString());
        mMessageView.setText(controllerMVC.getName());
    }
}
