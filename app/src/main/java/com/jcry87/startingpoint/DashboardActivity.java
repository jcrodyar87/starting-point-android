package com.jcry87.startingpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnTermsAndConditions = findViewById(R.id.btnTermsAndConditions);
        btnLogin.setOnClickListener(this);
        btnTermsAndConditions.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnLogin:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.btnTermsAndConditions:
                startActivity(new Intent(this, TermsAndConditionsActivity.class));
                break;
        }
    }
}