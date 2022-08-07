package com.example.doiwebservice.model;

import java.util.ArrayList;


public class Attributes {
    public String doi;
    public ArrayList<Object> identifiers;
    public ArrayList<Creator> creators;
    public ArrayList<Title> titles;
    public String publisher;
    public Container container;
    public int publicationYear;
    public ArrayList<Subject> subjects;
    public ArrayList<Object> contributors;

    public Object language;
    public Types types;
    public ArrayList<RelatedIdentifier> relatedIdentifiers;
    public ArrayList<String> sizes;
    public ArrayList<Object> formats;
    public Object version;
    public ArrayList<RightsList> rightsList;
    public ArrayList<Description> descriptions;
    public ArrayList<Object> geoLocations;
    public ArrayList<Object> fundingReferences;
    public String url;
    public Object contentUrl;
    public int metadataVersion;
    public String schemaVersion;
    public String source;
    public boolean isActive;
    public String state;
    public Object reason;
    public int viewCount;
    public int downloadCount;
    public int referenceCount;
    public int citationCount;
    public int partCount;
    public int partOfCount;
    public int versionCount;
    public int versionOfCount;
    public Object published;
}
