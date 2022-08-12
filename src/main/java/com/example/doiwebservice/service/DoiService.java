package com.example.doiwebservice.service;

import com.example.doiwebservice.model.Data;
import com.example.doiwebservice.model.DoiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class DoiService implements IDoiService {

    @Autowired
    private @Value("${common.urlBasePath}") String apiEndpoint;

    public ResponseEntity<ArrayList<Data>> requestAllDois() {
        RestTemplate restTemplate = new RestTemplate();
		DoiModel obj = restTemplate.getForObject(apiEndpoint + "/dois", DoiModel.class);
        return new ResponseEntity<>(obj.getData(), HttpStatus.OK);
    }

}
