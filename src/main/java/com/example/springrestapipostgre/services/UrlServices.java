package com.example.springrestapipostgre.services;

import com.example.springrestapipostgre.entities.Url;
import com.example.springrestapipostgre.repositories.UrlRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlServices {
    private UrlRepositories urlRepositories;

    public UrlServices(UrlRepositories urlRepositories) {
        this.urlRepositories = urlRepositories;
    }

    public List<Url> UrlAll() {
        return urlRepositories.findAll();
    }

    public Url UrlAdd(Url url) {
//        System.out.println(url);
        urlRepositories.save(url);
        return url;
    }

    public List<Url> UrlByShort(String shortUrl) {
        System.out.println(shortUrl);
        return urlRepositories.findByShortUrl(shortUrl);
    }
}
