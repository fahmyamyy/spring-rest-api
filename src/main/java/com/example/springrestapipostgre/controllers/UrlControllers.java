package com.example.springrestapipostgre.controllers;

import com.example.springrestapipostgre.entities.Url;

import com.example.springrestapipostgre.helpers.Helpers;
import com.example.springrestapipostgre.services.UrlServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/url")
public class UrlControllers {
    private UrlServices urlServices;

    @GetMapping
    public ResponseEntity<Object> urlAll() {
        long startTime = System.currentTimeMillis();
        try {
            List<Url> result = urlServices.UrlAll();
            return Helpers.generateResponse(
                    HttpStatus.OK,
                    "OK",
                    Helpers.elapsedTime(startTime),
                    result.size(),
                    result
            );
        } catch (Exception e) {
            return Helpers.generateResponse(
                    HttpStatus.MULTI_STATUS,
                    e.getMessage(),
                    Helpers.elapsedTime(startTime),
                    0,
                    null
            );
        }
    }

    @PostMapping
    public ResponseEntity<Object> UrlAdd(@RequestBody Url url) {
        Long startTime = System.currentTimeMillis();
        try {
            Url result = urlServices.UrlAdd(url);
            return Helpers.generateResponse(
                    HttpStatus.OK,
                    "OK",
                    Helpers.elapsedTime(startTime),
                    1,
                    result
            );
        } catch (Exception e) {
            return Helpers.generateResponse(
                    HttpStatus.MULTI_STATUS,
                    e.getMessage(),
                    Helpers.elapsedTime(startTime),
                    0,
                    null
            );
        }
    }

    @GetMapping("{shortUrl}")
    public ResponseEntity<Object> urlUpdate(@PathVariable String shortUrl) {
        Long startTime = System.currentTimeMillis();
//        System.out.println(shortUrl);
        try {
            List<Url> result = urlServices.UrlByShort(shortUrl);
                    System.out.println(result.toString());
            return Helpers.generateResponse(
                    HttpStatus.OK,
                    "OK",
                    Helpers.elapsedTime(startTime),
                    1,
                    result
            );
        } catch (Exception e) {
            return Helpers.generateResponse(
                    HttpStatus.MULTI_STATUS,
                    e.getMessage(),
                    Helpers.elapsedTime(startTime),
                    0,
                    null
            );
        }
    }
}
