package com.example.springrestapipostgre.helpers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.LinkedHashMap;
import java.util.Map;

public class Helpers {
    public static String elapsedTime(Long startTime) {
        Long countedTime = System.currentTimeMillis() - startTime;
        String estimatedTime = countedTime.toString() + "ms";
        return estimatedTime;
    }
    public static ResponseEntity<Object> generateResponse(HttpStatus status, String message, String time, Integer count, Object responseObj) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("status", status.value());
        map.put("message", message);
        map.put("time", time);
        map.put("count", count);
        map.put("data", responseObj);

        return new ResponseEntity<Object>(map,status);
    }
}
