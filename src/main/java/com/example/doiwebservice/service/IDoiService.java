package com.example.doiwebservice.service;

import com.example.doiwebservice.model.Data;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

public interface IDoiService {
    public ResponseEntity<ArrayList<Data>> requestAllDois();
}
