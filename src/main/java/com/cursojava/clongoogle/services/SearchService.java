package com.cursojava.clongoogle.services;

import com.cursojava.clongoogle.entities.WebPage;
import com.cursojava.clongoogle.repositories.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    //Fields
    @Autowired
    private SearchRepository searchRepository;

    public List<WebPage> search(String textSearch){
        return searchRepository.search(textSearch);
    }
}
