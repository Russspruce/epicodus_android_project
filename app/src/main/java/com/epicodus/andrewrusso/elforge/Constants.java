package com.epicodus.andrewrusso.elforge;

/**
 * Created by andrewrusso on 7/8/16.
 */
public class Constants {
    public static final String GAME_DB_API_KEY = BuildConfig.GAME_DB_API_KEY;
    public static final String GAME_NAME_TITLE = "gamename";
    public static final String GAME_BASE_URL = "http://www.giantbomb.com/api/search/?api_key="+GAME_DB_API_KEY+ "&format=json&query="+GAME_NAME_TITLE+"&resources=game";
}
