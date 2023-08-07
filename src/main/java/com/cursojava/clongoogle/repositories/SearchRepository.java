package com.cursojava.clongoogle.repositories;

import com.cursojava.clongoogle.entities.WebPage;

import java.util.List;

public interface SearchRepository {
    List<WebPage> search(String textSearch);
}
