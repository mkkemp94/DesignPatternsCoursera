package com.example.designpatternscoursera.adapter.ouradapter;

import com.example.designpatternscoursera.adapter.thirdparty.WebService;

import org.json.JSONObject;

public class WebAdapter implements WebRequester {

    private WebService service;

    public void connect(WebService currentService) {
        this.service = currentService;
    }

    @Override
    public int request(final Object request) {
        JSONObject result = this.toJson(request);
        JSONObject response = service.request(result);
        if (response != null)
            return 200; // OK Status code
        return 500; // Server error status code
    }

    private JSONObject toJson(final Object input) {
        // Pretend this has logic to turn any object into json
        return null;
    }
}
