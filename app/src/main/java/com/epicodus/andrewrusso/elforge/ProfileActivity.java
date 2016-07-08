package com.epicodus.andrewrusso.elforge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity {
    @Bind (R.id.usernameTextView) TextView mUsernameTextView;

    @Bind (R.id.gameSearchButton) Button mGameSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

    mGameSearchButton= (Button) findViewById(R.id.gameSearchButton);
        mGameSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, GamesActivity.class);
                startActivity(intent);
            }
        });


    Intent intent = getIntent();
    String username = intent.getStringExtra("username");

    mUsernameTextView.setText("Welcome back, " + username +"!");
}

//    @Override
//    public void onClick(View v) {
//        if (v == mGameSearchButton) {
//            Intent intent = new Intent(ProfileActivity.this, GamesActivity.class);
//            startActivity(intent);
//
//
//        }
//    }
}
