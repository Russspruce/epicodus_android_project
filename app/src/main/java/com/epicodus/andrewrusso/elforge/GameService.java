package com.epicodus.andrewrusso.elforge;

import android.util.Log;

import com.epicodus.andrewrusso.elforge.Constants;
import com.epicodus.andrewrusso.elforge.models.Game;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by andrewrusso on 7/8/16.
 */
public class GameService {
    public static void findGames(String searchType, String gameListTextView, Callback callback) {

        OkHttpClient client = new OkHttpClient.Builder().build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.GAME_DB_API_KEY).newBuilder();
        urlBuilder.addPathSegment(searchType);
        urlBuilder.addQueryParameter("query", gameListTextView);
        urlBuilder.addQueryParameter("api_key", Constants.GAME_DB_API_KEY);
        String url = urlBuilder.build().toString();
        Log.d("url", url);

        Request request = new Request.Builder().url(url).build();

        Call call = client.newCall(request);
        call.enqueue(callback);
    }

//    public ArrayList<Game> processResults(Response response) {
//        ArrayList<Game> games = new ArrayList<>();
//
//        try {
//            String jsonData = response.body().string();
//            if (response.isSuccessful()) {
//                JSONObject igdbJSON = new JSONObject(jsonData);
//                JSONArray gamesJSON = igdbJSON.getJSONArray("results");
//                for (int i = 0; i < gamesJSON.length(); i++) {
//                    JSONObject gameJSON = gamesJSON.getJSONObject(i);
//                    String name = gameJSON.getString("title");
//                    Game game = new Game(name);
//                    games.add(game);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        return games;
//    }

}