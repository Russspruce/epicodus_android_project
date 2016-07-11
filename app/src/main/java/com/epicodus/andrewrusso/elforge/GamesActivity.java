package com.epicodus.andrewrusso.elforge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

//public ArrayList<Game> mGames = new ArrayList<>();

public class GamesActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.gamesListButton) Button mGamesListButton;
    @Bind(R.id.gamename) EditText mGamename;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_games);
            ButterKnife.bind(this);

            mGamesListButton.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (v == mGamesListButton) {
                String gamename = mGamename.getText().toString();
                Intent intent = new Intent(GamesActivity.this,GameSearchListActivity.class);
                intent.putExtra("gamename", gamename);
                startActivity(intent);


            }
        }

    }