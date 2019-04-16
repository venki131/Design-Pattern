package com.example.learningrd;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.learningrd.MVP.view.PersonName;

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

    public void asyncTaskDemo(final String message) {
        AsyncTask<Void, Void, Boolean> sendThread = new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected Boolean doInBackground(Void... voids) {

                Log.d("Connection Service", "Sending : " + message);
                return null;
            }
        };
        sendThread.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    private void turnGPSOn() {
        String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);

        if (!provider.contains("gps")) { //if gps is disabled
            final Intent poke = new Intent();
            poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
            poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
            poke.setData(Uri.parse("3"));
            sendBroadcast(poke);
            Log.d("inside GPS", "true");
        }
    }

    private void turnGPSOff() {
        String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);

        if (provider.contains("gps")) { //if gps is enabled
            final Intent poke = new Intent();
            poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
            poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
            poke.setData(Uri.parse("3"));
            sendBroadcast(poke);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_mvc:
                break;
            case R.id.btn_mvp:
                Intent intent = new Intent(this, PersonName.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            case R.id.btn_mvvm:
                break;
        }
    }
}
