package com.example.springrestapipostgre.helpers;

import org.json.JSONObject;

public class Handlers {
    public String errorDetail(Object e) {
        JSONObject err = new JSONObject(e);

        return err.get("message").toString();
    }
}
