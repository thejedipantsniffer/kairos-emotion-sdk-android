/*
 * KairosEmotionAPILib
 *
 * This file was automatically generated for kairos by APIMATIC BETA v2.0 on 01/15/2016
 */
package com.kairos.api;
 
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class Configuration {
    //The base Uri for API calls
    public static String baseUri = "https://api.kairos.com";

    //retains status whether we have already initialized
    private static boolean initialized = false;
    private static RequestQueue requestQueue = null;

    //Initialization of configuration
    public static void initialize(Context context){
        if(initialized)
            throw new IllegalStateException("Already initialized");
        requestQueue = Volley.newRequestQueue(context);
    
        initialized = true;
    }

	// volley request queue needs to be initialized before use
    public static RequestQueue getRequestQueue() {
        if(!initialized)
            throw new IllegalStateException("Must initialize before accessing request queue");
        return requestQueue;
    }

    //Content Type
    //TODO: Replace the contentType with an appropriate value
    public static String contentType = "application/json";

    //Application ID
    //TODO: Replace the appId with an appropriate value
    public static String appId = "TODO: Replace";

    //Application Key
    //TODO: Replace the appKey with an appropriate value
    public static String appKey = "TODO: Replace";

}
