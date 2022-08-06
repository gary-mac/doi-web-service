package com.example.doiwebservice.service;

import com.example.doiwebservice.repository.DoiDao;
import com.example.doiwebservice.domain.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoiService implements IDoiService {

    @Autowired
    private DoiDao doiDao;

    @Override
    public List<Root> getAllDois() {
        return doiDao.retrieveAllDois();
    }
}
