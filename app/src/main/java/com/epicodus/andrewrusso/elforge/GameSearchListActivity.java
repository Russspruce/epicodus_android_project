package com.epicodus.andrewrusso.elforge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class GameSearchListActivity extends AppCompatActivity {
    public static final String TAG = RestaurantsActivity.class.getSimpleName();

    @Bind(R.id.gameListTextView) TextView mGameListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_search_list);
        ButterKnife.bind(this);
    }

    Intent intent = getIntent();
    String gamename = intent.getStringExtra("gamename");

    getGames("query", gamename);

    private void getGames(String gamename) {
        final GameService gameService = new GameService();
        gameService.findGames(mGameListTextView, new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//
//                GameSearchListActivity.this.runOnUiThread(new Runnable() {
//
//                    @Override
//                    public void run() {
//
//                    }
//                }

            });
        }
}
