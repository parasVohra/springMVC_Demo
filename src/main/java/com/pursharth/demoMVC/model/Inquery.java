package com.pursharth.demoMVC.model;

public class Inquery {
    private String searchString;

    public Inquery(String searchString) {
        this.searchString = searchString;
    }

    public Inquery() {
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
