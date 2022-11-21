package com.example.springrestapipostgre.repositories;

import com.example.springrestapipostgre.entities.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepositories extends JpaRepository<Url, Long> {
    List<Url> findByShortUrl(String shortUrl);
}
