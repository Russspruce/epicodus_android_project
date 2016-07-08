package com.epicodus.andrewrusso.elforge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind (R.id.loginButton) Button mLoginButton;
    @Bind (R.id.usernameText) EditText mUsernameText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mLoginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == mLoginButton) {
            String username = mUsernameText.getText().toString();
            Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);


        }
    }
}

