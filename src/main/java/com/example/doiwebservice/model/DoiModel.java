package com.example.doiwebservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DoiModel {

    public ArrayList<Data> data;
    public Meta meta;
    public Links links;

    public ArrayList<Data> getData() {
        return data;
    }

}
