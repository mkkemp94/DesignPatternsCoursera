package com.example.designpatternscoursera.adapter;

import android.util.Log;

import com.example.designpatternscoursera.adapter.ouradapter.WebRequester;

public class WebClient {
    private WebRequester webRequester;

    public WebClient(WebRequester webRequester) {
        this.webRequester = webRequester;
    }

    private Object makeObject() {
        // Assume this does the work need to create object to send to webRequester
        return null;
    }

    public void doWork() {
        Object object = makeObject();
        int status = webRequester.request(object);

        if (status == 200) {
            Log.i("WebClient", "OK");
        } else {
            Log.i("WebClient", "Not OK");
        }
        return;
    }
}
