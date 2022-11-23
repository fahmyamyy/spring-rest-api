package com.example.springrestapipostgre.services;

import com.example.springrestapipostgre.entities.Url;
import com.example.springrestapipostgre.repositories.UrlRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlServices {
    private UrlRepositories urlRepositories;

    @Autowired
    public UrlServices(UrlRepositories urlRepositories) {
        this.urlRepositories = urlRepositories;
    }

    public List<Url> UrlAll() {
        return urlRepositories.findAll();
    }

    public Url UrlAdd(Url url) {
        return urlRepositories.save(url);
    }

    public List<Url> FindByShortUrl(String shortUrl) {
        return urlRepositories.findByShortUrl(shortUrl);
    }
}
