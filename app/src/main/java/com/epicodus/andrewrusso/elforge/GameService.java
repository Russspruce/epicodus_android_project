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
    public static void findGames(String gamename, Callback callback) {

        OkHttpClient client = new OkHttpClient.Builder().build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.GAME_DB_API_KEY).newBuilder();
        urlBuilder.addPathSegment(searchType);
        urlBuilder.addQueryParameter("query", searchParam);
        urlBuilder.addQueryParameter("api_key", Constants.GAME_DB_API_KEY);
        String url = urlBuilder.build().toString();
        Log.d("url", url);

        Request request = new Request.Builder().url(url).build();

        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    }
