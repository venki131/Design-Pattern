package com.example.designpattern.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.designpattern.mvp.presenter.SayHelloPresenter;
import com.example.designpattern.mvp.util.Contract;
import com.example.designpattern.R;

/**
 * @Venkatesh on 15/April/2019
 */
public class PersonNameMVP extends AppCompatActivity implements Contract.View, View.OnClickListener {

    private Contract.Presenter presenter;
    //UI properties
    private TextView mMessageView;
    private EditText mFirstNameEditText;
    private EditText mLastNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_name_mvp);
        initView();

        //creates a presenter
        presenter = new SayHelloPresenter(this);
    }

    private void initView() {
        mMessageView = findViewById(R.id.txt_message_view);
        mFirstNameEditText = findViewById(R.id.et_first_name);
        mLastNameEditText = findViewById(R.id.et_last_name);

        findViewById(R.id.btn_show_name).setOnClickListener(this);
    }

    private void updateName() {
        presenter.saveName(mFirstNameEditText.getText().toString(), mLastNameEditText.getText().toString());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_show_name :
                updateName();
                presenter.loadMessage();
                break;
        }
    }

    @Override
    public void showMessage(String message) {
        mMessageView.setText(message);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();
    }
}
